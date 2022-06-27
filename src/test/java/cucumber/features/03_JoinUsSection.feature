Feature: Check the error messages when enter invalid data in join us page

  Scenario: InValid Data of JoinUs Page
  the system should show the validation messages for all required data

    Given user in career page
    When user click on ‘Check our open positions’ button
    And filter by location Anywhere
    Then Verify that four main sections are shown
    And Verify that ‘Apply’ button is present at the bottom
    Then user click on ‘Apply’ button
    And user upload a CV document, and click ‘Send’ button
    Then Verify required error messages
    And Verify error messages for invalid scenarios