package tests;

import lombok.Getter;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WikiEventsPage;

@Getter
public class WikiEventsTest extends BaseTest {

    @Test
    public void articlesWithGeoPointsTest() {
        WikiEventsPage wikiEventsPage = new WikiEventsPage();
        wikiEventsPage.openPageForToday();
        int amountOfArticlesForToday = wikiEventsPage.getNumberOfArticlesWithGeoPointsForToday();
        System.out.println(amountOfArticlesForToday);
        wikiEventsPage.openPageForSpecifiedDay();
        int amountOfArticlesForSpecifiedDay = wikiEventsPage.getNumberOfArticlesWithGeoPointsForSpecifiedDay();
        System.out.println(amountOfArticlesForSpecifiedDay);

        Assert.assertEquals(amountOfArticlesForSpecifiedDay, amountOfArticlesForToday,
                "The amount of articles for specific day = " + amountOfArticlesForSpecifiedDay +
                        " is not equal to amount of articles for today = " + amountOfArticlesForToday);
    }
}
