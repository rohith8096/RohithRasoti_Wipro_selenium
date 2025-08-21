Feature: change name in eBay
@Priority4
Scenario: need to change the name
Given a account should be logged in eBay
When open settings and change name
Then name is sucessfuly changed