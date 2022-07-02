Feature: Log in Function

 Scenario Outline: TC_001 Verify that User can login with valid credentials by clicking "Log in " button
    Given User on the login page
    And User enters valid username "<username>"
    And User enters valid password "<password>"
    And User clicks login button
    Then User lands on files module page
   Examples:
     | username    | password    |
     | Employee111 | Employee123 |


  Scenario: TC_002 Verify that User can login with valid credentials by clicking " Enter " key
    Given User on the login page
    And User enters valid username
    And User enters valid password
    And User clicks enter key
    Then User lands on files module page


  Scenario: TC_003 Verify that User can not login with any invalid credentials
    Given User on the login page
    And User enters invalid username
      | username | EmployeeABC |
    And User enters invalid password
      | password | Employee123 |
    And User clicks login button
    Then User can not log in


  Scenario: TC_004 Verify that User can not login with blank username
    Given User on the login page
    When User enters valid password
    And User clicks login button
    Then User should be able to see the error message on input box as expected


  Scenario: TC_005 Verify that User can not login with blank password
    Given User on the login page
    When User enters valid username
    And User clicks login button
    Then User should be able to see the error message on password box as expected

  Scenario: TC_006 Verify that user can see the password in a form of dots by default
    Given User on the login page
    And User enters valid username
    And User enters valid password
    Then User should be able to see the password in a form dots

  Scenario: TC_007 Verify that user can see the password by clicking eye sign image
    Given User on the login page
    And User enters valid username
    And User enters valid password
    And User clicks the eye icon
    Then User should be able to see password as a text

  Scenario: TC_008 Verify that user can see the "Forgot password?"
  link on the login page  and can see the "Reset Password" button on the next page after clicking on forgot password link
    Given User on the login page
    Then User should be able to see forgot password link
    And User Click the forgot password link
    Then User should be able to see Reset Password button

 Scenario: TC_009 Verify that user can see valid placeholders on Username and Password fields
   Given User on the login page
   Then User should be able to see valid placeholders