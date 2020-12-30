package tests;

import driver.DriverInstance;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void startBrowser() {
       driver = DriverInstance.getDriver();
    }

    @AfterTest
    public void browserDead() {
        DriverInstance.stopBrowser();
    }
}
