Feature: Multiple destination, currency, language support
  A customer can to select their preferred shipping destination, purchase currency
  and language.

  Scenario: Customer can open Settings page
    Given I am on the website
    When I click the country name in the top-left corner of the page
    Then I am taken to the Settings page

  Scenario: Customer can select settings and return on the same page
    Given I am on the Shop page
    When I click the country name in the top-left corner of the page
    And I select Austria as my shipping destination
    And I save the settings
    Then I returned to the same Shop page

