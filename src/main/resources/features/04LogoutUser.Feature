Feature: Test Logout User on Hadir mobile website

  #Positive Scenario; TCC #0017
  Scenario: Successful logout attempt
    Given I am logged in to the mobile site
    When I clicked button navbar
    Then I clicked button logout
    And  I should see Hadir logo in login page

  #Negative Scenario; TCC #0018
  Scenario: Return to previous page after logout
    Given I am logged in to the mobile site
    When I clicked button navbar
    Then I clicked button logout
    And I clicked back button in the browser