Feature: Manage Shifts

  Scenario: Edit a shift for the BCA department
    Given I am on the dashboard page
    When I click on the management menu
    And I click on the shifting bar
    Then I search for the shift with bca life
    And I click on the edit button for the shift
    And I update the name
    And I select the job
    And I enter the shift code
    And I click on the save button
    Then the shift for the bca department should be updated successfully

  Scenario: Delete a shift for the Love Indonesia department
    Given I am on the dashboard page
    When I click on the management menu
    And I click on the shifting bar
    Then I search for the shift with love indonesia
    And I click on the delete button for the shift
    Then the shift for the love indonesia should be deleted successfully
