package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.propertiesfile;

public class test_googlesearch3 {
	
	public static WebDriver driver = null;
	public static String browserName = null;
	
	public static void main(String[] args)
	{
		setuptest();
		googlesearch();
		teardowntest(); 
		
	}
	
	@BeforeTest
	public static void setuptest() {
		
		propertiesfile.getproperties();
		if(browserName.equalsIgnoreCase("chrome")) {
		
		
      driver = new ChromeDriver();
			//goto google.com
		//driver.get("https:google.com");
	
	}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			
			
		      driver= new FirefoxDriver();
		}
	}
		 
	@Test
	public static void googlesearch() {
		
			driver.get("https:google.com");
		driver.findElement(By.name("q")).sendKeys("selenium with java");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		//driver.findElement(By.name("btnK")).click();
		}

	@AfterTest
	public static void teardowntest() {
	driver.close();
	System.out.println("test completed successfuly");
	}
}
