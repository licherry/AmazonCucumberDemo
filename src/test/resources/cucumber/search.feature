Feature: Search Goods
  As a user
  I want to correct result by searching
  Scenario: search goods by name
    Given User is on Home Page
    When Input "测试"
    And click search button
    Then Get the result list

#  Scenario: search goods by name
#    Given User is in Home Page
#    When Input "abc"
#    And click search button
#    Then Get the result list

#  Scenario Outline: searching
#    Given User is on Home Page
#    When Input "<name>"
#    And click search button
#    Then Get the result list
#    Examples:
#      | name |
#      | 测试 |

