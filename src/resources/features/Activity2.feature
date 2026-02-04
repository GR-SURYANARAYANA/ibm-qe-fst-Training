@activity2
  Feature: Login Test

    Scenario Outline: Testing login
      Given the user is on the login page
      When the user enters "<username>" and "<password>"
      And clicks the submit button
      Then get the confirmation message and verify it as "Invalid credentials"

      Examples:
        | username | password      |
        | admin    | password123   |
        | admin    | wrongPassword |