Feature: PDP New page

  Scenario: View all elements on PDP Page
    Given User is on pdp Page
    Then the following elements of the "pdp" should be displayed
    |Features Portable|
    |Features Durable |
    |Features Video   |
    |TechSpecs Header |
    |Support Headline |
    |Support Button   |
    |Quote            |
    |RelatedProducts Headline|
    |RelatedProducts Carousel|
