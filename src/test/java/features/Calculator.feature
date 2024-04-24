Feature: To Deveolope Calculator

  Background: 
    Given I have the Calculator

  Scenario: To Add Two numbers
    When I add 12 and 6
    Then Should get the Result as 18

  Scenario: To Sub Two numbers
    When I sub 12 and 6
    Then Should get the Result as 6

  Scenario Outline: Add two Numbers with Multiple Data set
    When I add <num1> and <num2>
    Then Should get the Result as <result>

    Examples: 
      | num1 | num2 | result |
      |    7 |    9 |     16 |
      |   12 |   13 |     25 |
      |   -8 |   18 |     10 |

  Scenario: To Add Multiple numbers
    When Add below Nembers
      | 10 |
      | 23 |
      | 45 |
      | 10 |
    Then Should get the Result as 88

  Scenario: To Calculate total bill of all items
    When Buying below items with given price
      | Coffee   |  50 |
      | Icecream | 250 |
      | Choclate |  80 |
    Then Should get the Result as 380

  Scenario: To Calculate total bill of all items with quantity
    When Buying below items with given price and quantity
      | Coffee   | 2 |  50 |
      | Icecream | 2 | 250 |
      | Choclate | 2 |  80 |
    Then Should get the Result as 760
