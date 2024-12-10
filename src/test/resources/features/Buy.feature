Feature: Add to cart functionality
  Background:
    Given User is on the homepage
  @DRBP-004
  Scenario Outline: Add product to cart successfully
    When User searches for a "<keyword>"
    And User click on product
    And User click on add to cart button
    Then Message is displayed
    And User click on Cart
    Then Product is added to cart
    And User click on Buy
    Then Payment page is displayed

    Examples:
      |keyword|
      |bút chì|
