Feature: Ensure that the user can add products to the cart

  Scenario: Ensure that the user can add products to the cart
    When Click on the Log in button
    And Login with valid "Mazen.magdi116@gmail.com" and "1234567890"
    And click on login button
    Then verify user login successfully "Mazen.magdi116@gmail.com"
    And Click on Laptops under categories on the homepage
    And Choose Product 1
    And click on add to cart button
    And Validate that Product has been successfully added to the cart
    And navigate to laptops page
    And Choose Product 2
    And click on add to cart button
    Then Validate that Product has been successfully added to the cart





