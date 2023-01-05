package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobject.searchpageobjects;

public class testsearchpageobjects {
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		googlesearchtest();
		
	}
	public static void  googlesearchtest() {
		
		
		System.setProperty("webdriver.chrome.driver","\\Users\\vishnu bhagath\\javaselenium\\geckodriver-v0.32.0-win32")
		 driver = new ChromeDriver();
		
		searchpageobjects obj = new searchpageobjects(driver);
		
		driver.get("https://google.com");
		
		obj.setTextInSearchBox("a b c d");
		obj.clickSearchButton();
		
		driver.close();
	}

}
