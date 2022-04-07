Feature: Login Functionality

Scenario: Validate login functionality with valid user name and password
Given User is on Login page
When User enters username as "hemant" and password as "54321"
And clicks on login button
Then User logged in successfully 
Then "welcome" page displayed


Scenario: Validate login functionality with valid user name and password
Given User is on Login page
When User enters username as "navya" and password as "12345"
And clicks on login button
Then User logged in successfully 
Then "home" page displayed


Scenario: Validate registration functionality
Given User is on landing page
When User clicks on Sign Up link
And User enters following details
|1234|hemant|dhavle|hemantd17@gmail.com|
Then Welcome screen is displayed


Scenario Outline: Validate login functionality with valid user name and password
Given User is on Login page
When User enters user name as <username> and password as <password>
And clicks on login button
Then User logged in successfully 

Examples:
|username|password|
|hemant1|password1|
|hemant2|password2|
|hemant3|password3|