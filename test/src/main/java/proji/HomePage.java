package proji;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.uitlity.Browser;
import com.uitlity.Data;
import com.uitlity.HomePageAction;
import com.uitlity.SeleniumWait;

public class HomePage {

	static WebDriver driver;

	@BeforeClass
	public void HomepageTest() {
		driver = Browser.Chrome(driver);
		HomePageAction.verifyHomePage(driver);

	}

	@Test(priority = 1)
	public void FeaturePageTest() {
		driver.findElement(By.xpath("//a[text()='Features']")).click();
		String actual = driver.getTitle();
		String expected = "Features- RankWatch | SEO Management Platform";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 2)
	public void PricingPageTest() throws InterruptedException {
		HomePageAction.navigateBackToHomePage(driver);
//		(new HomePageAction()).navigatetohomepage(driver);
		driver.findElement(By.xpath("//a[text()='Pricing']")).click();
		String actual = driver.getTitle();
		String expected = "Pricing- Rank Watch | SEO Management Platform";
		Assert.assertEquals(actual, expected);

	}

	@Test(priority = 3)
	public void Resource_FreeToolTest() {
		HomePageAction.navigateBackToHomePage(driver);
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//a[text()='Resources & Free Tools ']"))).build().perform();
		String actual = driver.findElement(By.xpath("//h4[@class='menu_heading']")).getText();
		String expected = "Free Tools";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 4)
	public void CompanyTest() {
		HomePageAction.navigateBackToHomePage(driver);
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//a[text()='Company ']"))).build().perform();
		String actual = driver.findElement(By.xpath("//a[@href='/about-us.html']")).getText();
		String expected = "About Us";
		Assert.assertEquals(actual, expected);

	}

	@Test(priority = 5)
	public static void LoginTest() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@class='nav_item login_btn']/a")).click();
		String actual = driver.getTitle();
		String expected = "Login - RankWatch";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 6)
	public void SignupTest() {
		HomePageAction.navigateBackToHomePage(driver);
		driver.findElement(By.xpath("//li[@class='nav_item login_btn']/a[@href='/member-signup.html']")).click();
		String actual = driver.getTitle();
		String expected = "SignUp- RankWatch | Free SEO Trial | Best Rank Checking Software";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 7)
	public void EnterEmailAddressTest() {
		HomePageAction.navigateBackToHomePage(driver);
		driver.findElement(By.className("email_add")).sendKeys("test@gmail.com");
		driver.findElement(By.className("email_submit")).click();
		String actual = driver.findElement(By.xpath("//input[@value='test@gmail.com']")).getTagName();
		String expected = "input";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 8)
	public void EnterDomainNameTest() throws InterruptedException {
		HomePageAction.navigateBackToHomePage(driver);
		driver.findElement(By.id("domain_name")).sendKeys("rankwatch.com");
		driver.findElement(By.xpath("//input[@name='analyze']")).click();
		SeleniumWait wait = new SeleniumWait(driver, 10);
		wait.getWhenVisible(By.className("currentDomain-title"));
//		Thread.sleep(20000);
		String actual = driver.findElement(By.className("currentDomain-title")).getText();
		String expected = "Online Rank Tracker | SERP Checker | Rank Monitoring Software - RankWatch.com";
		Assert.assertEquals(actual, expected);

	}

	@Test(priority = 9)
	public void ProductListTest() {
		FooterHomePage.FeatureTest(driver);
		FooterHomePage.PricingTest(driver);
		FooterHomePage.BlogTest(driver);
		FooterHomePage.APITest(driver);
		FooterHomePage.HelpDeskTest(driver);
		FooterHomePage.FreeTrialTest(driver);
		FooterHomePage.AboutUsTest(driver);
		FooterHomePage.GoogleUpdatesTest(driver);
		FooterHomePage.ExpertInterviewTest(driver);
		FooterHomePage.LearnSEOTest(driver);
		FooterHomePage.InfographicsTest(driver);
		FooterHomePage.SEOSuperstarTest(driver);
		FooterHomePage.ContactUsTest(driver);
		FooterHomePage.PartnershipTest(driver);
		FooterHomePage.CareersTest(driver);
		FooterHomePage.AffiliateTest(driver);
		FooterHomePage.TestimonialsTest(driver);
		FooterHomePage.Terms_ConditionTest(driver);
		FooterHomePage.Privacy_PolicyTest(driver);

	}

	@AfterClass
	public static void CloseBrowser() {
		driver.close();
	}
}
