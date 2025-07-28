package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
    public static void main(String[] args) {
        // Set up ChromeDriver (Make sure chromedriver is in your PATH or specify its location)
        WebDriver driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // Navigate to Yahoo Login page
        driver.navigate().to("https://login.yahoo.com/");

        // Get and print current URL
        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        // Optional: Close the browser
        driver.quit();
    }
}
