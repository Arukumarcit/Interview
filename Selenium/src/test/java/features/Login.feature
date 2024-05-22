Feature: Login to TestLeaf application



#Scenario: User Login to TestLeaf application with Valid credentials
#When User enters the Username as "DemoSalesManager" and Password as "crmsfa"
#And Click Login button
#Then Testleaf Home page should be displayed.

Scenario Outline: User Login to TestLeaf application with Valid credentials
When User enters the Username as <username> and Password as <password>
And Click Login button
Then Testleaf Home page should be displayed

Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|
