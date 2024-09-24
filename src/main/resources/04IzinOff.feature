Feature: Laporan IzinOff
  #TCC.HW.002
  Scenario: Search Data izinOff Berdasarkan Nama
    Given user klik menu laporan
    When user klik menu izinOff
    And user input search
    And user click button search
    #TCC.HW.003
  Scenario: Search Data izinOff Berdasarkan Tanggal
    Given user klik button reset
    When user input start date
    And user input end date
    And user click button search

