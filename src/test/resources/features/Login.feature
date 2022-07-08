@Login-Feature
Feature: Login - saucedemo.com
  As a user
  I Want to perform login on saucedemo.com
  and i can Directory to my home pages

  @Login-Successfully
  Scenario: User Login Successfully
    Given I Open saucedemo Login Page
    When I Input valid username
    And I Input valid password
    And I Click button login
    Then I can see my home page

  @Login-Unsuccessfully
  Scenario: User Login Unsuccessfully
    Given I Open saucedemo Login Page
    When I input wrong username
    And I Input valid password
    And I Click button login
    Then I can see error message