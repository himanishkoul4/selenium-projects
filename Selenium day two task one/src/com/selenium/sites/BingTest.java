package com.selenium.sites;

import org.openqa.selenium.WebDriver;
import com.selenium.base.BrowserManager;
import com.selenium.utils.BrowserActions;

public class BingTest {
    public static void main(String[] args) {
        WebDriver driver = BrowserManager.getDriver();
        BrowserActions.openUrl(driver, "https://www.bing.com");
        BrowserActions.printAllInfo(driver, "Bing");
        driver.quit();
    }
}
