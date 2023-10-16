package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToTheURL(String URL){
        driver.navigate().to(URL);
    }
    public void waitForElementToBeClickable(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }
    public String getText(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.elementToBeClickable(by)).getText();
    }
}
