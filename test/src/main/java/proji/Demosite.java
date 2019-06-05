package proji;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.uitlity.Browser;

public class Demosite {
	static WebDriver driver;
	
	@BeforeTest
	public static void Siteopen() {
		driver= Browser.Chrome(driver);
		driver.get("http://store.demoqa.com/");
	}
	
	@Test
	public static void SelectProdTest() throws InterruptedException  {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Product Category']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='iPhones']")).click();
		driver.findElement(By.xpath("//div[@class='default_product_display product_view_98 iphones group']//input[@name='Buy']")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("cart_icon")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("wpsc_checkout_form_9")).sendKeys("ankit009@yopmail.com");
		driver.findElement(By.id("wpsc_checkout_form_2")).sendKeys("Trial");
		driver.findElement(By.id("wpsc_checkout_form_3")).sendKeys("Account");
		driver.findElement(By.id("wpsc_checkout_form_4")).sendKeys("Address");
		driver.findElement(By.id("wpsc_checkout_form_5")).sendKeys("Delhi");
		driver.findElement(By.id("wpsc_checkout_form_6")).sendKeys("Delhi");
		Select country = new Select(driver.findElement(By.id("wpsc_checkout_form_7")));
		country.selectByVisibleText("India");
		driver.findElement(By.id("wpsc_checkout_form_18")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Purchase']")).click();


		
		
		
		
		
	}

}
