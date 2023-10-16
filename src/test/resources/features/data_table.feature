Feature: Learn awesome datatable

  Rule: concentrate, can get a little complex
@credentials
      Scenario: data table
        Given My Credentials
          | John | John123 |
          | bill | bill123 |
        And single row with no header
          | John | John123 |
        And more rows with no header
              | John | John123 |
              | bill | bill123 |
@credentials_with_headers
  Scenario: datatable with headers
    Given I have a single row with header
      | username | password |
      | John     | John123  |
    And I have multiple rows with headers
      | username | password |
      | John     | John123  |
      | Patrick  | Patrick123 |



