package Pages;

import Helper.OneeMethods;
import Helper.OneeWebElements;
import JsonHelper.ReadJson;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.testng.Assert.assertTrue;


public class HomePage extends OneeWebElements implements OneeMethods, ReadJson {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void newestCheck() {
        try {

            List<WebElement> newestList = driver.findElements(By.
                    xpath(newestProperty));
            sAssert().assertTrue(newestList.size() == 8);
        } catch (Exception e) {
            sAssert().assertTrue(false);
        }
        sAssert().assertAll("*********Newest propertyler gosterilmiyor*********");
    }

    public void mostPopular() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 1200);");
            wait(driver).until(ExpectedConditions.visibilityOf(mostPopular));
            mostPopular.click();
            sAssert().assertEquals(mostPopular.getAttribute("aria-selected"), "true");
            List<WebElement> villas = driver.findElements(By.
                    xpath(mostPopularList));
            sAssert().assertTrue(villas.size() == 3,
                    "*************Most Popular Property Sayisi*************");
        } catch (Exception e) {
            sAssert().assertTrue(false);
        }
        sAssert().assertAll("*********Most Popular Property Gosterilmiyor*********");
    }

    public void trendingDestination() {
        wait(driver).until(ExpectedConditions.visibilityOf(trendingDestinations));
        sAssert().assertTrue(trendingDestinations.isDisplayed());
        List<WebElement> destination = driver.findElements(By.xpath(destinations));
        sAssert().assertEquals(destination.size(), 2);
        sAssert().assertAll("*********Trending Destinations Gosterilmiyor*********");
    }

    public void logoCheck() throws InterruptedException {
        Thread.sleep(3000);
        assertTrue(logo.isDisplayed(), "*********Logo Gosterilmiyor*********");
    }

}
