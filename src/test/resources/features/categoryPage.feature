Feature: Category Page

  Scenario:View all elements on category page
    Given User is on Category Page
    Then the following elements of the "category" should be displayed
    |Header Title|
    |Header Prefix|
    |Num Showing  |
    |Product Image2  |
    |Product Title  |
    |Learn More     |
    |Pre Order      |
    |Category Filter|
    |Sort Filter    |


   Scenario: Dropdowns work
     Given User is on Category Page
     Then Verify that dropdowns are usable


   Scenario: Product Grid
     Given User is on Category Page
     And select a category
     And Hover on product image
     Then the following elements of the "category" should be displayed
     |Product Title|
     |Product MSRP |
     |Product Swatch|
     |Product Description|
     |Product Disclaimer |
     |Compare Checkbox   |
     |Compare Label1      |



  Scenario: Compare button is displayed
    Given User is on Category Page
    And select a category
    Then Verify that user can go to compare page















