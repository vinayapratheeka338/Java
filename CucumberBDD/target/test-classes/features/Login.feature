Feature: Login functionality
Scenario: Successful login with valid credentials
Given User launch the browser
When User open the login page
And User enters valid username and password
And User clicks on login button
Then User should be redirected to productspage