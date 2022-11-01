@Regression
Feature: Get information of a single user

  @TestStatusCode
  Scenario: Send information get individual user with response success
    Given I load costumer information
      | id |
      | 1  |

    When I call get user API
    Then I should see the status code 200

    @TestQuantityField
  Scenario: Send information get individual user with response success
    Given I load costumer information
      | id |
      | 1  |

    When I call get user API
    Then I validate quantity key is 2

@TestSchema
  Scenario: Send information get individual user with response success
    Given I load costumer information
      | id |
      | 1  |

    When I call get user API
    Then I validate schema response "GetJsonSchema"

  @TestFields
  Scenario: Send information get individual user with response success
    Given I load costumer information
      | id |
      | 1  |

    When I call get user API
    Then I validate fields get response api

    @TestDataResponse
  Scenario: Send information get individual user with response success
    Given I load costumer information
      | id |
      | 1  |

    When I call get user API
    Then I validate get response contain data expected