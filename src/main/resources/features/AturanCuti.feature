Feature: Input Aturan Cuti

  Scenario: Successful Input Aturan Cuti
    Given User is on login page for Aturan Cuti
    When User enters valid email and password for Aturan Cuti
    And User clicks login button for Aturan Cuti
    When User should be redirected to dashboard for Aturan Cuti
    And User click Management Menu for Aturan Cuti
    And User Click Aturan Cuti
    When User click on Button Tambahkan Aturan Cuti
    And User input on Field Nama Aturan Cuti
    And User input on Field Eligible Pengaturan Cuti
    And user choose Tanggal Batas Sisa Cuti
    And user choose Bulan Batas Sisa Cuti
    And User input on Field Maksimal Sisa Cuti
    And User input on Field Jumlah Bulan Kerja Sisa Cuti
    And User click Button Tambahkan Simpan Aturan Cuti
    And User searching recently added for Aturan Cuti
    And user click search button Aturan Cuti
    And user scroll horizontal and click button action for view
    When user click button Tambahkan Detail Aturan Cuti
    And User input on Field Minimal Bulan Bekerja
    And User input on Field Total Cuti
    And user click button Tambahkan Simpan Detail Aturan Cuti


  Scenario: Unsuccessful Input Aturan Cuti with Empty Field Nama Aturan Cuti
    Given User is on login page for Aturan Cuti
    When User enters valid email and password for Aturan Cuti
    And User clicks login button for Aturan Cuti
    When User should be redirected to dashboard for Aturan Cuti
    And User click Management Menu for Aturan Cuti
    And User Click Aturan Cuti
    When User click on Button Tambahkan Aturan Cuti
    And User empty on Field Nama Aturan Cuti
    And User input on Field Eligible Pengaturan Cuti
    And user choose Tanggal Batas Sisa Cuti
    And user choose Bulan Batas Sisa Cuti
    And User input on Field Maksimal Sisa Cuti
    And User input on Field Jumlah Bulan Kerja Sisa Cuti
    And User click Button Tambahkan Simpan Aturan Cuti
    Then User see error message with empty field nama aturan cuti