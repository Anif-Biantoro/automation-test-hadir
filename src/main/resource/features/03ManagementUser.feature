Feature: Management User on magang.dikahadir
  Scenario: Download Export File
    When User Click Management List and Click User List
    And User Click Export Button
    Then User Has Been Downloaded File Export Users
    And User Search Name
    Then User Should See The name
    And user filter the name of user