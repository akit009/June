package proji;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.uitlity.Preconditions;

public class Dashboard {

	static WebDriver driver;

	@BeforeMethod
	public static void OpenDashboardTest() {
		driver = Preconditions.Login();

	}

	@Test
	public static void VerifyDashTest() throws InterruptedException {
		Thread.sleep(5000);
		String actual =	driver.findElement(By.xpath("//div[@class='toolBarInnerLeft']")).getText();
		String expected = "RANKING"; 
		Assert.assertEquals(actual, expected);
	}

	@Test
	public static void SelectProjectTest() throws InterruptedException {
		Thread.sleep(5000);
		WebElement lst = driver.findElement(By.xpath("//select[@id='chosen-select-project']"));
		Select sel = new Select(lst);
		sel.selectByValue("66c788edc18bf93dc2efbfc51d3fdb56");

	}
	
	@AfterMethod
	public static void CloseBrowserTest() {
		driver.close();
	}
	
}
