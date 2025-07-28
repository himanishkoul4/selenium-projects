package HandlingScroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScrollBy1 {

    WebDriver driver;
    String url = "https://www.spicejet.com/";

    @Test
    public void testScrollBy() throws Exception {
        // Initialize ChromeDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        // Scroll down by 1200 pixels
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1200)");
        Thread.sleep(6000); // wait for 6 seconds

        // Scroll up by 1400 pixels
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1400)");

        // Close the browser
        driver.quit();
    }
}
