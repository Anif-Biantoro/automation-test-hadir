Feature: Attendance Report

  Scenario: Display employee attendance list based on date input
    Given Admin is on login page for kehadiran page
    When Admin enters valid email and password for kehadiran page
    And Admin clicks login button for kehadiran page
    And Admin should be redirected to dashboard for kehadiran page
    And Admin clicks the laporan button on sidebar
    And Admin clicks kehadiran button
    And Admin enters the start date and the end date
    And Admin clicks "Save"
    And Admin clicks "Search"
    Then The attendance report is updated based on the entered date range

  Scenario: Display employee attendance list based on employee name
    Given Admin is on login page for kehadiran page
    When Admin enters valid email and password for kehadiran page
    And Admin clicks login button for kehadiran page
    And Admin should be redirected to dashboard for kehadiran page
    And Admin clicks the laporan button on sidebar
    And Admin clicks kehadiran button
    And Admin enters the employee name
    And Admin clicks "Search"
    Then The system does not display the attendance report

  Scenario: Unable to display employee attendance list due to empty date input
    Given Admin is on login page for kehadiran page
    When Admin enters valid email and password for kehadiran page
    And Admin clicks login button for kehadiran page
    And Admin should be redirected to dashboard for kehadiran page
    And Admin clicks the laporan button on sidebar
    And Admin clicks kehadiran button
    And Admin leaves the start date and end date fields empty
    And Admin clicks "Search"
    Then The system does not display the attendance report

  Scenario: Download the attendance report file
    Given Admin is on login page for kehadiran page
    When Admin enters valid email and password for kehadiran page
    And Admin clicks login button for kehadiran page
    And Admin should be redirected to dashboard for kehadiran page
    And Admin clicks the laporan button on sidebar
    And Admin clicks kehadiran button
    And Admin enters the start date and the end date
    And Admin clicks "Save"
    And Admin clicks "Search"
    And Admin clicks "Export"
    And A confirmation message appears
    And Admin clicks "Export" on the confirmation dialog
    Then The system displays the error message
