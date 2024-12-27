package stepDefs;

import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.CartValidationLocators;
import pages.CheckOutLocators;

import java.time.Duration;

public class TC05_CheckOutSteps {
    CheckOutLocators CheckOut = new CheckOutLocators();
    CartValidationLocators cart = new CartValidationLocators();
    @And("click on place order button")
    public void click_on_place_order_button(){
        CheckOut.PlaceOrderButton().click();
    }

    @And("fill data name {string} country {string} city {string} card {string} month {string} year {string}")
    public void fill_the_data(String name , String country , String city , String card , String month , String year){
        CheckOut.Name().sendKeys(name);
        CheckOut.Country().sendKeys(country);
        CheckOut.City().sendKeys(city);
        CheckOut.CreditCard().sendKeys(card);
        CheckOut.Month().sendKeys(month);
        CheckOut.Year().sendKeys(year);
    }
    @And("click on purchase button")
    public void click_on_purchase_button(){
        CheckOut.PurchaseButton().click();
    }
    @And ("validate the purchase total amount of money")
    public void validate_the_purchase_total_amount() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElement(CheckOut.messageText(),"Total:"));

        int ExpectedPurchaseTotal = cart.CartTotalPrice();

        int ActualPurchaseTotal = CheckOut.PurchaseTotalMoney();

        System.out.println("Expected total amount in cart : "+ExpectedPurchaseTotal);
        System.out.println("Actual total amount in purchase page : " + ActualPurchaseTotal);


        Assert.assertEquals(ActualPurchaseTotal,ExpectedPurchaseTotal);

    }
    @And ("verify that the purchase completed successfully")
    public void verify_that_the_purchase_completed_successfully(){
        String expectedPurchaseMessage = "Thank you for your purchase!";
        String actualPurchaseMessage = CheckOut.purchaseMessages();

        System.out.println("Expected purchase message : "+expectedPurchaseMessage);
        System.out.println("Actual purchase message : "+actualPurchaseMessage);

        Assert.assertEquals(actualPurchaseMessage,expectedPurchaseMessage);
    }



}
