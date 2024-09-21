Feature: Lembur functionality on magang.dikahadir

  Scenario: Successful go to the lembur page
    Given User is on login page for day off
    When User enters valid email and password for day off
    And User clicks login button for day off
    And User should be redirected to dashboard for day off
    When User clicks the laporan button on sidebar
    And User clicks lembur button
    And User enters name for search field
    And User clicks search button for lembur
    And User clicks reset button for lembur

#    And User clicks filter button for lembur
#    And User enters name for filter field
    When user input start date lembur
    And user input end date lembur
#    When User clicks the profile button on the dashboard
#    And User clicks logout button
#    Then User should be redirected to the login page

