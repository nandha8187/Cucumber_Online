@DataDriven
Feature: This is the login feature for fb
Scenario Outline: This is login scenario
Given Proceed to login page
When user enters "<UserName>" and password "<Password>" 
And clicked button
Examples: :
|UserName |Password|
|nandharaina0310@gmail.com|Geet1426|
|nandharaina0310@gmail.com|Geetha1426|