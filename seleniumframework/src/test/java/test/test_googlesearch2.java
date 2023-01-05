package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test_googlesearch2 {
	
	public static WebDriver driver = null;
	
	@BeforeTest
	public void setuptest() {
		
		
      driver = new ChromeDriver();
			//goto google.com
		//driver.get("https:google.com");
	
	}
	
		 
	@Test
	public static void googlesearch() {
		
			driver.get("https:google.com");
		driver.findElement(By.name("q")).sendKeys("selenium with java");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		//driver.findElement(By.name("btnK")).click();
		}

	@AfterTest
	public void teardowntest() {
	driver.close();
	System.out.println("test completed successfuly");
	}
}
