Feature: Post user on regres

  Scenario: Post a user success
    Given url "https://dummy.restapiexample.com/api/v1/create"
    And request { "name":"carlos", "salary":"1500", "age":"29" }
    When method post
    Then status 200
    And def contactId = $.data.id
    * print contactId

  Scenario: Post a user without name
    Given url "https://dummy.restapiexample.com/api/v1/create"
    And request { "name": "","salary":"1500", "age":"29" }
    When method post
    Then status 429

  Scenario: Post a user withot salary
    Given url "https://dummy.restapiexample.com/api/v1/create"
    And request { "name":"carlos","salary":"", "age":"29" }
    When method post
    Then status 429

  Scenario: Post a user without age
    Given url "https://dummy.restapiexample.com/api/v1/create"
    And request { "name":"carlos", "salary":"1500", "age":"" }
    When method post
    Then status 429

  Scenario: Post a user with number in name
    Given url "https://dummy.restapiexample.com/api/v1/create"
    And request { "name":"carlosv45", "salary":"1500", "age":"29" }
    When method post
    Then status 429

  Scenario: Post a user with letters in salary
    Given url "https://dummy.restapiexample.com/api/v1/create"
    And request { "name":"carlos", "salary":"cincomil", "age":"29" }
    When method post
    Then status 429

  Scenario: Post a user with letters in age
    Given url "https://dummy.restapiexample.com/api/v1/create"
    And request { "name": "carlos", "salary": "1500", "age": "cuarenta y cinco" }
    When method post
    Then status 429

  Scenario: Post a user with negative number in salary
    Given url "https://dummy.restapiexample.com/api/v1/create"
    And request { "name": "carlos", "salary": "-1500", "age": "29" }
    When method post
    Then status 429


  Scenario: Post a user with negative number in age
    Given url "https://dummy.restapiexample.com/api/v1/create"
    And request { "name": "carlos", "salary": "1500", "age": "-29" }
    When method post
    Then status 429
