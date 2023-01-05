package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.googlesearchpage;


public class gsearchpagetest {
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		googlesearch();
		
	}
	
	public static void googlesearch() {
		//System.setProperty("webdriver.gecko.driver","\\Users\\vishnu bhagath\\javaselenium\\geckodriver-v0.32.0-win32");
		
		 driver = new ChromeDriver();
		
		//goto google.com
		driver.get("https:google.com");
		
		//driver.findElement(By.name("q")).sendKeys("selenium with java");
		
		googlesearchpage.textbox_search(driver).sendKeys("automation step by step");
		googlesearchpage.button_search(driver).sendKeys(Keys.RETURN);
		
		//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		//driver.findElement(By.name("btnK")).click();
		
		driver.close();
		System.out.println("test completed successfuly");
		
	}

}
