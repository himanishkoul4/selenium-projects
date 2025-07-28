package com.selenium.sites;

import org.openqa.selenium.WebDriver;
import com.selenium.base.BrowserManager;
import com.selenium.utils.BrowserActions;

public class OrangeHRMTest {
    public static void main(String[] args) {
        WebDriver driver = BrowserManager.getDriver();
        BrowserActions.openUrl(driver, "https://opensource-demo.orangehrmlive.com/");
        BrowserActions.printAllInfo(driver, "OrangeHRM");
        driver.quit();
    }
}
