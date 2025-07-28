package com.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrl {
    public static void main(String[] args) {
        // System.setProperty("webdriver.chrome.driver", ""); // Only for Edge Browser

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/downloads/");
        driver.manage().window().maximize();

        String URL = driver.getTitle(); // Opened Browser
        System.out.println(URL);

//        driver.quit(); // Quit entire browser
    }
}
