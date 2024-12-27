package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class AddProductsToCartLocators {
    WebDriver driver = Hooks.driver;
public WebElement laptops(){
    return driver.findElement(By.partialLinkText("Lapto"));
}
public WebElement product1(){
    return driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));
}
public WebElement addToCartButton(){
    return driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
}
    public WebElement product2(){
        return driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a"));
}
public void backward(){
    driver.navigate().back();
    driver.navigate().back();
}
public void ProductName1(){
    WebElement ProductName1=  driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/h2[text()='Sony vaio i5']"));
    StoreData.ProductName1=ProductName1.getText();

}
public void ProductPrice1(){
   WebElement price = driver.findElement(By.xpath("//h2[text()='Sony vaio i5']/following-sibling::h3[@class='price-container']"));
    String PriceText = price.getText();
    StoreData.ProductPrice1=Integer.parseInt(PriceText.replaceAll("[^0-9]", ""));

}
public void ProductName2(){
    WebElement ProductName2 = driver.findElement(By.xpath("//h2[contains(text(), 'MacBook air')]"));
    StoreData.ProductName2 = ProductName2.getText();
}
    public void ProductPrice2(){
        WebElement price = driver.findElement(By.xpath("//h2[text()='MacBook air']/following::h3[@class='price-container']"));
        String PriceText = price.getText();
        StoreData.ProductPrice2 =  Integer.parseInt(PriceText.replaceAll("[^0-9]", ""));
}

}
