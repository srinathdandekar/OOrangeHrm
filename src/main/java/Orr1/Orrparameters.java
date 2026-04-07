package Orr1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orrparameters {

    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    // Constructor
    public Orrparameters(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement user;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement pass;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginbutton;

    public void enterUsername(String username) {
        wait.until(ExpectedConditions.visibilityOf(user));
        user.sendKeys(username);
    }

    public void enterPassword(String password) {
        pass.sendKeys(password);
    }

    public void clickLogin() {
        loginbutton.click();
    }
}