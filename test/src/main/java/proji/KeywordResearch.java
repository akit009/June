package proji;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.uitlity.Preconditions;

public class KeywordResearch {
	static WebDriver driver;

	@BeforeMethod
	public static void OpenKRTest() throws InterruptedException {
		driver = Preconditions.Login();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text() ='Research']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("kwsuggestion")).click();

	}

//	@Test
//	public static void VerifyKeywordResearchTest() throws InterruptedException {
//		Thread.sleep(5000);
//		String actual= driver.findElement(By.xpath("//span[text()='Keyword Research']")).getText();
//		String expected= "Keyword Research";
//		Assert.assertEquals(actual, expected);
//		
//	}

	@Test
	public static void KeywordSearchTest() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(
				By.xpath("//input[@class='form-control ellipsis input-border ng-untouched ng-pristine ng-invalid']"))
				.click();
		driver.findElement(
				By.xpath("//input[@class='form-control ellipsis input-border ng-untouched ng-pristine ng-invalid']"))
				.sendKeys("buy shoes");
		driver.findElement(By.className("select-button")).click();
		driver.findElement(By.xpath("//span[text()='India']")).click();
		driver.findElement(By.xpath("//button[text()='Submit']")).click();		
//		String actual= driver.findElement(By.xpath("//span[@class='text']")).getText();
//		String expected= "United States";
//		Assert.assertEquals(actual, expected);
		String actual=driver.findElement(By.xpath("//span[contains(text(),'Search Volume')]/following-sibling::p")).getText();
		System.out.println(actual);
		

	}


}

