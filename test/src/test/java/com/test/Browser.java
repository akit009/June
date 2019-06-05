package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	static WebDriver driver;
	public static WebDriver Chrome() {
		System.setProperty("webdriver.chrome.driver", "/home/administrator/Selenium/chromedriver");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		return driver;				
	}
	
	public static WebDriver Firefox() {
				
		return driver;		
	}
	

}
