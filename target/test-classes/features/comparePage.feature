Feature: Compare Page

  Scenario: View all elements on category page
    Given User is on compare Page
    Then the following elements of the "compare" should be displayed
    |See All           |
    |Product Name      |
    |Product Price     |
    |Product Disclaimer|
    |Product Image     |
    |Product Close     |
    |AllFeatures       |
    |TechSpecs         |