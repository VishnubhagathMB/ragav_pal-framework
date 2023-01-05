package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_googlesearch {
	public static void main(String[] args) {
		googlesearch();
		
	}
	
	public static void googlesearch() {
		//System.setProperty("webdriver.gecko.driver","\\Users\\vishnu bhagath\\javaselenium\\geckodriver-v0.32.0-win32");
		
		WebDriver driver = new ChromeDriver();
		
		//goto google.com
		driver.get("https:google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium with java");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		//driver.findElement(By.name("btnK")).click();
		
		driver.close();
		System.out.println("test completed successfuly");
		
	}

}
