Feature: Login
  @DRBP-001
  Scenario Outline: Login successfully
    Given User access website
    And User close promotion
    And User click on Account link
    And User click on Login by email
    When User enters "<username>" and "<password>"
    And User click on Login button
    And User solves CAPTCHA manually
    Then User login successfully
    Examples:
      |username|password|
      |nhungvu214@gmail.com|Abc@12345|
      |nhungvu214@gmail.com|Abc@1235|





