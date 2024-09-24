Feature: Login to the application

  Scenario: Successful login with valid credentials
    Given User is on login page for login
    When User enters valid username and password for login
    And User clicks login button on login page
    Then User should be redirected to the dashboards page
