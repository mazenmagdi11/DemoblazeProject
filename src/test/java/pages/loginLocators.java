package pages;

import com.google.common.annotations.Beta;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class loginLocators {
    WebDriver driver = Hooks.driver;

    public WebElement loginButton() {
       return driver.findElement(By.xpath("//*[@id=\"login2\"]"));
    }

    public WebElement usernameField(){
        return driver.findElement(By.xpath("//*[@id=\"loginusername\"]"));
    }
    public WebElement passwordField(){
        return driver.findElement(By.xpath("//*[@id=\"loginpassword\"]"));
    }
    public WebElement loginConfirm(){
        return driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
    }

    public WebElement welcomeButton() {
        return driver.findElement(By.xpath("//*[@id=\"nameofuser\"]"));
    }
}

