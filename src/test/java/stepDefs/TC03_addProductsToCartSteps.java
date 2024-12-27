package stepDefs;

import io.cucumber.java.en.And;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.AddProductsToCartLocators;

import java.time.Duration;

import static stepDefs.Hooks.driver;

public class TC03_addProductsToCartSteps {

    AddProductsToCartLocators product = new AddProductsToCartLocators();
    @And("Click on Laptops under categories on the homepage")
    public void Click_on_Laptops_under_categories_on_the_homepage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nameofuser\"]")));
        product.laptops().click();
        Thread.sleep(2000);
    }
    @And("Choose Product 1")
    public void Choose_Product_1(){
        product.product1().click();
        product.ProductName1();
        product.ProductPrice1();
    }
    @And("click on add to cart button")
    public void click_on_add_to_cart_button(){
        product.addToCartButton().click();
    }
    @And("Validate that Product has been successfully added to the cart")
    public void  Validate_that_Product_has_been_successfully_added_to_the_cart(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String ExpectedResult = "Product added.";
        String ActualResult = alert.getText();
        Assert.assertEquals(ActualResult , ExpectedResult);
        alert.accept();

    }
    @And("navigate to laptops page")
    public void navigate_to_laptops_page(){
        product.backward();
    }
    @And("Choose Product 2")
    public void Choose_Product_2(){
        product.product2().click();
        product.ProductName2();
        product.ProductPrice2();
    }



}
