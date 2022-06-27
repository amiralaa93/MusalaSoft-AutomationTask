Feature: Check the available positions by available cities Sofia and Skopje

  Scenario: Positions Page
  Check the available positions.
    Given user at career page
    When user click ‘Check our open positions’ button
    And user filter the available positions by Sofia city
    Then print in the console the list with available positions in Sofia
    And user filter the available positions by Skopje city
    Then print in the console the list with available positions in Skopje