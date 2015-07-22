package functional_tests.stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import functional_tests.automationFramework.Framework;
import functional_tests.pages.category;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import static org.testng.Assert.*;

/**
 * Created by ajammula on 7/16/15.
 */
public class categoryPage extends Framework{

    category CP = new category();

    @Then("^Verify that dropdowns are usable$")
    public void Verify_that_dropdowns_are_usable() throws Throwable {
        CP.Category_Filter().click();
        assertTrue(CP.Category_Dropdown().size() > 5);
        CP.Category_Mice().click();
        CP.Filterby_Filter().click();
        assertTrue(CP.Filterby_Dropdown().size() > 5);
        CP.Filterby_Wireless().click();
        CP.Sort_Filter().click();
        assertTrue(CP.Sort_Dropdown().size() >= 3);
        CP.Sort_Price().click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        assertTrue(CP.Product_Image().isDisplayed());

    }

    @And("^select a category$")
    public void select_a_category() throws Throwable {
        CP.Category_Filter().click();
        CP.Category_Mice().click();

    }

    @Then("^Hover on product image$")
    public void Hover_on_product_image() throws Throwable {
        hover(CP.Product_Image1());
        WebDriverWait wait = new WebDriverWait(driver, 10);
       // SaveScreenShot("image1");
    }

    @Then("^Verify that user can go to compare page$")
    public void Verify_that_user_can_go_to_compare_page() throws Throwable {

        hover(CP.Product_Image2());
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", CP.Compare_Label1());
        //CP.Compare_Checkbox2().click();
        hover(CP.Product_Image1());
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", CP.Compare_Label2());
        assertEquals("COMPARE (2)", CP.Compare_Button().getText());
        CP.Compare_Button().click();
        assertTrue(driver.getCurrentUrl().endsWith("compare.html"));

    }
}
