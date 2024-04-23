package page;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static utility.browserDriver.driver;

public class basePageObjects {
    //Element ID's
    By search = By.id("input");
    By username = By.id("INT_USERNAME");
    By password = By.id("INT_PASSWORD");
    By login = By.id("INT_LOGIN_BTN");
    By loginErrorMessage = By.xpath("//*[@id='INT_MESSAGE_WRAPPER']/span");
    By forgotPassword = By.id("INT_FORGOT_PWD_LINK");
    By usernameSearchField = By.id("cn");
    By usernameSearchBtn = By.id("submitBtn");
    By searchUserErrorMessage = By.id("message");
    By cancelBtn = By.id("button-cancelButton");

//Methods
    public void searchFor(String value) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(search)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(search)).sendKeys(value);
    }
    public void enterUsername(String user) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(username)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys(user);
    }
    public void enterPassword(String pass) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(pass);
    }
    public void clickLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(login)).click();
    }
    public void verifyErrorMessageText(String message) {
           Assert.assertEquals(driver.findElement(loginErrorMessage).getText(), message);
    }
    public void clickForgotPassword() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(forgotPassword)).click();
    }
    public void searchForUsername(String name) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameSearchField)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameSearchField)).sendKeys(name);
    }
    public void clickSearch() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameSearchBtn)).click();
    }
    public void verifyUserFound(String name) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameSearchBtn)).isDisplayed();
    }
    public void verifyUserNotFound(String message){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchUserErrorMessage)).isDisplayed();
        Assert.assertEquals(driver.findElement(searchUserErrorMessage).getText(), message);
    }
    public void clickCancel() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(cancelBtn)).click();
    }


}
