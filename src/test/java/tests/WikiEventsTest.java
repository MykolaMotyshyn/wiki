package tests;

import lombok.Getter;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WikiEventsPage;

@Getter
public class WikiEventsTest extends BaseTest {

    @Test
    public void articlesWithGeopointsTest() {
        WikiEventsPage wikiEventsPage = new WikiEventsPage(driver);
        int amountOfArticles = wikiEventsPage.getNumberOfArticlesWithGeopoints();
        System.out.println(amountOfArticles);


        int theNumberOfArt = wikiEventsPage.getNumberOfArticles();
        System.out.println(theNumberOfArt);


        Assert.assertEquals(amountOfArticles, theNumberOfArt);
    }
}
