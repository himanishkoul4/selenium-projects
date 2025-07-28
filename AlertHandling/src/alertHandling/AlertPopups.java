package alertHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopups {

    @Test
    public void fillFormAndHandleAlert() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://only-testing-blog.blogspot.com/2014/05/form.html");

        // Fill basic details
        driver.findElement(By.name("FirstName")).sendKeys("Himanish");
        driver.findElement(By.name("LastName")).sendKeys("Koul");
        driver.findElement(By.name("EmailID")).sendKeys("himanish@example.com");
        driver.findElement(By.name("MobNo")).sendKeys("9876543210");
        driver.findElement(By.name("Company")).sendKeys("OpenAI");

        // Click submit button
        driver.findElement(By.xpath("//input[@value='Submit']")).click();

        // Handle alert
        Thread.sleep(2000); // Wait for alert to appear
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert Text: " + alert.getText());
        alert.accept(); // Close the alert

        Thread.sleep(2000);
        driver.quit();
    }
}
