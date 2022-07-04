@SEAMLES-1947
Feature: Default

	Background:
		#@SEAMLES-1946
		Given User on the login page
		


	@SEAMLES-1923
	Scenario Outline: TC_001-Verify that users login to the app with valid credentials by clicking "Log in " button [AutomationS3-ÜTB]
			And User enters valid username "<username>"
		    And User enters valid password "<password>"
		    And User clicks login button
		    Then User lands on files module page
		   Examples:
		     | username    | password    |
		     | Employee111 | Employee123 |	


	@SEAMLES-1924
	Scenario: TC_002-Verify that users login to the app with valid credentials by clicking " Enter " key  [AutomationS3-ÜTB]
		    And User enters valid username
		    And User enters valid password
		    And User clicks enter key
		    Then User lands on files module page	


	@SEAMLES-1925
	Scenario: TC_003-Verify that User can not login with any invalid credentials [AutomationS3-ÜTB]
			And User enters invalid username
		      | username | EmployeeABC |
		    And User enters invalid password
		      | password | Employee123 |
		    And User clicks login button
		    Then User can not log in	


	@SEAMLES-1926
	Scenario: TC_004-Verify that User can not login with blank username [AutomationS3-ÜTB]
			When User enters valid password
		    And User clicks login button
		    Then User should be able to see the error message on input box as expected	


	@SEAMLES-1927
	Scenario: TC_005-Verify that User can not login with blank password [AutomationS3-ÜTB]
			When User enters valid username
		    And User clicks login button
		    Then User should be able to see the error message on password box as expected	


	@SEAMLES-1928
	Scenario: TC_006-Verify that user can see the password in a form of dots by default [AutomationS3-ÜTB]
			And User enters valid username
		    And User enters valid password
		    Then User should be able to see the password in a form dots	


	@SEAMLES-1929
	Scenario: TC_007-Verify that user can see the password by clicking eye sign image [AutomationS3-ÜTB]
			And User enters valid username
		    And User enters valid password
		    And User clicks the eye icon
		    Then User should be able to see password as a text	


	@SEAMLES-1930
	Scenario: TC_008-Verify that user can see the "Forgot password?" link on the login page  and can see the "Reset Password" button on the next page after clicking on forgot password link
			Then User should be able to see forgot password link
		    And User Click the forgot password link
		    Then User should be able to see Reset Password button	


	@SEAMLES-1931
	Scenario: TC_009-Verify that user can see valid placeholders on Username and Password fields [AutomationS3-ÜTB]
			Given User on the login page
		    Then User should be able to see valid placeholders