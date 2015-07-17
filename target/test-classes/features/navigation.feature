Feature: Navigation

  Scenario: View header and Footer
    Given User is on Category Page
    Then the following elements of the "navigation" should be displayed
      |Logo|
      |Utility Nav      |
      |Sub Nav          |
      |Social Links     |
      |Links            |
      |Copyright        |
      |Language Selector|
      |Country Selector |

  Scenario: View hamburger nav in header
    Given User is on Category Page
    Then Scroll down on the page
    And verify hamburger nav is displayed

  Scenario: Able to subscribe to Newsletter
    Given User is on Category Page
    Then verify user is able to successfully subscribe to newsletter

  Scenario: Able to subscribe to Newsletter
    Given User is on Category Page
    Then Error is displayed on entering an invalid email




