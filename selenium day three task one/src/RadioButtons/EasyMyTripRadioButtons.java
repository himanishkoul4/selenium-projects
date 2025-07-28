package RadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class EasyMyTripRadioButtons {
	
    @Test
    public void TestRadioBtn() throws Exception {
        // Set path to your ChromeDriver executable (update with actual path)
//        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
        
        // Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Open EaseMyTrip Flights page
        driver.get("https://www.easemytrip.com/flights.html?msclkid=eddb28b51d6f1b9645dc40321f716b86&utm_source=bing&utm_medium=cpc&utm_campaign=Bing_Search_AllAudience_%20Brand%20(EaseMyTrip.Com)&utm_term=easemytrip&utm_content=EaseMyTrip%20Exact");
        
        // Wait a few seconds (consider explicit waits instead)
        Thread.sleep(5000);
        
        // Click radio buttons via their labels
        driver.findElement(By.xpath("//label[normalize-space()='Defence Forces']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[normalize-space()='Students']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[normalize-space()='Senior Citizens']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[normalize-space()='Doctors Nurses']")).click();
        Thread.sleep(3000);
        
        // Count the actual radio button inputs in the fare section (update CSS selector based on actual HTML)
        List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type='radio'][name='SpecialFare']"));
        System.out.println("Number of Special Fare Radio Buttons: " + radioButtons.size());
        
        // Close browser (optional)
        // driver.quit();
    }
}
