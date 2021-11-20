Feature: Hotel Booking Functionality in Adactin Application

Scenario Outline: User Login to Adcatin functionality
Given User Launch the Adactin Application
When User Enter valid "<username>" in the username field
And User Enter valid "<password>" in password field
And User clicks the Login Button
Then User navigates to the search hotel page

Examples:
|username|password|
|AAA|111|
|BBB|222|
|Sreenath|Sreenath@123|

Scenario: User searching hotel in adactin

Given It navigates to search hotel page
When User Select the location
And User Select the Hotel
And User Select the Room Type
And User choose the CheckInDate
And User choose the CheckOutDate
And User Select the AdultsPerRoom
And User Select the ChildrensPerRoom
And User click the search button
Then User navigates to Select Hotel page

Scenario: User Selecting Hotels

Given It navigates to search hotel page
When User select the hotel which is displayed.
And User click the continue button
Then User navigates to Book a Hotel Page

Scenario: Book a Hotel Page

Given It navigates to book a hotel page
When User enters the First Name
And User enter the LastName
And User enter the Billing Address
And User enter the CreditCardNo
And User Select the CreditCard Type
And User Select the Expire Date for month
And User Select the Expire Date of year
And User Enter the CVV
And click the BookNow Button





