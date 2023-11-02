Feature: login to the OrangeHRM page

Scenario: login to the OrangeHRM using the valid credentials


Given user is given with a url
When user will give a username and password
And user click the login
Then user should be able to login successfully and go to home page
