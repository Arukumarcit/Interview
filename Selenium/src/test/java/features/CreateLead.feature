Feature: Create Lead in Test Leaf application

Scenario: Create Lead

When User enters the Username as 'DemoSalesManager' and Password as 'crmsfa'
And Click Login button
Then Testleaf Home page should be displayed
Then Click on Test lead button
When Enter the company Name as 'TestLead'
And Enter the First Name as 'Hari'
And Enter the Last Name as 'K'
And Click the submit button
