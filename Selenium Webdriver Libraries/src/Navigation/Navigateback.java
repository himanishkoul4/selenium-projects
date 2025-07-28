package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateback {
    public static void main(String[] args) {
        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to Google
        driver.get("https://www.google.co.in");
        String URL = driver.getCurrentUrl();
        System.out.println("First URL: " + URL);

        // Navigate to Yahoo Login
        driver.navigate().to("https://login.yahoo.com/");
        URL = driver.getCurrentUrl();
        System.out.println("Second URL: " + URL);

        // Navigate back to Google
        driver.navigate().back();
        URL = driver.getCurrentUrl();
        System.out.println("Back to URL: " + URL);

        // Close the browser
        driver.quit();
    }
}

