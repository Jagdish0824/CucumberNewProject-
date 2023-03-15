Feature: DashBoard  page feature
 
Scenario: Verify the DashBoardPage URL 
Given User is on login page
When User enterd the Username 
And User Enter Password 
And User Clicks On Login button
And Dashboard Url is "http://localhost/login.do"


Scenario: Verify the DashBoard Title 
Given User is on login page
When User enterd the Username 
And User Enter Password 
And User Clicks On Login button
And Dashboard Title is "tt "

Scenario: Verify the DashBoardPage DefaultTabs 
Given User is on login page
When User enterd the Username 
And User Enter Password 
And User Clicks On Login button
And Dashboard Displayed 4 tabs 
And By Default "Time- Track" Tab Is Selected  
