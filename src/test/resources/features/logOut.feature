@SEAMLES-1921
Feature: Default

	Background:
		#@SEAMLES-1920
		Given user on the login page
		And user enters valid username
		And user enters valid password
		And user clicks login button
		Then user lands on home page
		

	#As a user, I should be able to log out.
	#
	#*AC1-User can log out and ends up in login page*
	#AC2-User can not go to home page again by clicking step back button after successfully logged out.
	@SEAMLES-1919
	Scenario: Verify that user can log out and ends up in login page [AutomationS3-ÜTB]
		When User clicks profile avatar image 
		And User clicks Log out link from opened menu
		Then Log in page should be displayed 
		And User clicks navigate back button on browser
		Then Log in page should be displayed