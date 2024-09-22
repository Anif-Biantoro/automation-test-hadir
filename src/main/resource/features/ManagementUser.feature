Feature: Management User on magang.dikahadir
  Scenario: Download Export File
    Given User is on login page for login
    When User enters valid email and password for login
    And User Click Management List and Click User List
    And User Click Export Button
    Then User Has Been Downloaded File Export Users