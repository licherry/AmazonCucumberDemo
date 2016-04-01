Feature: Search Goods
  As a user
  I want to correct result by searching
  Scenario: search goods by name
    Given User is in Home Page
    When Input name in the search field
    And click search button
    Then Get the result list
