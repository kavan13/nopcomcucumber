Feature: NopCommerce Login
  As a user I should login in nopcommerce website

  Background: I am on homepage

@Smoke @Regression
  Scenario: User should navigate to login page successfully
    When I click on login link
    Then I see welcome message display

@Sanity @Regression
  Scenario:  verify The Error Message With InValid Credentials
    When I click on login link
    And  I enter email id "xyab@gmail.com"
    And  I enter password "abc123"
    And  I click login
    And I can see error message

@Regression
  Scenario: verify user should login successfully with valid credentials
    When I click on login link
    And  I enter email id "abcd456@gmail.com"
    And  I enter password "abcd123"
    And  I click login
    And I can see logout link display

@Smoke @Regression
  Scenario: verify user should logout successfully
    When I click on login link
    And  I enter email id "abcd456@gmail.com"
    And  I enter password "abcd123"
    And  I click login
    And  I click on logout button
    Then I see login link display