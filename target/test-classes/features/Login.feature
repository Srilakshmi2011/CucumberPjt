@Login
Feature: This feature will be used to login Simplilearn website

  Background: 
    Given I haved launched the application URL
    And Click on login link

  @Sanity
  Scenario: Validate  Login Success Scenario
    When Enter Username
    And Enter Password
    And Click on Login button
    Then Should land on Homepage

  @Regression
  Scenario: Validate  Login Success Scenario
    When Enter Username as "Abc@xyz.com"
    And Enter Password as  "Abc@1234"
    And Click on Login button
    Then should get the error message as "The email or password you have entered is invalid."

  @WIP
  Scenario Outline: Validate Login failiure scenario using Examples
    When Enter Username as "<UserName>"
    And Enter Password as  "<Password>"
    And Click on Login button
    Then should get the error message as "<ErrorMsg>"

    Examples: 
      | UserName    | Password | ErrorMsg                                           |
      | Abc@xyz.com | Abc@1234 | The email or password you have entered is invalid. |
      | Pqr@xyz.com | Pqr@1234 | The email or password you have entered is invalid. |

  @Sanity @Regression
  Scenario: Validate the other login options on the screen
    Then I should see below login options on the screen
      | Google   |
      | Facebook |
      | Linkedin |
      | Apple    |
