package Tests;


import Helper.OneeMethods;
import Pages.PropertyDetailPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Helper.TestParameters;


public class PropertyDetail extends Helper.TestBase implements TestParameters, OneeMethods {

    @Parameters({"testProperty06"})
//    String testProperty06
    @Test(priority=1)
    public void askQuestion() {
        driver.get(testProperty06);
        propertyDetailPage(driver).askQuestion(responseCode);

    }

//    @Parameters({"testUrl"})
//    //    String testUrl
//    @Test (priority=1)
//    public void mostPopularCheck() {
//        driver.get(testUrl);
//        PropertyDetailPage detailPage = PageFactory.initElements(driver, PropertyDetailPage.class);
//        detailPage.askQuestion(responseCode);
//    }
//    @Test(priority=3)
//    public  void logoCheck() throws InterruptedException {
//        PropertyDetailPage detailPage = PageFactory.initElements(driver, PropertyDetailPage.class);
//        detailPage.askQuestion(responseCode);
//    }
//    @Test(priority=4)
//    public void trendingDestinationCheck(){
//        PropertyDetailPage detailPage = PageFactory.initElements(driver, PropertyDetailPage.class);
//        detailPage.askQuestion(responseCode);
//    }


}
