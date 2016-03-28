Feature: Login Action
  Scenario: Successful Login in Amazon website
    Given User is on Home Page
    When User Navigate to Login Page
    And User enters UserName and Password
    Then Back to Home Page