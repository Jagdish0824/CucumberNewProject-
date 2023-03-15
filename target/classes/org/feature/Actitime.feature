Feature: ActiTime Dashboard Feature 
Scenario: Vefy The Login Page Of ActiTime 
Given User Is On Login Page 
When User Enters UserName 
And User Enters PassWord 
And user Click on Login Button 
Then Expected URL Should be "http://localhost/user/submit_tt"
