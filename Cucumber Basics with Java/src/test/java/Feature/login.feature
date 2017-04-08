Feature:Login feature
  Scenario:Login with correct username and password
    Given I navigate to the login page
    And I enter the users email address as Email:admin
    And I verify the count of salary digits for Rs 1000
    And I just need to see how step looks for cucumber-Java8
    And I enter the following for login
      | username | password      |
      | admin    | adminpassword |
    And I click login button
    Then I should see the userform page






