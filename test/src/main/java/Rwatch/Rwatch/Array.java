package Rwatch.Rwatch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Array {

//	public static void main(String []args) {
//		int values[]= {1,2,3,4,5,8};
//		int values1[]= {1,3,6,7,8,9};
//		
//		for(int i=0; i<=values.length-1; i++) {
//			System.out.println(values[i]);
//		}
//				
//		
//		for(int j=0; j<=values1.length-1; j++) {
//			System.out.println(values1[j]);
//			
//		}
		public static WebDriver driver;
		public static void main(String[]args) {
			System.setProperty("webdriver.chrome.driver", "/home/administrator/Selenium/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.spicejet.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("test");
		}

		
	}

