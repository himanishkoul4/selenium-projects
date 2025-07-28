package com.EdgeBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\hkoul\\spring-workspace\\Selenium Edge Browser Launch\\EdgeBrowserJars\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().window().minimize();
		
		
	}

}
