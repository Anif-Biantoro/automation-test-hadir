Feature: Import functionality

  #0001
  Scenario: Successful import with the required file
    Given I am logged into Hadir page and clicked the import menu
    When I click choose and upload the required file
    And I click the import button
    Then I should see success alert

  #0002
  Scenario: Unsuccessful import because not choosing the file
    Given I am logged into Hadir page and clicked the import menu
    When I click the import button without choosing file
    Then I should see need a required file

  #0003
  Scenario: Unsuccessful import with the wrong file format
    Given I am logged into Hadir page and clicked the import menu
    When I click choose and upload with the wrong file
    And I click the import button
    Then I should see wrong format alert



