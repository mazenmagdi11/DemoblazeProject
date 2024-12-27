Feature: Verify that the user can login Successfully
  Scenario: Verify that the user can login Successfully
    When Click on the Log in button
    And Login with valid "Mazen.magdi116@gmail.com" and "1234567890"
    And click on login button
    Then verify user login successfully "Mazen.magdi116@gmail.com"

