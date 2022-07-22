@tag
Feature: Advanced Calculator
  Scenario: multiply two numbers
    Given Two input values, 3 and 2
    When I do the opt * between them
    Then I expect the result 6

  Scenario: divide two numbers
    Given Two input values, 8 and 2
    When I do the opt / between them
    Then I expect the result 4

  Scenario: power two numbers
    Given Two input values, 3 and 2
    When I do the opt ^ between them
    Then I expect the result 9


  Scenario Outline: All opts with different values
    Given Two input values, <first> and <second>
    When I do the opt <opt> between them
    Then I expect the result <result>
    Examples:
      | first | second | opt | result |
      | 6 | 2 | * | 12 |
      | 6 | 2 | / | 3 |
      | 6 | 2 | ^ | 36 |
      | -6 | 2 | * | -12 |
      | -6 | 2 | / | -3 |
      | -6 | 2 | ^ | 36 |
      | -6 | -2 | * | 12 |
      | -6 | -2 | / | 3 |
      | -6 | 5 | / | -2 |
      | -6 | -2 | ^ | 0 |
