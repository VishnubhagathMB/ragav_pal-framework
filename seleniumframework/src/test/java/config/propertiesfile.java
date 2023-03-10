package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.test_googlesearch3;


public class propertiesfile {
	static Properties prop = new Properties();
	
	public static void main(String[] args) {
		getproperties();
		setproperties();
		getproperties();
	}
	
	public static void getproperties() {
		try {
		
		 InputStream input = new FileInputStream("C:\\Users\\vishnu bhagath\\eclipse-workspace\\seleniumframework\\src\\test\\java\\config\\config.properties");
		prop.load(input);
		String browser=prop.getProperty("browser");
		System.out.println(browser);
		test_googlesearch3.browserName=browser;
		}
		
		catch (Exception exp) {
			System.out.println( exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
	}
	
	public static void setproperties() {
		try {
					
		OutputStream output = new FileOutputStream("C:\\Users\\vishnu bhagath\\eclipse-workspace\\seleniumframework\\src\\test\\java\\config\\config.properties");
		prop.setProperty("browser","chrome");
		prop.store(output,null);
		}
		catch (Exception exp) {
			System.out.println( exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
	}

}
}