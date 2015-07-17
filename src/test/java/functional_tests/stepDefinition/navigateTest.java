package functional_tests.stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import static org.testng.Assert.*;

import functional_tests.automationFramework.Framework;
import functional_tests.pages.navigation;
import org.openqa.selenium.*;

/**
 * Created by ajammula on 7/15/15.
 */
public class navigateTest extends Framework {
    @Then("^Logo is displayed$")
    public void Logo_is_displayed() throws Throwable {
        navigation NA = new navigation();
        assertTrue(NA.Logo().isDisplayed());
    }

    @Then("^Scroll down on the page$")
    public void Scroll_down_on_the_page() throws Throwable {
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        SaveScreenShot("page");
    }

    @And("^verify hamburger nav is displayed$")
    public void verify_hamburger_nav_is_displayed() throws Throwable {
        navigation NA = new navigation();
        assertTrue(NA.Nav_Icon().isDisplayed());
    }

    @Then("^verify user is able to successfully subscribe to newsletter$")
    public void verify_user_is_able_to_successfully_subscribe_to_newsletter() throws Throwable {
        navigation NA = new navigation();
        NA.Newsletter_TextBox().sendKeys("asdf@ghjk.com");
        NA.Newsletter_Submit().click();
        assertTrue(NA.Newsletter_Confirmation().isDisplayed());
    }

    @Then("^Error is displayed on entering an invalid email$")
    public void Error_is_displayed_on_entering_an_invalid_email() throws Throwable {
        navigation NA = new navigation();
        NA.Newsletter_TextBox().sendKeys("asdf");
        NA.Newsletter_Submit().click();
        assertTrue(NA.Newsletter_Error().isDisplayed());
    }

}
