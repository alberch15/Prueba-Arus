@ignore
Feature: Reusable scenarios for post a user

  @Create
  Scenario:
    Given url "https://dummy.restapiexample.com/api/v1/create"
    And request { "name":"alex","salary":"3220","age":"23"}
    When method post
    Then status 200
    And def contactId = $.data.id
