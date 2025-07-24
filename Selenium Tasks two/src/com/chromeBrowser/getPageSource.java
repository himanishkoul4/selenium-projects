package com.chromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPageSource {
    public static void main(String[] args) {
        String[] urls = {
            "http://www.bing.com",
            "http://www.half.ebay.com",
            "https://www.freecrm.com/",
            "https://demo.opencart.com/",
            "https://opensource-demo.orangehrmlive.com"
        };

        WebDriver driver = new ChromeDriver();

        for (String url : urls) {
            driver.get(url);
            System.out.println("\nPage source for: " + url);
            System.out.println(driver.getPageSource().substring(0, 500) + "...");
        }

        driver.quit();
    }
}
