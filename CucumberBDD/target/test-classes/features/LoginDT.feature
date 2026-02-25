Feature: Login functionality
Scenario: Login with multiple users
Given User launches the browser
When User opens the login page
And User enters credentials and click on login 
    | standard_user | secret_sauce |
    | locked_out_user | secret_sauce |
Then User should be redirected to newpage