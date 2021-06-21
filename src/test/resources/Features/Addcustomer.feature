#Author: your.email@your.domain.com
#Keywords Summary :
Feature: Validating add customer flow
  
  Scenario: add customer validation
    Given user launches telecom application
    And user click on add customer option
    When user need to fill up all the fields
    And user click on submit
    Then user verifys the custemer id is generated

