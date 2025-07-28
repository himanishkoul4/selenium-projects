package com.selenium.sites;

import org.openqa.selenium.WebDriver;
import com.selenium.base.BrowserManager;
import com.selenium.utils.BrowserActions;

public class FreeCRMTest {
    public static void main(String[] args) {
        WebDriver driver = BrowserManager.getDriver();
        BrowserActions.openUrl(driver, "https://www.freecrm.com/");
        BrowserActions.printAllInfo(driver, "FreeCRM");
        driver.quit();
    }
}
