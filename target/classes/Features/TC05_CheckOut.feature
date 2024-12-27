Feature: Ensure that the user can successfully complete the purchase

  Scenario: Ensure that the user can successfully complete the purchase
    When Click on the Log in button
    And Login with valid "Mazen.magdi116@gmail.com" and "1234567890"
    And click on login button
    Then verify user login successfully "Mazen.magdi116@gmail.com"
#    And Click on Laptops under categories on the homepage
#    And Choose Product 1
#    And click on add to cart button
#    And Validate that Product has been successfully added to the cart
#    And navigate to laptops page
#    And Choose Product 2
#    And click on add to cart button
#    Then Validate that Product has been successfully added to the cart
    And Click on the Cart button in the Header
    And Verify product1 added with the same title and price
    And Verify product2 added with the same title and price
    And Verify Total Amount Calculation
    And click on place order button
    And validate the purchase total amount of money
    And fill data name "Mazen" country "EGYPT" city "CAIRO" card "1111222233334444" month "11" year "29"
    And click on purchase button
    Then verify that the purchase completed successfully
