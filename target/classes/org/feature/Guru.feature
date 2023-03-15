Feature: Guru99 Application 
Scenario: Verify The Title Of Page 
Given User Is On Home Page 
Then Verify The Title OF Page As "Home page"

Scenario: Verify The Title Of Page After Clicking Mobile field
Given User Is On Home Page
When User Click On Mobile Field 
Then Title Should Be Displyed As "Mobile"

Scenario: Click On DropDown 
Given User Is On Home Page 
When User Click On Mobile Field 
When User Click On DropDown 
Then Verify The Sorting Oder