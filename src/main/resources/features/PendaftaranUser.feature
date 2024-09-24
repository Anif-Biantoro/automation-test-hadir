Feature: User Registration Management

  Scenario: Successfully registering a new user
    Given Admin is on login page for pendaftaran user page
    When Admin enters valid email and password for pendaftaran user page
    And Admin clicks login button for pendaftaran user page
    And Admin should be redirected to dashboard for pendaftaran user page
    And Admin clicks the management button on sidebar
    And Admin clicks pendaftaran user button
    And Admin fills in account information with the following details:
      | Field              | Value                        |
      | Employee photo     | Upload a valid photo          |
      | NIK                | Enter valid NIK               |
      | Employee name      | Enter valid employee name     |
      | Email              | Enter valid email             |
      | Password           | Enter a valid password        |
    And Admin fills in work information with the following details:
      | Division           | Select a valid division       |
      | Unit               | Select a valid unit           |
      | Work position      | Select a valid work position  |
      | Job title          | Select a valid job title      |
      | Contract type      | Select a valid contract type  |
    And Admin fills in attendance settings with the following details:
      | Work location      | Select a valid work location  |
      | Shift type         | Select a valid shift type     |
      | Work schedule      | Select a valid work schedule  |
      | Selfie             | Choose whether to require a selfie |
      | Leave quota        | Enter a valid leave quota     |
    And Admin clicks Submit to complete the registration
    Then Admin is successfully registered

  Scenario: Failing to register a new user due to invalid email format
    Given Admin is on login page for pendaftaran user page
    When Admin enters valid email and password for pendaftaran user page
    And Admin clicks login button for pendaftaran user page
    And Admin should be redirected to dashboard for pendaftaran user page
    And Admin clicks the management button on sidebar
    And Admin clicks pendaftaran user button
    And Admin fills in account information with an invalid email
    Then Admin should see an error message

  Scenario: Failing to register a new user due to password not meeting complexity requirements
    Given Admin is on login page for pendaftaran user page
    When Admin enters valid email and password for pendaftaran user page
    And Admin clicks login button for pendaftaran user page
    And Admin should be redirected to dashboard for pendaftaran user page
    And Admin clicks the management button on sidebar
    And Admin clicks pendaftaran user button
    And Admin fills in account information with an invalid password
    And Admin clicks Submit to complete the registration
    Then Admin should see an error message

  Scenario: Failing to register a new user due to missing required fields
    Given Admin is on login page for pendaftaran user page
    When Admin enters valid email and password for pendaftaran user page
    And Admin clicks login button for pendaftaran user page
    And Admin should be redirected to dashboard for pendaftaran user page
    And Admin clicks the management button on sidebar
    And Admin clicks pendaftaran user button
    And Admin leaves required fields empty
    And Admin clicks Submit to complete the registration
    Then Admin should see an error message





