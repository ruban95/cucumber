Feature: Validating add datatarif flow

  Scenario Outline: add datataraif validation
    Given user launches the appplication
    And user selected add datatarif option
    When user need to fill up the plan details"<MR>","<FLM>","<FIM>","<FSP>","<LPMC>","<IMPC>","<SPC>"
    And user select submit
    Then user verifys congratulation message

    Examples: 
      | MR  | FLM | FIM | FSP | LPMC | IMPC | SPC |
      | 500 | 200 |  30 |  45 |   78 |   45 | 456 |
      | 100 | 200 |  30 |  45 |   78 |   45 | 562 |
      | 300 | 200 |  30 |  45 |   78 |   45 |  45 |
      | 400 | 200 |  30 |  45 |   78 |   45 |  20 |
