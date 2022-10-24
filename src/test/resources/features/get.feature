Feature: Get information of a single user

  Scenario: Send information get individual user with response success
    Given I load costumer information
      | id |
      | 1  |

    When I call get user API
    Then I should see the status code 200
    And I validate quantity key is 2
    And I validate schema response "GetJsonSchema"
    And I validate fields get response api
    And I validate get response contain data expected