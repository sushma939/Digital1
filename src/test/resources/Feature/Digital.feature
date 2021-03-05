@Digital
Feature: Digital
  Background:
  User navigate to the BliBli tab

  @test
  Scenario: Verify user able to login the page
    Given User on BliBli page
    When User enters username as "arpitha.riya@mailinator.com"
    And User enter password as "Blibli@123456"
    Then User verify the email
    And User enter in the login page





