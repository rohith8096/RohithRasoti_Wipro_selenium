Feature: check user is able to login with valid credetials
Scenario Outline: check for valid and invalid credentials

Given login page should be open in default browser
When click on login button and enter <username1>
And add <password1>
And click on signin button check <status>
Then login successfully and open home page
Examples:
|username1|password1|fail|
|438547|password|fail|
|dmmdkf|djfjv|fail|
||||
|username|password|success|