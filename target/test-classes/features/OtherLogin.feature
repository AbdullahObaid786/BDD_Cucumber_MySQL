@OtherLoginFeature
Feature: TechFios Other Login Functionality Validation


Background: 
Given User is on Techfios login page

@OtherLogin1 
Scenario Outline: User Should be able to Login with valid credentials
When User enters username as "<username>"
When User enters password as "<password>"
When User clicks signin button
Then User Should land on dashboard page

Examples:
|	username						| password |
|	demo2@techfios.com	|	abc123	 |
|	demo@techfios.com		|	abc124	 | 						
|	demo2@techfios.com	| abc124	 |