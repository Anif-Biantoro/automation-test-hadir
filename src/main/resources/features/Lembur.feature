Feature: User lembur functionality

  #0011
  Scenario: Successfully applied for overtime
    Given I am logged into user absen page
    When I click lembur button and click ajukan
    And I fill the all text box
    And I click accept
    Then I successfully added new lembur

  #0012
  Scenario: Function reset button
    Given I am logged into user absen page
    When I click lembur button and click ajukan
    And I fill the all text box
    And I click reset button
    Then The text box should be empty

  #0013
  Scenario: Unsuccessful to apply for overtime without fill jam masuk
    Given I am logged into user absen page
    When I click lembur button and click ajukan
    And I fill the all text box except jam masuk
    And I click accept
    Then I should see jam masuk harus di isi

  #0014
  Scenario: Unsuccessful to apply for overtime without fill jam keluar
    Given I am logged into user absen page
    When I click lembur button and click ajukan
    And I fill the all text box except jam keluar
    And I click accept
    Then I should see jam keluar harus di isi

  #0015
  Scenario: Unsuccessful to apply for overtime without fill notes
    Given I am logged into user absen page
    When I click lembur button and click ajukan
    And I fill the all text box except notes
    And I click accept
    Then I should see Masukan minimal 5 karakter


