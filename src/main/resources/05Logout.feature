Feature: Logout from the application

  Scenario: User successfully logs out
    Given the user is logged in
    When the user clicks on the logout button
    Then the user should be redirected to the login page
