Feature: Delete user on regres

  Scenario: Delete a user success
   # * call read("../post/user_post_snippets.feature@Create")
   # * print contactId
    Given url "https://dummy.restapiexample.com" + "/api/v1/delete/"  + 5311
    When method delete
    Then status 200