package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentreportdemo {
	static WebDriver driver = null;

	public static void main(String[] args) {
		
		
		ExtentSparkReporter htmlreporter = new ExtentSparkReporter("extentreports.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);

		ExtentTest gtest = extent.createTest("google search test");
		driver = new ChromeDriver();
		
		gtest.log(Status.INFO, "starting test case");
		driver.get("https:google.com");
		gtest.pass("navigated to google.com");
		
		
		driver.findElement(By.name("q")).sendKeys("selenium with java");
		gtest.pass("entered text in text box");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		gtest.pass("pressed enter");
		
		driver.close();
        gtest.pass("close browser");
        
        extent.flush();
	}

}
