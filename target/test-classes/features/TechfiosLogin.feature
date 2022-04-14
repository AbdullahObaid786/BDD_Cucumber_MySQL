@obaid_regression
Feature: TechFios billing Login Functionality Validation

Background: 
Given User is on Techfios login page

@TechfiosLogin1 
Scenario: User Should be able to Login with valid credentials
When User enters username as "demo@techfios.com"
When User enters password as "abc123"
When User clicks signin button
Then User Should land on dashboard page

@TechfiosLogin2	 
Scenario: User Should be able to Login with valid credentials from Database
When User enters "username" from database
When User enters "password" from database
When User clicks signin button
Then User Should land on dashboard page