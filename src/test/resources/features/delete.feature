@Regression
Feature: Information delete individual user

  Scenario: Send Information delete individual user with response success
    Given I load costumer information
      | id |
      | 1  |
    When I Call Delete user API
    Then I should see the status code 204