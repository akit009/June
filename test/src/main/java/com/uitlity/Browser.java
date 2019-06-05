package com.uitlity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static WebDriver Chrome(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver", "/home/administrator/Selenium/test/src/test/resource/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static WebDriver firefox() {
		System.setProperty("webdriver.gecko.driver", "/home/administrator/Selenium/test/src/test/resource/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
