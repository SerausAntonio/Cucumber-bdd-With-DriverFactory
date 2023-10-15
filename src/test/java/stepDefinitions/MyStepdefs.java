package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyStepdefs {
    WebDriver driver;
    @Given("I am on the store page")
    public void iAmOnTheStorePage() {
        driver = DriverFactory.getDriver();
        driver.navigate().to("https://askomdch.com/");
    }

    @When("I add a {string} to the Cart")
    public void iAddAToTheCart(String product) {
        driver.findElement(By.linkText("Blue Shoes")).click();
        driver.findElement(By.name("add-to-cart")).click();
    }
    @Then("I see {int} {string}in the Cart")
    public void iSeeInTheCart(int count, String product) {
        System.out.println(driver.findElement(By.className("count")).getText());
        System.out.println(driver.findElement(By.xpath("//*[@class='woocommerce-message']")).getText());
        driver.findElement(By.xpath("//*[@class='woocommerce-message']/a")).click();

        System.out.println("Amount is " + count + " " + product);
    }
}
