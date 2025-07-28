package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
public class EasyCalculationAutomation  {
    WebDriver driver;
    @Test
    public void DemoTestID() throws Exception {
        driver = new ChromeDriver();
        driver.get("https://www.easycalculation.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("googleSearchId")).sendKeys("Bangalore");
//        driver.findElement(By.name("password")).sendKeys("Pratik@123");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/form[1]/span[2]/button[1]")).click();
//        Thread.sleep(5000);
//        driver.quit();
    }
}