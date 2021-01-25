@smoke
Feature: As a user I should be able to request a demo
  Background: common steps
    Given user is on the home page
    And user clicks Request a Demo

  Scenario: Robot user should not be able to submit demo request
    When robot user fill out the given form on Request a Demo page
   # And robot user should not be able to pass the reCAPTCHA
    And robot user clicks Submit button
    Then user should be able to see "The reCAPTCHA was invalid. Go back and try it again."

  Scenario: User should see "There was a problem with your submission. Errors have been highlighted below."
    When user fill out the given form with missing required field
    And user clicks Submit button
    Then user should see "There was a problem with your submission. Errors have been highlighted below."

@failed
  Scenario: User should see "Thank you for requesting a demo! We’ll be in touch with you shortly to schedule it."
    When robot user fill out the given form on Request a Demo page
    And user clicks Submit button
    Then user should see "Thank you for requesting a demo! We’ll be in touch with you shortly to schedule it."