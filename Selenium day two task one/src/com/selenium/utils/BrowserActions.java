package com.selenium.utils;

import org.openqa.selenium.WebDriver;

public class BrowserActions {

    public static void openUrl(WebDriver driver, String url) {
        driver.get(url);
        System.out.println("Opened: " + url);
    }

    public static void printTitle(WebDriver driver) {
        System.out.println("Title: " + driver.getTitle());
    }

    public static void printCurrentUrl(WebDriver driver) {
        System.out.println("Current URL: " + driver.getCurrentUrl());
    }

    public static void printPageSourceLength(WebDriver driver) {
        System.out.println("Page Source Length: " + driver.getPageSource().length());
    }

    public static void printAllInfo(WebDriver driver, String siteName) {
        System.out.println("----- " + siteName + " -----");
        printTitle(driver);
        printCurrentUrl(driver);
        printPageSourceLength(driver);
        System.out.println();
    }
}
