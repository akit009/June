package proji;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.uitlity.Preconditions;

public class link_Exp {
	static WebDriver driver;

	@BeforeMethod
	public static void Open_LE() throws InterruptedException {
		driver= Preconditions.Login();    // import login method from Preconditions class
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text() ='Research']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("linkExplorer")).click();		
	}
	
	@Test(priority=1)
	public static void VerifyLinkExpTest() {
		String Expected ="Link Explorer";
		String Actual = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test(priority=2)
	public static void DomainSearchTest() throws InterruptedException {		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@type='text']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rankwatch.com");
		driver.findElement(By.xpath("//span[text()='Explore Backlinks']")).click();
		Thread.sleep(10000);
		String Expected ="Backlink Summary- rankwatch.com";
		String Actual = driver.findElement(By.xpath("//div[@class='s-title']")).getText();
		Assert.assertEquals(Actual, Expected);		
	}
	
	@Test(priority=3)
	public static void Ref_Domain() throws InterruptedException{
		//Link_Exp.DomainSearchTest();		 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rankwatch.com");
		driver.findElement(By.xpath("//span[text()='Explore Backlinks']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Ref. Domain']")).click();
		Thread.sleep(3000);
		String Expected ="Referring Domain Statistics";
		String Actual = driver.findElement(By.xpath("//div[@class='card-header']")).getText();
		Assert.assertEquals(Actual, Expected);	
	}
	
	
	@AfterMethod
	public static void close() {
		driver.quit();
	}
}
