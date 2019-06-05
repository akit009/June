package com.uitlity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Preconditions {
	static WebDriver driver;
	public static  WebDriver Login(){
		 driver= Browser.Chrome(driver);
		 driver.get("https://rankwatch.com");	 
		 driver.get("https://www.rankwatch.com/member/login");
		 driver.findElement(By.id("login")).sendKeys("ankit.k@rankwatch.com");
		 driver.findElement(By.id("pass")).sendKeys("rankwatch123");
		 driver.findElement(By.id("LoginSubmit")).click();
		 return driver;
		
	}
	

}
