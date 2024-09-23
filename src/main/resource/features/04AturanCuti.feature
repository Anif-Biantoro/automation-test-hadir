Feature: AturanCuti functionality
  Scenario: Search Atruan Cuti
    Given User Logged in to the Hadir Page
    When Click Management List and Click Aturan Cuti List
    Then User Should Move to Aturan Cuti Page
    And User Search Aturan Cuti With Valid Name
    And User Reset Aturan Cuti
    And User Click Padding Switch
    And User CLick Option List and Edit Aturan CUti
    And User CLick Option List and Delete Aturan CUti
    And User CLick Option List and View Aturan CUti