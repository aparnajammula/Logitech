package functional_tests.pages;

import functional_tests.automationFramework.Framework;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ajammula on 7/16/15.
 */
public class compare extends Framework {

    //Header

    @FindBy(css = "div.nav.container div > div > h6 > a")private WebElement SeeAll;
    public  WebElement See_All(){return SeeAll;}

    //Compare Tiles

    @FindBy(css = "#compare-product-tiles > div > div:nth-child(4) > div.compare-product-name")private WebElement ProductName;
    public  WebElement Product_Name(){return ProductName;}

    @FindBy(css = "#compare-product-tiles > div > div:nth-child(4) > div.compare-product-price sup")private WebElement ProductPrice;
    public  WebElement Product_Price(){return ProductPrice;}

    @FindBy(css = "#compare-product-tiles > div > div:nth-child(3) > div.compare-product-price > span")private WebElement ProductDisclaimer;
    public  WebElement Product_Disclaimer(){return ProductDisclaimer;}

    @FindBy(css = "#compare-product-tiles > div > div:nth-child(3) > a")private WebElement ProductLearnmore;
    public  WebElement Product_Learnmore(){return ProductLearnmore;}

    @FindBy(css = "#compare-product-tiles div:nth-child(4) div.col-lg-12.compare-product-image.purple-bg a img")private WebElement ProductImage;
    public  WebElement Product_Image(){return ProductImage;}

    @FindBy(css = "#compare-product-tiles > div > div:nth-child(4) > div.col-lg-12.compare-product-image.purple-bg > div")private WebElement ProductClose;
    public  WebElement Product_Close(){return ProductClose;}


    // Grid

    @FindBy(css = "div.row.compare-feature-grid > div:nth-child(1) > div.grid-header-title span.triangle-down.glyphicon.glyphicon-triangle-bottom")private WebElement AllFeatures;
    public  WebElement AllFeatures(){return AllFeatures;}

    @FindBy(css = "#toggleFeatures > div:nth-child(1) > div.col-lg-3.compare-feature-name")private WebElement AllFeaturesFeatureName;
    public  WebElement AllFeatures_FeatureName(){return AllFeaturesFeatureName;}

    @FindBy(css = "#toggleFeatures > div:nth-child(1) > div.col-lg-2.compare-feature-checked.product-column-0 > div.svg-check")private WebElement AllFeaturesFeatureChecked;
    public  WebElement AllFeatures_FeatureChecked(){return AllFeaturesFeatureChecked;}

    @FindBy(css = "div.row.compare-feature-grid > div:nth-child(3) > div.grid-header-title span.triangle-down.glyphicon.glyphicon-triangle-bottom")private WebElement TechSpecs;
    public  WebElement TechSpecs(){return TechSpecs;}

    @FindBy(css = "#toggleSpecs > div:nth-child(1) > div.col-lg-3.compare-feature-name")private WebElement TechSpecsName;
    public  WebElement TechSpecs_Name(){return TechSpecsName;}

    @FindBy(css = "#toggleSpecs > div:nth-child(1) > div.col-lg-2.compare-feature-checked.product-column-0 > div")private WebElement TechSpecsChecked;
    public  WebElement TechSpecs_Checked(){return TechSpecsChecked;}


}
