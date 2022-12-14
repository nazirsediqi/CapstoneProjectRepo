Feature: Sign In Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @signInTest
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'farhad.jamaly@tekschool.us' and password 'Abc@123abc'
    And User click on login button
    Then User should be logged in into Account

	@createAccTest
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email                   | password  | confirmPassword |
      | Jamal | Jamal.Zahiry6@tekschool.us | Tek@123756 | Tek@123756       |
    And User click on SignUp button
    Then User should be logged into account page
