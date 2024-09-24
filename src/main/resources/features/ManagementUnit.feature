Feature: Management Unit
  # TCC.HW.001
  Scenario: Valid Input and Search Unit
    Given Click the management button
    When Click the unit button
    And Enter department name in the search
    And Click search
    And Display the department name
    And Display the release date
    Then Display the update date

  # TCC.HW.002
  Scenario: Valid Reset Unit
    Given Click the management button
    When Click the unit button
    And Enter department name in the search
    And Click search
    And Click reset
    Then Return to default view

  # TCC.HW.003
#  Scenario: Valid Rows per Page Unit
#    Given Click the management button
#    When Click rows per page
#    And Click the number of rows per page
#    Then Page size increases

#  # TCC.HW.004
#  Scenario: Valid Add Unit/Department
#    Given Click the management button
#    When Click add button to enter the new department
#    And Enter the department name
#    And Click add
#    Then The entered department name appears
#
#  # TCC.HW.005
#  Scenario: Cancel Valid Unit/Department
#    Given Click add
#    When Enter the department name
#    And Click cancel
#    Then The new data is not added
#
#  # TCC.HW.006
#  Scenario: No Input for Unit/Department
#    Given Click add
#    When Click add
#    Then An alert is displayed
#
#  # TCC.HW.007
#  Scenario: Enter an Existing Department Name in Unit
#    Given Enter a department name that already exists in the database
#    When Click add
#    Then Stay on the Add Departments screen
#
#  # TCC.HW.008
#  Scenario: Valid Edit Unit/Department Data
#    Given Click the kebab menu on the data you want to edit
#    When Click edit
#    And Enter the edited department name
#    And Click save
#    Then The department name is successfully updated
#
#  # TCC.HW.009
#  Scenario: Cancel Edit Unit/Department Data
#    Given Click the kebab menu on the data you want to edit
#    When Click edit
#    And Enter the edited department name
#    And Click cancel on the edit
#    Then The department name is not updated
#
#  # TCC.HW.010
#  Scenario: No Input for Updating Unit/Department
#    Given Click edit
#    When Clear the input
#    And Click save
#    Then An alert is displayed
