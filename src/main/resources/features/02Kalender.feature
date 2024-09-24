Feature: Input Kalender

  Scenario: Successful Input Kalender
    Given User is on login page for kalender
    When User enters valid email and password for kalender
    And User clicks login button for kalender
    When User should be redirected to dashboard for kalender
    And User click Management Menu for kalender
    And User Click kalender
    When User click on Button Tambah Kalender
    And User input on Field Kalender
    And User click Tambah Button
    When User on Search Field to searching recently added
    And user click search button
    And user click button action for view Kalender
    When user click button Tambahkan kalender
    And user choose Tanggal Cuti
    And user choose Tipe Cuti
    And user input Deskripsi Tanggal
    And user click button Tambah

    Scenario: Unsuccessful Input Kalender with Empty Field
      Given User is on login page for kalender
      When User enters valid email and password for kalender
      And User clicks login button for kalender
      When User should be redirected to dashboard for kalender
      And User click Management Menu for kalender
      When User Click kalender
      And User click on Button Tambah Kalender
      When User enters empty Field Kalender
      And User click Tambah Button
      Then User should see an error message after click Tambah Button