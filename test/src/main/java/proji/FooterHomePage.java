package proji;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.uitlity.Data;

public class FooterHomePage {
	static WebDriver driver;

	public static void FeatureTest(WebDriver driver) {
		driver.get(Data.app_url);
		driver.findElement(By.xpath("//a[@href= '/features/']")).click();
		String actual = driver.getTitle();
		String expected = "Features- RankWatch | SEO Management Platform";
		Assert.assertEquals(actual, expected);

	}

	public static void PricingTest(WebDriver driver) {
		driver.get(Data.app_url);
		driver.findElement(By.xpath("//ul[@class='footer-link box-link link_hide full']/li[2]/a")).click();
		String actual = driver.getTitle();
		String expected = "Pricing- Rank Watch | SEO Management Platform";
		Assert.assertEquals(actual, expected);

	}

	public static void BlogTest(WebDriver driver) {
		driver.get(Data.app_url);
		driver.findElement(By.xpath("//ul[@class='footer-link box-link link_hide full']//a[text()='Blog']")).click();
		String actual = driver.getTitle();
		String expected = "Technology | RankWatch Blog";
		Assert.assertEquals(actual, expected);
	}

	public static void APITest(WebDriver driver) {
		driver.get(Data.app_url);
		driver.findElement(By.xpath("//ul[@class='footer-link box-link link_hide full']//a[text()='API']")).click();
		String actual = driver.getTitle();
		String expected = "RankWatch API Documentation";
		Assert.assertEquals(actual, expected);
	}

	public static void HelpDeskTest(WebDriver driver) {
		driver.get(Data.app_url);
		driver.findElement(By.xpath("//ul[@class='footer-link box-link link_hide full']//a[text()='Help Desk']"))
				.click();
		String actual = driver.getTitle();
		String expected = "Rankwatch: Help Desk";
		Assert.assertEquals(actual, expected);
	}

	public static void FreeTrialTest(WebDriver driver) {
		driver.get(Data.app_url);
		driver.findElement(By.xpath("//ul[@class='footer-link box-link link_hide full']//a[text()='Free Trial']"))
				.click();
		String actual = driver.getTitle();
		String expected = "SignUp- RankWatch | Free SEO Trial | Best Rank Checking Software";
		Assert.assertEquals(actual, expected);
	}

	public static void AboutUsTest(WebDriver driver) {
		driver.get(Data.app_url);
		driver.findElement(By.xpath("//ul[@class='footer-link link_hide full']//a[text()='About Us']")).click();
		String actual = driver.getTitle();
		String expected = "About Us - RankWatch";
		Assert.assertEquals(actual, expected);
	}

	public static void GoogleUpdatesTest(WebDriver driver) {
		driver.get(Data.app_url);
		driver.findElement(By.xpath("//ul[@class='footer-link link_hide full']//a[text()='Google Updates Timeline']"))
				.click();
		String actual = driver.getTitle();
		String expected = "Google Algorithm Changes History | Google Algorithm Update Timeline - RankWatch";
		Assert.assertEquals(actual, expected);
	}

	public static void ExpertInterviewTest(WebDriver driver) {
		driver.get(Data.app_url);
		driver.findElement(By.xpath("//ul[@class='footer-link link_hide full']//a[text()='Experts Interview']"))
				.click();
		String actual = driver.getTitle();
		String expected = "Interview | RankWatch Blog";
		Assert.assertEquals(actual, expected);
	}

	public static void LearnSEOTest(WebDriver driver) {
		driver.get(Data.app_url);
		driver.findElement(By.xpath("//ul[@class='footer-link link_hide full']//a[text()='Learn SEO']")).click();
		String actual = driver.getTitle();
		String expected = "Learn SEO for free with RankWatch University";
		Assert.assertEquals(actual, expected);
	}

	public static void InfographicsTest(WebDriver driver) {
		driver.get(Data.app_url);
		driver.findElement(By.xpath("//ul[@class='footer-link link_hide full']//a[text()='Infographics']")).click();
		String actual = driver.getTitle();
		String expected = "The Future Of SEO- What Industry Experts Think | RankWatch";
		Assert.assertEquals(actual, expected);
	}

	public static void SEOSuperstarTest(WebDriver driver) {
		driver.get(Data.app_url);
		driver.findElement(By.xpath("//ul[@class='footer-link link_hide full']//a[text()='RankWatch SEO Superstar']"))
				.click();
		String actual = driver.getTitle();
		String expected = "RankWatch SEO Superstar Contest";
		Assert.assertEquals(actual, expected);
	}
	
	public static void ContactUsTest(WebDriver driver) {
		driver.get(Data.app_url);
		driver.findElement(By.xpath("//ul[@class='footer-link link_hide full']//a[text()='Contact Us']")).click();
		String actual = driver.getTitle();
		String expected = "Contact Us : Rankwatch";
		Assert.assertEquals(actual, expected);
	}
	public static void PartnershipTest(WebDriver driver) {
		driver.get(Data.app_url);
		driver.findElement(By.xpath("//ul[@class='footer-link link_hide full']//a[text()='Partnership']")).click();
		String actual = driver.getTitle();
		String expected = "Rankwatch : Partners";
		Assert.assertEquals(actual, expected);
	}

	public static void CareersTest(WebDriver driver) {
		driver.get(Data.app_url);
		driver.findElement(By.xpath("//ul[@class='footer-link link_hide full']//a[text()='Careers']")).click();
		String actual = driver.getTitle();
		String expected = "Career Opportunities - RankWatch";
		Assert.assertEquals(actual, expected);
	}
	public static void AffiliateTest(WebDriver driver) {
		driver.get(Data.app_url);
		driver.findElement(By.xpath("//ul[@class='footer-link link_hide full']//a[text()='Affiliate']")).click();
		String actual = driver.getTitle();
		String expected = "Affiliate Program - RankWatch";
		Assert.assertEquals(actual, expected);
	}
	public static void TestimonialsTest(WebDriver driver) {
		driver.get(Data.app_url);
		driver.findElement(By.xpath("//ul[@class='footer-link link_hide full']//a[text()='Testimonials']")).click();
		String actual = driver.getTitle();
		String expected = "Rankwatch Customer Testimonials | Rankwatch";
		Assert.assertEquals(actual, expected);
	}
	public static void Terms_ConditionTest(WebDriver driver) {
		driver.get(Data.app_url);
		driver.findElement(By.xpath("//a[text()='Terms of Use']")).click();
		String actual = driver.getTitle();
		String expected = "Terms and Conditions: RankWatch";
		Assert.assertEquals(actual, expected);
	}
	
	public static void Privacy_PolicyTest(WebDriver driver) {
		driver.get(Data.app_url);
		driver.findElement(By.xpath("//a[text()='Terms of Use']")).click();
		String actual = driver.findElement(By.xpath("//h3[@id='scroll-privacy']")).getText();
		String expected = "Privacy Policy";
		Assert.assertEquals(actual, expected);
	}
	
}
