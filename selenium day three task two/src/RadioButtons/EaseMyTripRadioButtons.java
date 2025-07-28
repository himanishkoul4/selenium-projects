package RadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class EaseMyTripRadioButtons {

    @Test
    public void TestSpecialFareRadioButtons() {

        // ✅ Set path to your chromedriver.exe
//        System.setProperty("webdriver.chrome.driver", "C:\\Path\\To\\chromedriver.exe");

        // Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to EaseMyTrip flights page
        driver.get("https://www.easemytrip.com/flights.html");

        // ✅ Wait for radio buttons to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("ul.specialFare li input[type='radio']")
        ));

        // ✅ Get radio buttons using correct selector
        List<WebElement> radioButtons = driver.findElements(
                By.cssSelector("ul.specialFare li input[type='radio']")
        );

        System.out.println("Number of Special Fare Radio Buttons: " + radioButtons.size());

        // Optional: Click the first one
        // if (!radioButtons.isEmpty()) radioButtons.get(0).click();

        // Cleanup
//        driver.quit();
    }
}
