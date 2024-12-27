package stepDefs;

import io.cucumber.java.en.And;
import org.testng.Assert;
import pages.AddProductsToCartLocators;
import pages.CartValidationLocators;
import pages.StoreData;

public class TC04_CartValidation {
    CartValidationLocators Cart = new CartValidationLocators();


    @And("Click on the Cart button in the Header")
    public void Click_on_the_Cart_button_in_the_Header() throws InterruptedException {
        Thread.sleep(2000);
        Cart.CartButton().click();
    }

    @And("Verify product1 added with the same title and price")
    public void Verify_product1_added_with_the_same_title_and_price() {
      String ProductTitle1 = StoreData.ProductName1;
      String CartProductTitle1 = Cart.P1TiTleInCart();
      int ProductPrice1 = StoreData.ProductPrice1;
      int CartProductPrice1 = Cart.P1PriceInCart();
      Assert.assertEquals(ProductTitle1, CartProductTitle1);
      Assert.assertEquals(ProductPrice1, CartProductPrice1);

    }

    @And("Verify product2 added with the same title and price")
    public void Verify_product2_added_with_the_same_title_and_price() {
        String ProductTitle2 = StoreData.ProductName2;
        String CartProductTitle2 = Cart.P2TitleInCart();
        int ProductPrice2 = StoreData.ProductPrice2;
        int CartProductPrice2= Cart.P2PriceInCart();
        System.out.println("Mac-product name : "+ProductTitle2);
        System.out.println("Mac-cart name : "+CartProductTitle2);

        System.out.println("Mac-product price : "+ProductPrice2);
        System.out.println("Mac-cart price : "+CartProductPrice2);


        Assert.assertEquals(ProductTitle2, CartProductTitle2);
        Assert.assertEquals(ProductPrice2, CartProductPrice2);




    }

    @And("Verify Total Amount Calculation")
    public void Verify_Total_Amount_Calculation() {
        int expectedTotal = Cart.P1PriceInCart()+ Cart.P2PriceInCart();
        int actualTotal = Cart.CartTotalPrice();
        System.out.println("expected total price : "+ expectedTotal);
        System.out.println("actual total price :"+ actualTotal);
        Assert.assertEquals(actualTotal, expectedTotal);



    }
}