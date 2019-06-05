package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Action_Class {
	
	@Test
	public static void Sum(){
		
		int a = 10;
		int b= 20;
		System.out.println("SUM");
		Assert.assertEquals(30, a+b);
				
	}
	
	@Test
	public static void Chrome() {
		System.setProperty("webdriever.chrome.driver","/home/administrator/Selenium/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
	}
}
		
		