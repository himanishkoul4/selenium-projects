package com.chromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.half.ebay.com");
	}

}