Feature: Manage Pending Page Filters

  Scenario: User filters data by selecting a date range and job department
    Given the user is on the Pending Page
    When the user selects the start date
    And the user selects the end date
    And the user saves the selected date range
    And the user applies the filters
    And the user sets the job department
    And the user saves the job department
    Then the data should be filtered according to the selected criteria

  Scenario: User resets all filters
    Given the user is on the Pending Page
    When the user applies some filters
    And the user resets all filters
    Then the filters should be cleared
