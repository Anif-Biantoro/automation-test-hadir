Feature: Management jadwal functionality

  #0004
  Scenario: Add new schedule
    Given I am logged into Hadir page and clicked the management menu
    When I add new work schedule
    And I fill the schedule type
    And I fill the schedule name
    And I fill the schedule days
    And I fill the late tolerance
    And I click add new schedule
    Then I successfully added new work schedule

  #0005
  Scenario: Search schedule name
    Given I am logged into Hadir page and clicked the management menu
    When I type the name i want to search
    And  I click search button
    Then I found the name

  #0006
  Scenario: View schedule details
    Given I am logged into Hadir page and clicked the management menu
    When I type the name i want to search
    And  I click search button
    And I click the work details
    And I click detail button
    Then I successfully view the details

  #0007
  Scenario: Edit schedule
    Given I am logged into Hadir page and clicked the management menu
    When I type the name i want to search
    And  I click search button
    And I click the work details
    And I click edit button
    Then I close the edit details

  #0008
  Scenario: Delete schedule
    Given I am logged into Hadir page and clicked the management menu
    When I type the name i want to search
    And  I click search button
    And I click the work details
    And I click delete button
    Then I cancel the delete

  #0009
  Scenario: Reset search
    Given I am logged into Hadir page and clicked the management menu
    When I type the name i want to search
    And  I click reset search button
    Then It should be blank

  #0010
  Scenario: Page options functionality
    Given I am logged into Hadir page and clicked the management menu
    When Scroll down to the bottom page
    And I click rows button
    And I change it to five row
    And I click next page and click previous page
    And I click last page and click first page
    Then The pages options is working correctly
