package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class Hook {
    WebDriver driver;

    @Before("@regression")
    public void setUp(Scenario scenario){
        driver = DriverFactory.initializeDriver();
        System.out.println(scenario.getName());

    }
    @AfterStep
    public void afterSteps(Scenario scenario){
        if(scenario.isFailed()) {
            System.out.println(scenario.isFailed());
        }
    }
    @After("@regression")
    public void tearDown(Scenario scenario){
        System.out.println("Scenario: "+ scenario.getName() + ", has " + scenario.getStatus());
        driver.quit();
    }

}
