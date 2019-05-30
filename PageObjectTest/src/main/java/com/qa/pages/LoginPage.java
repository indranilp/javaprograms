/**
 * 
 */
package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

/**
 * @author indranil
 *
 */
public class LoginPage extends TestBase{
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(xpath="//label[@id='loginbutton']")
	WebElement loginbutton;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}

	public void enterUsername(String un)
	{
		username.sendKeys(un);
	}
	
	public void enterPassword(String pass) {
		
		password.sendKeys(pass);
		
	}
	
	public void clickLoginButton() {
		loginbutton.click();
	}
}
