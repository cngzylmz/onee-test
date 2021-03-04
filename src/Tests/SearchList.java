package Tests;

import Helper.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SearchList extends TestBase {

    private final int responseCode = 200;
    private final String testUrl = "https://dev.onee.com";
    private final String testProperty06 = "https://dev.onee.com/detail/10474";


//    @Test (priority=2)
//    public void newestCheck() {
//        Pages.HomePage homePage = PageFactory.initElements(driver, Pages.HomePage.class);
//        homePage.newestCheck();
//    }

//    @Parameters({"testUrl"})
//    //    String testUrl
//    @Test (priority=1)
//    public void mostPopularCheck() {
//        driver.get(testUrl);
//        Pages.HomePage homePage = PageFactory.initElements(driver, Pages.HomePage.class);
//        homePage.mostPopular();
//    }

    @Parameters({"responseCode", "testUrl", "testProperty06"})
    //    int responseCode, String testUrl, String testProperty06
    @Test (priority=3)
    public void searchListCheck() {
        driver.get(testUrl);
        Pages.SearchListPage homePage = PageFactory.initElements(driver, Pages.SearchListPage.class);
        homePage.searchListCheck(testProperty06, responseCode);
    }

}
