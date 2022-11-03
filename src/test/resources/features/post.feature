@Regression
Feature: Post information of a user

  @TestStatusCode
  Scenario Outline: Send information post individual user with response success
    Given I load costumer information
      | name   | job   |
      | <name> | <job> |

    When I call post user API
    Then I should see the status code 201

    Examples:
      | name     | job    |
      | morpheus | leader |

  @TestQuantityField
  Scenario Outline: Send information post individual user with response success
    Given I load costumer information
      | name   | job   |
      | <name> | <job> |

    When I call post user API
    Then I validate quantity key is 4

    Examples:
      | name     | job    |
      | morpheus | leader |

  @TestSchema
  Scenario Outline: Send information post individual user with response success
    Given I load costumer information
      | name   | job   |
      | <name> | <job> |

    When I call post user API
    Then I validate schema response "PostJsonSchema"

    Examples:
      | name     | job    |
      | morpheus | leader |

  @TestFields
  Scenario Outline: Send information post individual user with response success
    Given I load costumer information
      | name   | job   |
      | <name> | <job> |

    When I call post user API
    Then I validate fields post response api

    Examples:
      | name     | job    |
      | morpheus | leader |

  @TestDataResponse
  Scenario Outline: Send information post individual user with response success
    Given I load costumer information
      | name   | job   |
      | <name> | <job> |
    When I call post user API
    Then I validate post response contain data initial

    Examples:
      | name     | job    |
      | morpheus | leader |