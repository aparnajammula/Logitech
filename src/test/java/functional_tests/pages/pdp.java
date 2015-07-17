package functional_tests.pages;

import functional_tests.automationFramework.Framework;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ajammula on 7/16/15.
 */
public class pdp extends Framework{

    // Hero


    // Features

    @FindBy(css = "div.product-features-container ul.features-list li")private WebElement FeaturesList;
    public  WebElement Features_List(){return FeaturesList;}

    @FindBy(css = "ul.features-list li:nth-child(2) h3")private WebElement FeaturesDurable;
    public  WebElement Features_Durable(){return FeaturesDurable;}

    @FindBy(css = "ul.features-list li:nth-child(1) h3")private WebElement FeaturesPortable;
    public  WebElement Features_Portable(){return FeaturesPortable;}

    @FindBy(css = "ul.features-list li:nth-child(2) div img")private WebElement FeaturesImage;
    public  WebElement Features_Image(){return FeaturesImage;}

    @FindBy(css = "ul.features-list li:nth-child(1) div a[data-target='#video-01']")private WebElement FeaturesVideo;
    public  WebElement Features_Video(){return FeaturesVideo;}

    // Tech Specs

    @FindBy(css = "div.tech-specs-header h6")private WebElement TechSpecsHeader;
    public  WebElement TechSpecs_Header(){return TechSpecsHeader;}

    @FindBy(css = "ul.tech-specs-details li:nth-child(1) h4.spec-label")private WebElement TechSpecsLabel;
    public  WebElement TechSpecs_Label(){return TechSpecsLabel;}

    @FindBy(css = "ul.tech-specs-details li:nth-child(1) div.details-description")private WebElement TechSpecsDescription;
    public  WebElement TechSpecs_Description(){return TechSpecsDescription;}

    @FindBy(css = "button.modal-button")private WebElement Visual;
    public  WebElement Visual(){return Visual;}

    @FindBy(css = "div.modal-content div.modal-headline")private WebElement VisualOverlay;
    public  WebElement Visual_Overlay(){return VisualOverlay;}

    @FindBy(css = "button.close")private WebElement VisualClose;
    public  WebElement Visual_Close(){return VisualClose;}


    // Support

    @FindBy(css = "div.product-support h3")private WebElement SupportHeadline;
    public  WebElement Support_Headline(){return SupportHeadline;}

    @FindBy(css = "button.btn-tech-support")private WebElement SupportButton;
    public  WebElement Support_Button(){return SupportButton;}

    // Quote

    @FindBy(css = "div.tech-quote blockquote")private WebElement Quote;
    public  WebElement Quote(){return Quote;}

    // Related Products

    @FindBy(css = "div.related-products.container h3")private WebElement RelatedProductsHeadline;
    public  WebElement RelatedProducts_Headline(){return RelatedProductsHeadline;}

    @FindBy(css = "div.related-products.container div.owl-carousel")private WebElement RelatedProductsCarousel;
    public  WebElement RelatedProducts_Carousel(){return RelatedProductsCarousel;}


}
