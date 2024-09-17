Feature: Test Import Status Aktif Page

  #Positive Scenario; TCC #0001
  Scenario: Successful download file template
    Given I am logged in to the admin website
    And I am on import status aktif page
    When I clicked the Download Template button
    Then I successfully download the file

  #Positive Scenario; TCC #0002
  Scenario: Successful import file template
    Given I am on import status aktif page
    When I choose file to import
    Then I click button import
    And I should see message successful import excel

  #Negative Scenario; TCC #0003
  Scenario: UnSuccessful import file template
    Given I am on import status aktif page
    When I choose different file to import
    Then I click button import
    And I should see error message displayed