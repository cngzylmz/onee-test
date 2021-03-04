package Pages;

import Helper.OneeMethods;
import Helper.OneeWebElements;
import Helper.TestParameters;
import JsonHelper.ReadJson;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class SearchListPage extends OneeWebElements implements TestParameters, OneeMethods, ReadJson {
    WebDriver driver;

    public void SearchListPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchListCheck(String testProperty06, int responseCode) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 300);");
            wait(driver).until(ExpectedConditions.visibilityOf(searchButtonHome));
            searchButtonHome.click();
            responseCode(driver.getCurrentUrl(), responseCode);
            List<WebElement> villas = wait(driver).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.
                    xpath(searchList)));
            assertTrue(villas.size() == 24);
            for (WebElement e : villas) {
                if (e.getAttribute("href").equalsIgnoreCase(testProperty06)) {
                    e.click();
                    responseCode(driver.getCurrentUrl(), responseCode);
                    break;
                }
            }
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    public void searchProperty(String propertyName, int responseCode) {
        responseCode(driver.getCurrentUrl(), responseCode);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 300);");
        searchInputHome.sendKeys(propertyName);
        wait(driver).until(ExpectedConditions.visibilityOf(searchButtonHome));
        searchButtonHome.click();
        responseCode(driver.getCurrentUrl(), responseCode);


    }
}
