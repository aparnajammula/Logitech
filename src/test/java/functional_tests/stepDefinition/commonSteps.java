package functional_tests.stepDefinition;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functional_tests.automationFramework.CommonFunctions;
import functional_tests.automationFramework.Framework;
import functional_tests.automationFramework.UrlConfiguration;


import java.util.List;

import static org.testng.Assert.assertTrue;

public class commonSteps  extends Framework {

    boolean HeadlessDriverFlag;

    @Given("^User is on (.*) Page$")
    public void Page(String strPage) throws Throwable {
        navigate(strPage);
    }

    @Then("^the following elements of the \"(.*?)\" should be displayed$")
    public void validate_elements(String page, List<String> elements) throws Throwable {
        Class classToValidate = Class.forName("functional_tests.pages." + page);
        Object pageToValidate = classToValidate.newInstance();
        CommonFunctions cf = new CommonFunctions();
        assertTrue(cf.validateElements(pageToValidate, elements));
    }

    @And("^resize the browser to (.*) viewport$")
    public void setViewportSize(String viewportSize){

        if (viewportSize.equals("Small")) {
            Framework.resizeToMobile();
        } else if (viewportSize.equals("Medium")) {
            Framework.resizeToTablet();
        }
    }

    // Validate All Pages Methods (HTTP status code, FreeMarket and Global Error Container)
    String strUrl;
    int intStatusCode;


    @Then("^the HTML status code should be (\\d+)$")
    public void checkResponseCode(int intExpectedStatusCode) throws Throwable {
        intStatusCode = CommonFunctions.getResponseCode(strUrl);
        assertTrue(CommonFunctions.validateResponseCode(intStatusCode, intExpectedStatusCode, strUrl));
    }

    @And("^there should not be an application error$")
    public void checkAppError() throws Throwable {
        assertTrue(CommonFunctions.checkErrorContainer(strUrl));
    }
    //-------------------------------------------------------------------------------------

   @After
    public void cleanup(){
        driverquit(HeadlessDriverFlag);
    }


}
