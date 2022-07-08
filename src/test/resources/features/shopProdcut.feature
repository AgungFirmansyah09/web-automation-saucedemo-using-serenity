@shop-products
  Feature: Add to Cart product
    As a user
    I Want to perform Add product to cart
    and my cart added

  @Add-cart
  Scenario: user successfully add cart product
    Given I already in home page
    When I click add to cart any product
    Then I see my cart added


  @Checkout-cart
  Scenario: user successfully checkout product in cart
    Given I see my cart value
    When I click button checkout
    And I view checkout information
    And I Input First Name
    And I Input Last Name
    And I Input Zip Code
    And I click Button Continue
    And I View checkout Overview
    And I click button finish
    Then I finish the order

