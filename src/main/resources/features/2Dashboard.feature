Feature: Dashboard Page

  Scenario: Verify Dashboard Page Elements
    Given I am logged in and on the dashboard page
    When I view the dashboard page
    Then I should click the dashboard button
    And I should see the total number of employees section
    And I should see the number of employees who are absent
    And I should see the number of employees who are working from home
    And I should see the number of employees on leave
    And I should see the number of employees who are sick
    And I should see the number of employees who are on permission