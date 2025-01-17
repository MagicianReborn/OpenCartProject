Feature: Register Functionality for OpenCart E-commerce Website

  As a user of the OpenCart website
  I want to be able to register in with valid details
  So that I can access my account-related features and manage my orders

  Background:
    Given I am on the OpenCart register page

  Scenario: Successful register with valid credentials
    Given I have entered a valid details
    When I click on the continue button
    Then I should be able to register successfully
