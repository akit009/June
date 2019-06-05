package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class demo {


	public static void main(String [] args) {
	//	System.setProperty("webdriever.chrome.driver","//home//administrator//Downloads//chromedriver");
		System.setProperty("webdriver.gecko.driver","//home//administrator//Downloads//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.rankwatch.com/member/login");
	}
	
}
