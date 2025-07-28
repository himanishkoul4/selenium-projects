package com.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager {
    public static WebDriver getDriver() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
}
