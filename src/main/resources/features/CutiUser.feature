Feature: Logout functionality on magang.dikahadir

  Scenario: Successful go to the cuti user page
    Given User is on login page for cuti user
    When User enters valid email and password for cuti user
    And User clicks login button for cuti user
    And User clicks the cuti button
    And User clicks the ajukan cuti button

  Scenario: Successful go to the info cuti user page
    Given User is on login page for cuti user
    When User enters valid email and password for cuti user
    And User clicks login button for cuti user
    And User clicks the cuti button
    And User clicks the ajukan cuti button
    And User clicks the info cuti button

  Scenario: Successful go to the form cuti user
    Given User is on login page for cuti user
    When User enters valid email and password for cuti user
    And User clicks login button for cuti user
    And User clicks the cuti button
    And User clicks the ajukan cuti button
    And User clicks the info cuti button
    And User clicks the form cuti button

  Scenario: Successful entered valid leave data
    Given User is on login page for cuti user
    When User enters valid email and password for cuti user
    And User clicks login button for cuti user
    And User clicks the cuti button
    And User clicks the ajukan cuti button
    And User clicks the info cuti button
    And User clicks the form cuti button
    When User fills in the leave form with valid data
    And User clicks the field date
    And User clicks the start date
    And User clicks the end date
    And User clicks the save button
    And User submits the leave form

  Scenario: Unsuccessful entered invalid date for leave data
    Given User is on login page for cuti user
    When User enters valid email and password for cuti user
    And User clicks login button for cuti user
    And User clicks the cuti button
    And User clicks the ajukan cuti button
    When User fills in the leave form with valid data
    And User submits the leave form

  Scenario: Usuccessful entered duplicate valid leave data
    Given User is on login page for cuti user
    When User enters valid email and password for cuti user
    And User clicks login button for cuti user
    And User clicks the cuti button
    And User clicks the ajukan cuti button
    And User clicks the info cuti button
    And User clicks the form cuti button
    When User fills in the duplicate type leave form with valid data
    And User clicks the field date
    And User clicks the start date
    And User clicks the end date
    And User clicks the save button
    And User submits the leave form
