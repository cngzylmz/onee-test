package Tests;

import Helper.OneeMethods;
import Helper.TestBase;
import Helper.TestParameters;
import JsonHelper.ReadJson;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PmDashboard extends TestBase implements OneeMethods, TestParameters, ReadJson {
    @Parameters({"responseCode", "testUrl"})
    //    int responseCode, String testUrl
    @Test
    public void Dashboard() throws InterruptedException {
        driver.get(testUrl);
        responseCode(driver.getCurrentUrl(), responseCode);
        pmPage(driver).dashboard();
        responseCode(driver.getCurrentUrl(), responseCode);
        pmPage(driver).viewUpcoming();
        Thread.sleep(3000);
        pmPage(driver).viewProperty();


    }

}
