Feature: add an item to cart
@Priority3
Scenario: use add to cart btm
Given eBay should be opend in web browser
When search an iteam and add it into cart
Then item is added to cart
When click on cart and delete item
Then delted from cart