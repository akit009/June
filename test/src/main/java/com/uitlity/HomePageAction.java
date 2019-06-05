package com.uitlity;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePageAction {

	static WebDriver driver;

		public static void navigateBackToHomePage(WebDriver driver) {
		driver.get(Data.app_url);
		verifyHomePage(driver);
		
	}
		
		public static void verifyHomePage(WebDriver driver) {
			driver.get(Data.app_url);
			String expected = "Online Rank Tracker | SERP Checker | Rank Monitoring Software - RankWatch.com";
			String actual = driver.getTitle();
//			System.out.println(actual);
			Assert.assertEquals(actual, expected);
//			System.out.println(Data.app_url);
		}

}
