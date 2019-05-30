/**
 * 
 */
package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;

/**
 * @author indranil
 *
 */
public class LoginPageTest extends TestBase{

	LoginPage login;
	
	public LoginPageTest()
	{
		super();
		
	}
	
	  @DataProvider(name = "Authentication")
	  
	  public static Object[][] credentials() {
	 
	        return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};
	 
	  }
	 
	  
	@BeforeMethod
	public void setUp() {
		initialization();
		login = new LoginPage();
		
	}
	
	@Test
	public void testLogin()
	{
		login.enterUsername(prop.getProperty("username"));
		login.enterPassword(prop.getProperty("password"));
		login.clickLoginButton();
		

	}
	@Test(dataProvider = "Authentication")
	public void testLogin1(String us, String ps)
	{
		login.enterUsername(us);
		login.enterPassword(ps);
		login.clickLoginButton();
		

	}	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
