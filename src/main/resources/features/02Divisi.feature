Feature: Test Divisi Page of Hadir admin website

  #Positive Scenario; TCC #0004
  Scenario: Add new division name
    Given I am logged in to the admin web
    And I am on divisi page
    When I clicked button Tambahkan
    And I input new name division
    Then I clicked button Tambah
    And I should see message successful add division

  #Negative Scenario; TCC #0005
  Scenario: Cancel add new division name
    Given I am on divisi page
    When I clicked button Tambahkan
    Then I clicked button Batal

  #Positive Scenario; TCC #0006
  Scenario: Search for available divisions in the list
    Given I am on divisi page
    When I input name division on search field
    Then I clicked button Search
    And I should see the name division on the list

  #Negative Scenario; TCC #0007
  Scenario: Searching for a division that is not available in the list
    Given I am on divisi page
    When I input name division that is not available in the list
    Then I clicked button Search

  #Positive Scenario; TCC #0008
  Scenario: Reset name division on search field
    Given I am on divisi page
    When I clicked button Search
    Then I clicked button Reset

  #Positive Scenario; TCC #0009
  Scenario: Edit name division
    Given I am on divisi page
    When I clicked button Edit
    And  I change name division
    Then I clicked button Simpan
    And I should see message successful edit division

  #Positive Scenario; TCC #0010
  Scenario: Delete name division
    Given I am on divisi page
    When I clicked button Delete
    Then I clicked button Ya
    And I should see message successful delete division
