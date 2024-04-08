Feature: Get user on regres

  Scenario: Get a user success
    Given url "https://dummy.restapiexample.com/api/v1/employees"
    When method get
    Then status 200

  Scenario: user with id success
    Given url "https://dummy.restapiexample.com/api/v1/employee/5"
    When method get
    Then status 200

  Scenario:the user non-existent
    Given url "https://dummy.restapiexample.com/api/v1/employee/50"
    When method get
    Then status 429

  Scenario: failure with url bad
    Given url "https://dummy.restapiexample.com/api/v2/employees"
    When method get
    Then status 404


