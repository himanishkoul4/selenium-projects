package com.chromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bing {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.bing.com");
	}

}