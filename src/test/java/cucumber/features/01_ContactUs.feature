Feature: Check Contact Us Page

  Scenario Outline: Check Invalid Scenario in contact us page
  the user should be able to view the error message

    Given User is on the home page
    When User Scroll down and go to ‘Contact Us’
    Then User Fill all required fields with invalid email "<name>", "<email>", "<mobile>", "<subject>", "<message>"
    And User click on Send Button
    Then Verify that error message appears

    Examples:
      | name    | email            | mobile       | subject | message |
      | Amir    | amir.alaa@       | 201095804320 | test1   | test1   |
      | Ahmed   | ahmed.ahmed@     | 201095804320 | test2   | test2   |
      | Ebrahim | ebrahim.ebrahim@ | 201095804320 | test3   | test3   |
      | Mostafa | mostafa.mostafa@ | 201095804320 | test4   | test4   |
      | Mohamed | mohamed.mohamed@ | 201095804320 | test5   | test5   |
