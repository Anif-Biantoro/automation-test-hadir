Feature: Absensi Mobile Functionality

  Scenario: Absen with Work From Office
    Given the user is logged in
    When the user clicks the absen masuk button
    And read clock and selects work from office
    And enters notes for the absence
    And submits the absence
    When the user clicks the keluar button
    And entering notes keluar
    And clicks the absen pulang button
    Then the absence should be recorded successfully