Feature: Test Login User on Hadir mobile website

  #Positive Scenario; TCC #0011
  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enters email and password validly
    And  I click the login button
    Then I should be redirected to the dashboard page

  #Negative Scenario; TCC #0012
  Scenario: Login attempt with unregistered account
    Given I am on the login page
    When I enters unregistered account
    And I click the login button
    Then an error message should be displayed

  #Negative Scenario; TCC #0013
  Scenario: Login attempt with empty username and password
    Given I am on the login page
    When I leaves email and password fields empty
    And I click the login button
    Then an error message should be displayed

  #Negative Scenario; TCC #0014
  Scenario: Login attempt with wrong email format
    Given I am on the login page
    When I enters email with wrong format and password validly
    And I click the login button
    #Then an error message should be displayed
    Then an pop up message should be displayed

  #Negative Scenario; TCC #0015
  Scenario: Login attempt with wrong password
    Given I am on the login page
    When I enters email validly and password invalidly
    And I click the login button
    Then an wrong password message should be displayed

  #Negative Scenario; TCC #0016
  Scenario: Login attempt with wrong email
    Given I am on the login page
    When I enters email invalidly and password validly
    And I click the login button
    Then an error message should be displayed
