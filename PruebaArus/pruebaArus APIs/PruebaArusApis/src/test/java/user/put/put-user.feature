Feature: Put user on regres

  Scenario: Put a user success
    Given url "https://dummy.restapiexample.com/api/v1/update/8"
    And request {"name":"ramiro","salary":"123","age":"39"}
    When method put
    Then status 200


  Scenario: Put a user non-existent
    Given url "https://dummy.restapiexample.com/api/v1/update/40"
    And request {"name":"alex","salary":"123","age":"39"}
    When method put
    Then status 429



