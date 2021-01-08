Feature: to verify scenarios of order page of Amazon website

Background:
Given a resistered user exists
Given user logins the Amzon portal
When user enters valid username
And user enters valid password
Then user clicks on login button
Then user navigates to the Order page

Scenario: check previous order details
When user clicks on Order link
Then user checks previous order details

Scenario: check cancelled order
When user clicks on cancelled Link
Then  user checks the cancelled order

