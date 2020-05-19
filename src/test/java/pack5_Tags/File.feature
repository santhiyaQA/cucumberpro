Feature: Addition of number
 
@Addition
Scenario: Addition
    Given the number is 50
    And add the number with 20
    And select the Enter button
    Then result is displayed  
@Sub 
Scenario: Subraction
    Given the number is 50
    And sub the number with 30
    And select the Enter button
    Then result is displayed
@Multiply  
Scenario: Multiply
    Given the number is 50
    And Multiply the number with 3
    And select the Enter button
    Then result is displayed
@divide
Scenario: Division
    Given the number is 50
    And divide the number with 2
    And select the Enter button
    Then result is displayed