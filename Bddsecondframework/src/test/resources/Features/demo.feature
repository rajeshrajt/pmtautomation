Feature: feature to test login functionality
  
  Scenario : check login is successful with valid credentials
    Given user is on login screen
    When user enters username and password
    And clicks on login button
    Then user is navigated to home page
