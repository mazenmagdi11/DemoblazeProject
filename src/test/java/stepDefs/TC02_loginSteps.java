package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import pages.loginLocators;

import java.time.Duration;

import static stepDefs.Hooks.driver;

public class TC02_loginSteps {
    loginLocators login = new loginLocators();

    @When("Click on the Log in button")
    public void UserClickOnLoginButton() throws InterruptedException {
        login.loginButton().click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"loginusername\"]")));

    }

    @And("Login with valid {string} and {string}")
    public void user_login_with_valid(String username, String password) {
        login.usernameField().sendKeys(username);
        login.passwordField().sendKeys(password);

    }

    @And("click on login button")
    public void click_on_login_button() {
        login.loginConfirm().click();
    }
    @Then("verify user login successfully {string}")
    public void verify_login(String name){
        SoftAssert softAssert = new SoftAssert();
        String actualResult = login.welcomeButton().getText();
        String expectedResult = "Welcome "+name;
        softAssert.assertEquals(actualResult, expectedResult);

    }
}
