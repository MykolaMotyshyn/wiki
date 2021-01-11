package pages;

import driver.DriverInstance;
import helpers.CountryHelp;
import helpers.CountryHelper;
import helpers.DateHelp;
import helpers.DateHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WikiEventsPage {

    private String wikiEventsUrl = "https://www.wikipedia.com/wiki/";

    @FindBy(xpath = "//div[@class='mw-parser-output']/ul[1]/li/a")
    public List<WebElement> allPageLinks;

    public WikiEventsPage() {
        PageFactory.initElements(DriverInstance.getDriver(), this);
    }

    public void openPageForToday() {
        openPage(wikiEventsUrl + DateHelper.getTodayDay());
    }

    public void openPageForSpecifiedDay() {
        openPage(wikiEventsUrl + DateHelp.getSpecifiedDay());
    }

    private void openPage(String url) {
        DriverInstance.getDriver().navigate().to(url);
    }

    public int getNumberOfArticlesWithGeoPointsForToday() {
        int counter = 0;
        for (WebElement link : allPageLinks) {
            String linkText = link.getText();
            if (CountryHelper.isLinkContainsCountry(linkText)) {
                counter++;
            }
        }
        return counter;
    }

    public int getNumberOfArticlesWithGeoPointsForSpecifiedDay() {
        int count = 0;
        for (WebElement links : allPageLinks) {
            String text = links.getText();
            if (CountryHelp.isCountryPresent(text)) {
                count++;
            }
        }
        return count;
    }
}


