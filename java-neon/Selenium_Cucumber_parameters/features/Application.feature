Feature:Test G-mail smoke scenario
Scenario:Test login with valid credentials
    Given Open firefox and start application
    When I enter valid "vnani@rocketmail.com" and valid "sathwika143"
    Then user should able to login successfully