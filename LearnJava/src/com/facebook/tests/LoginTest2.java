/**
 * 
 */
package com.facebook.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.facebook.pages.LoginPage;
import com.facebook.pages.LoginPage2;

/**
 * @author indranil
 *
 */
public class LoginTest2 {

	@Test
	public void verifyLogin() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		LoginPage2 login  = new LoginPage2(driver);
		login.typeUserName("indranil.mitm@gmai.com");
		login.typePassword("billuu@123");
		Thread.sleep(5000);
		login.clickLoginButton();
		
		driver.quit();
		
	}
}
