package Tests;

import Helper.OneeMethods;
import Helper.TestBase;
import Helper.TestParameters;
import JsonHelper.ReadJson;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Register extends TestBase implements ReadJson, OneeMethods, TestParameters {
    @Parameters({"responseCode", "testUrl"})
    @Test
    public void RegisterPage() throws InterruptedException {
        driver.get(testUrl);
        responseCode(driver.getCurrentUrl(), responseCode);
        register(driver).registerButton();
        register(driver).registerInputs();
        register(driver).profilePolicyCheck();
        register(driver).sendRegisterForm();
		responseCode(driver.getCurrentUrl(),responseCode);
    }

}
