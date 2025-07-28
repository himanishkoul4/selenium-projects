package screenShotsDemo;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScreenShots {

    @Test
    public void Browser() throws Exception {
        // Launch Chrome browser
        ChromeDriver driver = new ChromeDriver();

        // Navigate to Facebook landing page
        driver.get("https://www.facebook.com/campaign/landing.php");
        driver.manage().window().maximize();

        // Capture screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // Create destination folder if it doesn't exist
        File destFolder = new File("./ScreenShots");
        if (!destFolder.exists()) {
            destFolder.mkdir();
        }

        // Save screenshot to folder
        FileUtils.copyFile(source, new File("./ScreenShots/FacebookHomepage.png"));
        System.out.println("Captured ScreenShot");

        // Close browser
        driver.quit();
    }
}
