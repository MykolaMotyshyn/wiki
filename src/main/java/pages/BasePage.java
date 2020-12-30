package pages;

import driver.DriverInstance;

public abstract class BasePage {

    public void openPage(String url) {
        DriverInstance.getDriver().navigate().to(url);
    }

    public void openAnotherPage(String url) {
        DriverInstance.getDriver().navigate().to(url);
    }

    public abstract int getNumberOfArticles();
}
