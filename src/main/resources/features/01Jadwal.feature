Feature: Input Jadwal

  Scenario: Successful Input Jadwal
    Given User is on login page for jadwal
    When User enters valid email and password for jadwal
    And User clicks login button for jadwal
    When User should be redirected to dashboard for jadwal
    And User click Management Menu
    And User scroll down
    And User Click Jadwal
    And User click on Button Add
    And User choose Jadwal
    And User choose Date
    And User input jadwal kerja
    And User choose hari kerja
    And User input keterlambatan
    And User click Button Save Add

  Scenario: Edit Jadwal Recently Added
    Given User is on login page for jadwal
    When User enters valid email and password for jadwal
    And User clicks login button for jadwal
    When User should be redirected to dashboard for jadwal
    And User click Management Menu
    And User scroll down
    And User Click Jadwal
    And User search by Jadwal Name
    And User Click Button for Popup and choose Edit
    And User Edit Tipe Jadwal
    And User Edit Toleransi Keterlambatan
    And User Click Button Simpan

  Scenario: Delete Jadwal Recently Added
    Given User is on login page for jadwal
    When User enters valid email and password for jadwal
    And User clicks login button for jadwal
    When User should be redirected to dashboard for jadwal
    And User click Management Menu
    And User scroll down
    And User Click Jadwal
    And User search by Jadwal Name
    And User Click Button Action for choose delete
    And User Click Button Ya for delete

  Scenario:Unsuccessful Input Jadwal with empty hari kerja
    Given User is on login page for jadwal
    When User enters valid email and password for jadwal
    And User clicks login button for jadwal
    When User should be redirected to dashboard for jadwal
    And User click Management Menu
    And User scroll down
    And User Click Jadwal
    And User click on Button Add
    And User choose Jadwal
    And User choose Date
    And User input jadwal kerja
    And User empty hari kerja
    And User input keterlambatan
    And User click Button Save Add
    Then User see error message for empty hari kerja