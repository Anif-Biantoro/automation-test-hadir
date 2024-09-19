Feature: Logout functionality on magang.dikahadir

  Scenario: Successful go to the day off page
    Given User is on login page for day off
    When User enters valid email and password for day off
    And User clicks login button for day off
    And User should be redirected to dashboard for day off
    When User clicks the sidebar button for day off
    And User clicks the management button on sidebar
    And User clicks day off button
