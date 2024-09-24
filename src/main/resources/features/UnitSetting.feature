Feature: Unit Setting

  Scenario: Successfully adding a department in unit management settings
    Given Admin is on login page for unit setting page
    When Admin enters valid email and password for unit setting page
    And Admin clicks login button for unit setting page
    And Admin should be redirected to dashboard for unit setting page
    And Admin clicks the management button
    And Admin clicks unit setting button
    And Admin clicks "Tambahkan"
    And Admin selects the department to be added
    And Admin clicks "Submit"
    Then The department is successfully added

  Scenario: Successfully deleting a department in unit management settings
    Given Admin is on login page for unit setting page
    When Admin enters valid email and password for unit setting page
    And Admin clicks login button for unit setting page
    And Admin should be redirected to dashboard for unit setting page
    And Admin clicks the management button on sidebar
    And Admin clicks unit setting button
    And Admin clicks "Delete"
    And A confirmation message
    And Admin clicks "Ya" on the confirmation dialog
    Then The department is successfully deleted
