Feature: Test G-mail smoke scenario

  Scenario Outline: Test login with valid credentials
    Given Open firefox and start application
    When I enter valid "<username>" and valid "<password>"
    Then user should able to login successfully
    Then application should be closed

    Examples: 
      | username             | password |
      | vnani@rocketmail.com | sathwika |
