Feature: uber Booking features

@Smoke
Scenario: Booking cab Sedan
Given Uber app is open
When user selects car type "sedan" 
And user selects source as "Bangalore" and destination as "Pune"
Then Driver starts the journey after Entering OTP
And Driver ends the joruney 
Then User pays money via Google Pay USD 1000

@Regression
Scenario: Booking cab Suv
Given Uber app is open
When user selects car type "SUV" 
And user selects source as "Bangalore" and destination as "Hyderabad"
Then Driver starts the journey after Entering OTP
And Driver ends the joruney 
Then User pays money via Google Pay USD 5000

@Produ
Scenario: Booking cab Mini
Given Uber app is open
When user selects car type "Mini" 
And user selects source as "Pune" and destination as "Mumbai"
Then Driver starts the journey after Entering OTP
And Driver ends the joruney 
Then User pays money via Google Pay USD 500