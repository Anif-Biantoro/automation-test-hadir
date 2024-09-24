Feature: Laporan Semua Page on magang.dikahadir
    #TL.1-1
  Scenario:Search With Calendar
    Given User go to menu laporan semua
    When User click start date
    And User click end date
    And User click button search
    Then User get data calendar

      #TL.1-2
  Scenario: Search With Input Name
    Given User go to menu laporan semua
    When User click start date
    And User click end date
    And User click button search
    And User input name
    And User click button search
    Then User get data name

   #TL.1-3
  Scenario: Test Button Reset Calendar
    Given User go to menu laporan semua
    When User click start date
    And User click end date
    And User click button search
    And User get data calendar
    And User click button reset
    Then User get text success reset calendar

    #TL.1-4
  Scenario: Test Invalid Search Input Name
    Given User go to menu laporan semua
    When User click start date
    And User click end date
    And User click button search
    And User input invalid name
    And User click button search
    Then User did not get data
