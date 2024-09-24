Feature: Import Struktur User Page

  #TI.4-1
  Scenario: Successful download file template struktur user
    Given I am logged in to the admin website
    And I am on import struktur user
    When I clicked the Download Template button
    Then I successfully download the file

  #TI.4-2
  Scenario: Successful import file template struktur user
    Given I am logged in to the admin website
    When I am on import struktur user
    And I choose file to import
    And I click button import
    Then I should see message successful import excel

  #TI.4-3
  Scenario: UnSuccessful import file template struktur user
    Given I am logged in to the admin website
    When I am on import struktur user
    And I choose different file to import
    And I click button import
    Then I should see error message displayed