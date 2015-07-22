package functional_tests.pages;

import functional_tests.automationFramework.Framework;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

/**
 * Created by ajammula on 7/15/15.
 */
public class category extends Framework {

    @FindBy(css = "#inner h1 span.h1-main")private WebElement HeaderTitle;
    public  WebElement Header_Title(){return HeaderTitle;}

    @FindBy(css = "#inner h1 span.prefix")private WebElement HeaderPrefix;
    public  WebElement Header_Prefix(){return HeaderPrefix;}

    @FindBy(css = "#inner h1 span.prefix")private WebElement NumShowing;
    public  WebElement Num_Showing(){return NumShowing;}

    //Filters

    @FindBy(css = "#category-tab")private WebElement CategoryFilter;
    public  WebElement Category_Filter(){return CategoryFilter;}

    @FindBy(css = "#sort-by-tab > span.tab-label")private WebElement SortFilter;
    public  WebElement Sort_Filter(){return SortFilter;}

    @FindBy(css = "#filter-by-tab > span.triangle-down.glyphicon")private WebElement FilterbyFilter;
    public  WebElement Filterby_Filter(){return FilterbyFilter;}

    @FindBy(css = "#category-list ul li")private List<WebElement> CategoryDropdown;
    public  List<WebElement> Category_Dropdown(){return CategoryDropdown;}

    @FindBy(css = "#category-list ul li:nth-child(2)")private WebElement CategoryMice;
    public  WebElement Category_Mice(){return CategoryMice;}

    @FindBy(css = "#sort-by-list li")private List<WebElement> SortDropdown;
    public  List<WebElement> Sort_Dropdown(){return SortDropdown;}

    @FindBy(css = "#sort-by-list li:nth-child(3)")private WebElement SortPrice;
    public  WebElement Sort_Price(){return SortPrice;}

    @FindBy(css = "#filter-by-list li:nth-child(1) ul li")private List<WebElement> FilterbyDropdown;
    public  List<WebElement> Filterby_Dropdown(){return FilterbyDropdown;}

    @FindBy(css = "#f31")private WebElement FilterbyWireless;
    public  WebElement Filterby_Wireless(){return FilterbyWireless;}

    // Category Tiles

    @FindBy(css = "#products-grid > a:nth-child(12) > div.product-image.yellow-green-bg")private WebElement ProductImage;
    public  WebElement Product_Image(){return ProductImage;}

    @FindBy(css = "#products-grid a:nth-child(3) div.product-image.yellow-green-bg")private WebElement ProductImage1;
    public  WebElement Product_Image1(){return ProductImage1;}


    @FindBy(css = "#products-grid > a:nth-child(6) > div.product-image.red-bg")private WebElement ProductImage2;
    public  WebElement Product_Image2(){return ProductImage2;}

    @FindBy(css = "#products-grid div.product-info span.product-name")private WebElement ProductTitle;
    public  WebElement Product_Title(){return ProductTitle;}

    @FindBy(css = "#products-grid div.product-info span.price sup")private WebElement ProductMSRP;
    public  WebElement Product_MSRP(){return ProductMSRP;}

    @FindBy(css = "#products-grid a:nth-child(3) span.product-description")private WebElement ProductDescription;
    public  WebElement Product_Description(){return ProductDescription;}

    @FindBy(css = "#products-grid a:nth-child(3) ul.color-swatches li")private WebElement ProductSwatch;
    public  WebElement Product_Swatch(){return ProductSwatch;}

    @FindBy(css = "#products-grid > a:nth-child(2) span.disclaimer")private WebElement ProductDisclaimer;
    public  WebElement Product_Disclaimer(){return ProductDisclaimer;}

    @FindBy(css = "#products-grid a button")private WebElement LearnMore;
    public  WebElement Learn_More(){return LearnMore;}

    @FindBy(css = "#products-grid div.pre-order")private WebElement PreOrder;
    public  WebElement Pre_Order(){return PreOrder;}

    // Compare
    @FindBy(css = "#products-grid > a:nth-child(3) div.compare-checkbox-group > label")private WebElement CompareLabel1;
    public  WebElement Compare_Label1(){return CompareLabel1;}

    @FindBy(css = "#products-grid > a:nth-child(6) div.compare-checkbox-group > label")private WebElement CompareLabel2;
    public  WebElement Compare_Label2(){return CompareLabel2;}

    @FindBy(css = "#products-grid  #cb_002")private WebElement CompareCheckbox;
    public  WebElement Compare_Checkbox(){return CompareCheckbox;}

    @FindBy(css = "#compare-choices-btn")private WebElement CompareButton;
    public  WebElement Compare_Button(){return CompareButton;}

    @FindBy(css = ".hero-title")private WebElement CompareHeadline;
    public  WebElement Compare_Headline(){return CompareHeadline;}











}
