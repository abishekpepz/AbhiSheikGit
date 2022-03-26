Feature: Verifying Adactin Details

  Background: Given App user is on Adactin page
 
 @Reg @Sanity
  Scenario: Verifying Adactin login with valid Credentials
    When App user should Enter username and Password
    Then App user should click login button
    And App user should verify success msg
  @Reg @Smoke
  Scenario Outline: Verifying Adactin login with valid Credentials
    When user should Enter "<username>" and "<Password>"
    Then user should click login button
    And user should verify success msg

    Examples: 
      | username | Password |
      | ramkumar |   123465 |
