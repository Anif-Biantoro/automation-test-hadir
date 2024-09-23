Feature: Login functionality on magang.dikahadir

  Scenario: Successful login with valid credentials
    Given User is on login page for login
    When User enters valid email and password for login
    And User Click Login Button
    Then The user successfully entered the login page


