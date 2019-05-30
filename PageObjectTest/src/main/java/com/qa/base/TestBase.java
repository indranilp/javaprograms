/**
 * 
 */
package com.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author indranil
 *
 */
public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	

	public TestBase()
	{
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/home/indranil/eclipse-workspace/PageObjectTest/src/main/java/com/qa/config/config.properties");
			prop.load(ip);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	
	public static void initialization() {
		
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/home/indranil/Downloads/chromedriver");
			driver = new ChromeDriver();
	}
		if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/home/indranil/Downloads/geckodriver");
			driver = new FirefoxDriver();
	}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
}
}
