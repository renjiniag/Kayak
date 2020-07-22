Feature: functionality of application

Scenario Outline: Verify Origin and Destination
Given Open  browser and enter url
When Enter "<Origin>" and "<Destination>" Cities
And Departure and Return dates are selected
And Click Search
Then Verify "<Origin>" and "<Destination>" Details 

Examples:
|Origin|Destination|
|LAX|SFO|
|LAX|BUF|
|SFO|BUF|

