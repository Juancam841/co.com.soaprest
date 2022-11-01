@Regression
Feature: Put information of a user

  @TestStatusCode
  Scenario Outline: Send information put individual user with response success
    Given I load costumer information
      | name   | job   |
      | <name> | <job> |
    When I call put user API <id>
    Then I should see the status code 200

    Examples:
      | name     | job    | id |
      | morpheus | leader | 2  |

  @TestQuantityField
  Scenario Outline: Send information put individual user with response success
    Given I load costumer information
      | name   | job   |
      | <name> | <job> |

    When I call put user API <id>
    Then I validate quantity key is <quantity>

    Examples:
      | name     | job    | id | quantity |
      | morpheus | leader | 2  | 3        |

  @TestSchema
  Scenario Outline: Send information put individual user with response success
    Given I load costumer information
      | name   | job   |
      | <name> | <job> |

    When I call put user API <id>
    Then I validate schema response "PutJsonSchema"

    Examples:
      | name     | job    | id |
      | morpheus | leader | 2  |

  @TestFields
  Scenario Outline: Send information put individual user with response success
    Given I load costumer information
      | name   | job   |
      | <name> | <job> |

    When I call put user API <id>
    Then I validate fields put response api

    Examples:
      | name     | job    | id |
      | morpheus | leader | 2  |

  @TestDataResponse
  Scenario Outline: Send information put individual user with response success
    Given I load costumer information
      | name   | job   |
      | <name> | <job> |

    When I call put user API <id>
    Then I validate put response contain data expected

    Examples:
      | name     | job    | id |
      | morpheus | leader | 2  |