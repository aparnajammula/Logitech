package functional_tests.pages;

import functional_tests.automationFramework.Framework;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ajammula on 7/15/15.
 */
public class navigation extends Framework {

    @FindBy(css = "#nav-icon")private WebElement NavIcon;
    public  WebElement Nav_Icon(){return NavIcon;}

    @FindBy(id = "logo-container")private WebElement Logo;
    public  WebElement Logo(){return Logo;}

    @FindBy(css = "div.utility-nav.pull-right")private WebElement UtilityNav;
    public  WebElement Utility_Nav(){return UtilityNav;}

    @FindBy(css = "#subnav div a:nth-child(1)")private WebElement SubNav;
    public  WebElement Sub_Nav(){return SubNav;}

    @FindBy(css = "ul.social-links li a img")private WebElement SocialLinks;
    public  WebElement Social_Links(){return SocialLinks;}

    @FindBy(css = "#footer-links div a")private WebElement Links;
    public  WebElement Links(){return Links;}

    @FindBy(css = "div.row.copyright > p")private WebElement Copyright ;
    public  WebElement Copyright(){return Copyright;}

    @FindBy(css = "#dk0")private WebElement LanguageSelector;
    public  WebElement Language_Selector(){return LanguageSelector;}

    @FindBy(css = "div.country div.name")private WebElement CountrySelector;
    public  WebElement Country_Selector(){return CountrySelector;}

    @FindBy(css = "#newsletter-email")private WebElement NewsletterTextBox;
    public  WebElement Newsletter_TextBox(){return NewsletterTextBox;}

    @FindBy(css = "#submit-button")private WebElement NewsletterSubmit;
    public  WebElement Newsletter_Submit(){return NewsletterSubmit;}

    @FindBy(css = "div.social-newsletter-container div div.newsletter-message")private WebElement NewsletterConfirmation;
    public  WebElement Newsletter_Confirmation(){return NewsletterConfirmation;}

    @FindBy(css = "#newsletter-email-error")private WebElement NewsletterError;
    public  WebElement Newsletter_Error(){return NewsletterError;}

}
