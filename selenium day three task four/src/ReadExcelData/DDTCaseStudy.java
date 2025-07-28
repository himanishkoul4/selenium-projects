package ReadExcelData;

import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;

public class DDTCaseStudy {

    String CsvPath = "C:\\ApachePOI\\CSVTestData.csv";  // ✅ Make sure this path and file exist
    WebDriver driver;

    @BeforeTest
    public void setup() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.com/2014/05/form.html");
    }

    @Test
    public void locatorsTestingBlog() throws Exception {
        CSVReader reader = new CSVReader(new FileReader(CsvPath));
        String[] csvCell;

        while ((csvCell = reader.readNext()) != null) {
            String FName = csvCell[0];
            String LName = csvCell[1];
            String Email = csvCell[2];
            String MNum = csvCell[3];
            String CName = csvCell[4];

            // Fill form fields
            driver.findElement(By.name("FirstName")).clear();
            driver.findElement(By.name("FirstName")).sendKeys(FName);

            driver.findElement(By.name("LastName")).clear();
            driver.findElement(By.name("LastName")).sendKeys(LName);

            driver.findElement(By.name("EmailID")).clear();
            driver.findElement(By.name("EmailID")).sendKeys(Email);

            driver.findElement(By.name("MobNo")).clear();
            driver.findElement(By.name("MobNo")).sendKeys(MNum);

            driver.findElement(By.name("Company")).clear();
            driver.findElement(By.name("Company")).sendKeys(CName);

            Thread.sleep(2000); // Optional: Wait between inputs
        }

        reader.close();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
