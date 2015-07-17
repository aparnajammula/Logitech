package functional_tests.automationFramework;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.*;
import static org.testng.Assert.*;
import functional_tests.automationFramework.Framework;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import javax.xml.bind.DatatypeConverter;


public class CommonFunctions extends Framework {


//ToDo Helper Methods

    public String strGetUrl(){
        //Returns browser's current URL
        String value = driver.getCurrentUrl();
        return value;
    }


    public void ScreenResize(String strScreenSize){
        //Sets screen size to a given dimension. Expected format int x int, eg 800x600 or keyword maximized
        if (strScreenSize.equalsIgnoreCase("maximize")){
            driver.manage().window().maximize();
        }
        else{
            System.out.println(" Setting screen size to:" + strScreenSize );
            Dimension dimScreenSize = new Dimension(Integer.parseInt(strScreenSize.split("x")[0]),Integer.parseInt(strScreenSize.split("x")[1]));
            driver.manage().window().setSize(dimScreenSize);
        }
    }

    public String getCurrentTime(String strTimeFormat){
        Calendar calendar = Calendar.getInstance();
        calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat(strTimeFormat);
        String strDateValue = dateFormat.format(calendar.getTime());
        System.out.println(strDateValue);
        return strDateValue;
    }

    // Validate all <elements> of a <page> ----------------------------------
    public boolean validateElements (Object page, List<String> elements) {
        boolean allElements;
        ArrayList<String> elementsNotFound = new ArrayList<String>();
        for (String element: elements)
        {
            try
            {
                element = element.replace(' ','_');
                Method m = page.getClass().getMethod(element);
                WebElement siteElement = (WebElement) m.invoke(page);
                assertTrue(siteElement.isDisplayed());
            }
            catch (Exception e)
            {
                elementsNotFound.add(element + " not found");
            }
        }
        if (elementsNotFound.size() != 0)
        {
            for(String element: elementsNotFound) {
                element = element.replace('_',' ');
                System.out.println(element);
            }
            allElements = false;
            return allElements;
        }
        else
        {
            allElements = true;
            return allElements;
        }
    }
    //-----------------------------------------------------------------------

    //Smoke Test - Navigate Pages, check html status code -------------------
    public static int getResponseCode(String strUrl){
        try
        {
            WebClient wc = new WebClient();
            setCredentials(wc);
            wc.getOptions().setJavaScriptEnabled(false);
            wc.getOptions().setThrowExceptionOnScriptError(false);
            wc.getOptions().setCssEnabled(false);
            wc.getOptions().setThrowExceptionOnFailingStatusCode(false);
            wc.getOptions().setThrowExceptionOnScriptError(false);
            wc.getOptions().setPrintContentOnFailingStatusCode(false);
            int responseCode = wc.getPage(strUrl).getWebResponse().getStatusCode();
            return responseCode;
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static boolean validateResponseCode(int intResponseCode, int intExpectedResponseCode, String strUrl){
        System.out.println();
        boolean ResponseCode = false;
        if (intResponseCode == intExpectedResponseCode)
            ResponseCode = true;
        System.out.println(strUrl + " Status Code: " + intResponseCode);
        return ResponseCode;
    }

    private static void setCredentials(WebClient webClient) {
        String username = "scion-user";
        String password = "chang3it";
        String base64encodedUsernameAndPassword = base64Encode(username + ":" + password);
        webClient.addRequestHeader("Authorization", "Basic " + base64encodedUsernameAndPassword);
    }

    private static String base64Encode(String stringToEncode) {
        return DatatypeConverter.printBase64Binary(stringToEncode.getBytes());
    }

    public static boolean checkFreeMarketError(String url){
        HtmlUnitDriver ud = new HtmlUnitDriver();
        ud.setJavascriptEnabled(true);
        ud.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        ud.get(url);
        Boolean error = ud.findElements(By.xpath("//*[contains(text(),'FreeMarker')]")).size() > 0;
        if (error)
        {
            System.out.println(url + "    FreeMarker template error found");
            return false;
        }
        else
        {
            return true;
        }
    }

    public static boolean checkErrorContainer(String url){
        try {
            WebClient wc = new WebClient();
            setCredentials(wc);
            wc.getOptions().setJavaScriptEnabled(false);
            wc.getOptions().setThrowExceptionOnScriptError(false);
            wc.getOptions().setCssEnabled(false);
            wc.getOptions().setThrowExceptionOnFailingStatusCode(false);
            wc.getOptions().setThrowExceptionOnScriptError(false);
            wc.getOptions().setPrintContentOnFailingStatusCode(false);
            HtmlPage page = wc.getPage(url);
            String strPageTitle = page.getTitleText();
            if (strPageTitle.equals("Application Error")) {
                return false;
            }
            else {
                return true;
            }
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
    //-----------------------------------------------------------------------
}

