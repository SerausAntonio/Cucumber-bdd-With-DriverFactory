package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class MyStepdefs {
    WebDriver driver;
    @Given("I am on the store page")
    public void iAmOnTheStorePage() {
        driver = DriverFactory.getDriver();
        driver.navigate().to("https://askomdch.com/");
        System.out.println("I am on the store page");
    }

    @When("I add a {string} to the Cart")
    public void iAddAToTheCart(String arg0) {
        System.out.println("I add to the cart " + arg0);
    }

    @Then("I see {int} {string}in the Cart")
    public void iSeeInTheCart(int arg0, String arg2) {
        System.out.println("Amount is " + arg0 + " " + arg2);
    }
}
