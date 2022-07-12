@SEAMLES-1921
Feature: Log out function

	Background:
		#@SEAMLES-1920
		    Given User on the login page
			And User enters valid username
			And User enters valid password
			And User clicks login button
			Then User lands on dashboard module page
		

	@SEAMLES-1919
	Scenario: TC 001 - Verify that user can log out and ends up in login page [AutomationS3-ÜTB]
		When User clicks profile avatar image 
			And User clicks Log out link from dropdown menu
			Then Log in page should be displayed	

	@SEAMLES-1922
	Scenario: TC 002 -Verify that user can not go to home page again by clicking step back button after successfully logged out. [AutomationS3-ÜTB]
		When User clicks profile avatar image 
			And User clicks Log out link from dropdown menu
			Then Log in page should be displayed
			And User clicks navigate back button on browser
			Then Log in page should be displayed