Feature: Search functionality
  Background:
    Given User is on the homepage
  @DRBP-002
  Scenario Outline: Search with a valid keyword
    When User searches for a "<keyword>"
    Then Results related to keyword are displayed
    Examples:
    |keyword|
    |bút chì|
    |bút máy|

