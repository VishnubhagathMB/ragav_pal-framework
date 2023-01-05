import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class desiredcapabilities {
	
	public static void main(String[] args) {
		
	
	 DesiredCapabilities caps = new DesiredCapabilities();
	 caps.setCapability("ignoreProtectedModeSettings",true);
	WebDriver driver = new InternetExplorerDriver();
	
	driver.get("http://google.com");
	driver.findElement(By.name("q")).sendKeys("selenium with java");
	driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	driver.close();
	driver.quit();

}
}