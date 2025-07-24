package com.chromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrl {
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
            System.out.println("Current URL after navigation to " + url + ": " + driver.getCurrentUrl());
        }

        driver.quit();
    }
}
