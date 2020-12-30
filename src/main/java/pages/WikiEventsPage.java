package pages;

import helpers.CountryHelp;
import helpers.CountryHelper;
import helpers.DateHelp;
import helpers.DateHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WikiEventsPage extends BasePage {

    private String wikiEventsUrl = "https://www.wikipedia.com/wiki/";

    @FindBy(xpath = "//div[@class='mw-parser-output']/ul[1]/li/a")
    public List<WebElement> allPageLinks;

    public WikiEventsPage(WebDriver driver) {
        openPage(wikiEventsUrl + DateHelper.getTodayDay());
        openAnotherPage(wikiEventsUrl + DateHelp.getRandomDay());
        PageFactory.initElements(driver, this);
    }

    public int getNumberOfArticlesWithGeopoints() {
        int counter = 0;
        for (WebElement link : allPageLinks) {
            String linkText = link.getText();
//            System.out.println(linkText);
            if (CountryHelper.isLinkContainsCountry(linkText)) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public int getNumberOfArticles() {
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


