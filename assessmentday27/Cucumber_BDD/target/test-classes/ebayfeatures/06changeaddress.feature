Feature: Change address in eBay
@Priority5
Scenario: address need to be changed
Given ebay website should be opend and a accunt should be loggedin
When click on accountsettings and change address
Then address changed sucessfully 