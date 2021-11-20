Feature: Doctor booking functionality in Drcare247

Scenario Outline: User login to Drcare247 functionality
Given User Launch the Drcare247 application
When User enter the valid <> username field
And User enter the valid <> password field
And User Click the Login button
Then User navigates to Dashboard page