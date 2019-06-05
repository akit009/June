package proji;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.uitlity.Browser;
import com.uitlity.Data;

public class LoginPage {
	static WebDriver driver;
	@Test
	public static void ForgotPasswordTest() {
		 driver= Browser.Chrome(driver);
		 driver.get(Data.login_url);
		 driver.findElement(By.className("forgotPass")).click();
		 driver.findElement(By.id("forgotPassTxt")).sendKeys("ankit.k@rankwatch.com");
		 driver.findElement(By.id("forgotSubmit")).click();
		 String expected ="We have send you an email with a link to reset your password.";
		 String actual= driver.findElement(By.className("sub-txt-title")).getText();
		 Assert.assertEquals(actual, expected);
		 driver.close();
	}

}
