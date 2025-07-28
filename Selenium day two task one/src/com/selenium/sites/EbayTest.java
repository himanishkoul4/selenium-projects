package com.selenium.sites;

import org.openqa.selenium.WebDriver;
import com.selenium.base.BrowserManager;
import com.selenium.utils.BrowserActions;

public class EbayTest {
    public static void main(String[] args) {
        WebDriver driver = BrowserManager.getDriver();
        BrowserActions.openUrl(driver, "http://www.half.ebay.com");
        BrowserActions.printAllInfo(driver, "eBay");
        driver.quit();
    }
}
