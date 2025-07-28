package com.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoGetTitle {
    public static void main(String[] args) {
        // System.setProperty("webdriver.chrome.driver", ""); // Only for Edge Browser

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/downloads/");
        driver.manage().window().maximize();

        String Title = driver.getTitle(); // Opened Browser
        System.out.println(Title);

        driver.quit(); // Quit entire browser
    }
}
