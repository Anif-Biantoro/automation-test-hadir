Feature: ImportDataCuti functionality
  Scenario: Import and Download Template Cuti
    Given User Logged in to the Hadir Page
    When Click Import List and Click Import Cuti
    Then User Should Move To Import Cuti Page
    And User Download Template Cuti
    And User Upload Flie Cuti
    And User Upload File Cuti With Invalid File
    Then User Should See Error Message
    And User Upload File Cuti With Empty File
    Then User should see error message
