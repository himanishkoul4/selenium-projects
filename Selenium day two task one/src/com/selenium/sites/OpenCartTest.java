package com.selenium.sites;

import org.openqa.selenium.WebDriver;
import com.selenium.base.BrowserManager;
import com.selenium.utils.BrowserActions;

public class OpenCartTest {
    public static void main(String[] args) {
        WebDriver driver = BrowserManager.getDriver();
        BrowserActions.openUrl(driver, "https://demo.opencart.com/");
        BrowserActions.printAllInfo(driver, "OpenCart");
        driver.quit();
    }
}
