package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Booking {
	static WebDriver driver;

	@BeforeMethod
	public static void OpenBrowserTest() {
		driver = Browser.Chrome();

	}

//	@Test
//
//	public static void FlightbookingTest() {
//		driver.get("https://www.cleartrip.com/");
//		driver.findElement(By.id("OneWay")).click();
//		driver.findElement(By.id("FromTag")).sendKeys("Berlin");
//		driver.findElement(By.id("ToTag")).sendKeys("Delhi");
//		driver.findElement(By.id("DepartDate")).click();
//		driver.findElement(By.xpath("//a[@class='nextMonth ']")).click();
//		driver.findElement(By.xpath("//div[@class='monthBlock last']//a[text()='19']")).click();
//		Select sel = new Select(driver.findElement(By.id("Adults")));
//		sel.selectByValue("2");
//		driver.findElement(By.id("SearchBtn")).click();
//
//	}
	
	@Test
	
	public static void HotelBookingTest() {
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//a[text()='Hotels']")).click();
		
	}
}
