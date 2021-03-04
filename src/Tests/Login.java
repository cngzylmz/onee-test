package Tests;


import Helper.OneeMethods;
import Helper.TestBase;
import Helper.TestParameters;
import JsonHelper.ReadJson;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login extends TestBase implements OneeMethods, TestParameters, ReadJson {

    @Parameters({"userName", "password", "profileName", "responseCode", "testUrl"})
//    String userName, String password, String profileName, int responseCode, String testUrl
    @Test
    public void loginCheck() {
        driver.get(testUrl);
        responseCode(driver.getCurrentUrl(), responseCode);
        loginPage(driver).loginButton();
        loginPage(driver).userInfo(userName, password);
        loginPage(driver).submitButton();
        loginPage(driver).checkName(profileName);
    }
}
