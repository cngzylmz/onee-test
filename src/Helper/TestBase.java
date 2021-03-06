package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
    }

    @AfterMethod
    public void afterMethod() {
    }

    @BeforeClass
    public void beforeClass() {
    }

    @AfterClass
    public void afterClass() {
    }

    @BeforeTest
    public void beforeTest() {
    }

    @AfterTest
    public void afterTest() {
    }

    @BeforeSuite
    public void beforeSuite() {
//		System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\cngz\\Desktop\\eclipse\\workspace\\Selenium\\selenium-pack\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }

    /*
     * @Test(dataProvider = "dp") public void f(Integer n, String s) {
     *
     * }
     */
    /*
     * @DataProvider public Object[][] dp() {
     * return new Object[][] {
     * {1, "a" },
     * { 2, "b" },
     * };
     * }
     */
}
