@stories
Feature: Create a user in Regres.in

  @Scenario1
  Scenario: Creation an user
    #Given the Given
    When you create an user
      | name    | job  |
      | brandon | java |
    Then i should be the user created

