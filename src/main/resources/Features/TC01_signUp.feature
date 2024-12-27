Feature: Verify that User Can Sign Up Successfully
  Scenario: Verify that User Can Sign Up Successfully
    When user press on signup button
    And user signup with valid "Mazen.magdi116@gmail.com" and "1234567890"
    And press on signup button
    Then verify user signup successfully
