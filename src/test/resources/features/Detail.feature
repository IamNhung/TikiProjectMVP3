Feature: Detail functionality
  Background:
    Given User is on the homepage
  @DRBP-003
  Scenario Outline: View detail product
    When User searches for a "<keyword>"
    And User click on product
    Then Product's detail is displayed
    Examples:
      |keyword|
      |bút chì|
