package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class CheckOutLocators {
    WebDriver driver = Hooks.driver;

    public WebElement PlaceOrderButton() {
        return driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));
    }

    public WebElement Name() {
        return driver.findElement(By.xpath("//*[@id=\"name\"]"));
    }

    public WebElement Country() {
        return driver.findElement(By.xpath("//*[@id=\"country\"]"));
    }

    public WebElement City() {
        return driver.findElement(By.xpath("//*[@id=\"city\"]"));
    }

    public WebElement CreditCard() {
        return driver.findElement(By.xpath("//*[@id=\"card\"]"));
    }

    public WebElement Month() {
        return driver.findElement(By.xpath("//*[@id=\"month\"]"));
    }

    public WebElement Year() {
        return driver.findElement(By.xpath("//*[@id=\"year\"]"));
    }

    public WebElement PurchaseButton() {
        return driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));
    }

    public int PurchaseTotalMoney() {
        WebElement TotalMoney = driver.findElement(By.xpath("//*[@id=\"totalm\"]"));
        String orderTotal = TotalMoney.getText();
        String priceText = orderTotal.replaceAll("[^0-9]", "");
        return Integer.parseInt(priceText);
    }

    public String purchaseMessages(){
        return driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
    }
    public WebElement messageText(){
        return  driver.findElement(By.xpath("//*[@id=\"totalm\"]"));
    }
}