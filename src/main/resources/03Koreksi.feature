Feature: Laporan koreksi
  #TCC.HW.002
  Scenario: Search Data koreksi Berdasarkan Nama
    Given user klik menu koreksi
    When user input search koreksi
    And user klik button search koreksi
    #TCC.HW.003
  Scenario: Search Data koreksi Berdasarkan Tanggal
    Given user klik button reset koreksi
    When user input start date koreksi
    And user input end date koreksi
    And user klik button search koreksi
#    #TCC.HW.004
#  Scenario: Approval Koreksi
#    Given user klik button reset koreksi
#    When user klik titik tiga
#    And user klik approval koreksi
#    And user click button setujui
#    #TCC.HW.005
#  Scenario: Reject Koreksi
#    Given user klik reject koreksi
#    When user input alasan reject
#    And user click button tolak