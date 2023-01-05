package seleniumframework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browsertest {
  public static void main(String[] args) {
	// System.setProperty("webdriver.gecko.driver","\\Users\\vishnu bhagath\\javaselenium\\geckodriver-v0.32.0-win32"); 
	 // WebDriver driver = new FirefoxDriver();
	  
	 //WebDriver driver = new ChromeDriver();
	  //WebDriver driver = new InternetExplorerDriver();
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	 // driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium java");
	  List<WebElement> listelements=driver.findElements(By.xpath("//input"));
	  int count= listelements.size();
	  System.out.println("count =" +count);
	 // WebElement textbox = driver.findElement(By.name("q"));
	 // textbox.sendKeys("automation step by step"); 
	 // driver.close();
	  
  }

} 
 