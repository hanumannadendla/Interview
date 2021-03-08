#Author: hanuman nadendla hanuma466@gmail.com


## one of the scenario is repeating twice.
@currency
Feature: Currency validations and calculations
 

  @currency
  Scenario: Need to verify the right count of values appear on the screen
    Given Launch test url
    When table displayed
    Then validate right count of values
    
    
   @currency
  Scenario: Need to verify the values on the screen are greater than 0
    Given Launch test url
    When table displayed
    Then validate the values are greater than zero
    
   @currency
  Scenario: Need to verify the total balance is correct based on the values listed on the screen    / Need to verify the total balance matches the sum of the values
    Given Launch test url
    When table displayed
    Then validate the total balence and values listed on the screen count should be same
    
   @currency
  Scenario: Need to verify the values are formatted as currencies
    Given Launch test url
    When table displayed
    Then validate the values are in  correct format or not
    
    
    
    
   
     
