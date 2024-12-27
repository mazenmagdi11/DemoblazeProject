package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static stepDefs.Hooks.driver;

public class CartValidationLocators {
    public WebElement CartButton(){
        return driver.findElement(By.xpath("//a[@id='cartur' and text()='Cart']"));
    }
    public String  P1TiTleInCart(){
        return driver.findElement(By.xpath("//td[contains(text(), 'Sony vaio i5')]")).getText();
    }
    public int P1PriceInCart(){
        WebElement Price =  driver.findElement(By.xpath("//td[contains(text(), 'Sony vaio i5')]/following-sibling::td"));
       return Integer.parseInt(Price.getText());

    }
    public String P2TitleInCart(){
        return driver.findElement(By.xpath("//td[contains(text(), 'MacBook air')]")).getText();
    }
    public int P2PriceInCart(){
        WebElement Price = driver.findElement(By.xpath("//td[contains(text(), 'MacBook air')]/following-sibling::td"));
        return Integer.parseInt(Price.getText());

    }
    public int CartTotalPrice(){
        WebElement Totalprice = driver.findElement(By.xpath("//*[@id=\"totalp\"]"));
        return Integer.parseInt(Totalprice.getText());

    }



}
