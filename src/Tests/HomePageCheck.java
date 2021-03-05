package Tests;

import Helper.OneeMethods;
import Helper.TestBase;
import Helper.TestParameters;
import JsonHelper.ReadJson;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class HomePageCheck extends TestBase implements TestParameters, OneeMethods, ReadJson {

    @Test(priority = 2)
    public void newestCheck() {
        homePage(driver).newestCheck();
    }

    @Parameters({"testUrl"})
    //    String testUrl
    @Test(priority = 1)
    public void mostPopularCheck() {
        driver.get(testUrl);
        responseCode(driver.getCurrentUrl(), responseCode);
        homePage(driver).mostPopular();
    }

    @Test(priority = 3)
    public void logoCheck() throws InterruptedException {
        homePage(driver).logoCheck();
        loginPage(driver).loginButton.click();
    }

    @Test(priority = 4)
    public void trendingDestinationCheck() {
        homePage(driver).trendingDestination();
    }
}
//test
