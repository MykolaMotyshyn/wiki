package tests;

import driver.DriverInstance;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void setup() {
        DriverInstance.getDriver();
    }

    @AfterTest
    public void tearDown() {
        DriverInstance.stopBrowser();
    }
}
