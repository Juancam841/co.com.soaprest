@Regression
Feature: Information list get users

  @TestStatusCode
  Scenario: Send information list get users with response success
    Given I load costumer information
      | page |
      | 1    |
    When I call get user API
    Then I should see the status code 200


  @TestQuantityField
  Scenario: Send information list get users with response success
    Given I load costumer information
      | page |
      | 1    |
    When I call get user API
    And I validate quantity key is 6


  @TestSchema
  Scenario: Send information list get users with response success
    Given I load costumer information
      | page |
      | 1    |
    When I call get user API
    And I validate schema response "GetListJsonSchema"

  @TestFields
  Scenario: Send information list get users with response success
    Given I load costumer information
      | page |
      | 1    |
    When I call get user API
    And I validate fields get list response api

  @TestDataResponse
  Scenario: Send information list get users with response success
    Given I load costumer information
      | page |
      | 1    |
    When I call get user API
    And I validate get list response contain data expected
      | page | per_page | total | total_pages | support_url                        | support_text                                                             | id | email                  | first_name | last_name | avatar                                  |
      | 1    | 6        | 12    | 2           | https://reqres.in/#support-heading | To keep ReqRes free, contributions towards server costs are appreciated! | 1  | george.bluth@reqres.in | George     | Bluth     | https://reqres.in/img/faces/1-image.jpg |