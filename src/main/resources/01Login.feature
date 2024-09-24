Feature: Login Web HADIR
  #TCC.LOGIN HADIR.001
  Scenario: Login Valid Test
    Given User enter url HADIR
    When User input valid username
    And User input valid password
    And User click button login
