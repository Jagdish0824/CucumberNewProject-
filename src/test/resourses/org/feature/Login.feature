Feature: Login page feature

Scenario: Validate Login Page
Given User is on login page 
Then Username field is displayed 
And Password field is displyed 
And Keep me login cheack box is displyed 
And Login button is displayed 
And Login logos are displayed 
 
Scenario: Verify the Login Functionality 
Given User is on login page
When User enterd the Username 
And User Enter Password 
And User Clicks On Login button
And Dashboard Url is "http://localhost/login.do"
And Dashboard Title is "tt "
And Dashboard Displayed 4 tabs 
 
