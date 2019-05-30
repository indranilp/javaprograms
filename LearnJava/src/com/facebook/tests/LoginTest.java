/**
 * 
 */
package com.facebook.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.facebook.pages.LoginPage;

/**
 * @author indranil
 *
 */
public class LoginTest {

	@Test
	public void verifyLogin() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		LoginPage login  = new LoginPage(driver);
		login.typeUserName();
		login.typePassword();
		Thread.sleep(5000);
		login.clickLoginButton();
		
		driver.quit();
		
	}
}
