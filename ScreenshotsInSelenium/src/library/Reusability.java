package library;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Reusability {

    public static void capturedScreenShot(WebDriver driver, String screenShotName) {
        try {
            // Take screenshot and store as file format
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);

            // Create Screenshots folder if it doesn't exist
            File folder = new File("./ScreenShots");
            if (!folder.exists()) {
                folder.mkdir();
            }

            // Set destination path
            File destination = new File("./ScreenShots/" + screenShotName + ".png");

            // Copy screenshot to destination
            FileUtils.copyFile(source, destination);
            System.out.println("Screenshot captured: " + destination.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot: " + e.getMessage());
        }
    }
}
