Feature: Validating add customer flow

  Scenario: add customer validation
    Given user launches telecom application
    And user click on add customer option
    When user need to fill up all the fields
    And user click on submit
    Then user verifys the custemer id is generated

  Scenario: add customer validation by data provider concept with 1d list
    Given user launches telecom application
    And user click on add customer option
    When user need to fill up all the data by using one dim list
      | kishor | kumar | rubankumar48@gmail.com | uthukottai | 7338929591 |
    And user click on submit
    Then user verifys the custemer id is generated

  Scenario: add customer validation by data provider concept with 1d  map
    Given user launches telecom application
    And user click on add customer option
    When user need to fill up all the data by using one dim map
      | fname  | kishore                |
      | lname  | kumar                  |
      | email  | rubankumar95@gmail.com |
      | add    | uthukottai             |
      | mobile |             7338929591 |
    And user click on submit
    Then user verifys the custemer id is generated

  Scenario: add customer validation by data provider concept with 2d list
    Given user launches telecom application
    And user click on add customer option
    When user need to fill up all the data by using two dim list
      | ruban    | ku    | rubankumar48@gmail.com | uthukottai |  4541315 |
      | kishor   | kumar | rubankuar48@gmail.com  | uukottai   |  6532121 |
      | ram      | umar  | rubankar48@gmail.com   | uthottai   |  8466465 |
      | cucumber | mainr | rubamar48@gmail.com    | uthukoti   | 73389591 |
    And user click on submit
    Then user verifys the custemer id is generated

  Scenario: add customer validation by data provider concept with 2d map
    Given user launches telecom application
    And user click on add customer option
    When user need to fill up all the data by using two dim map
      | fname    | lname | email                  | add        | mobile     |
      | ruban    | ku    | rubankumar48@gmail.com | uthukottai | 7338929591 |
      | kishor   | kumar | rubkumar48@gmail.com   | thukottai  |  486548786 |
      | ram      | umar  | rubankmar48@gmail.com  | uthukttai  |  487465786 |
      | cucumber | mainr | rubakumar48@gmail.com  | uthukttai  |   95964878 |
    And user click on submit
    Then user verifys the custemer id is generated
