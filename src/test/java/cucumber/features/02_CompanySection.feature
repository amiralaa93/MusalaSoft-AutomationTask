Feature: Check the company section and FB page

  Scenario: Check Company Page
  the user should be able to know the company section and FB page
    Given user on company page
    Then ‘Leadership’ section should be displayed
    When user click the Facebook link from the footer
    Then Verify that the correct URL loads and verify if the Musala Soft profile picture appears on the new page