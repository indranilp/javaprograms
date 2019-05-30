package com.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage2 {

	WebDriver driver;
	
	By username = By.id("email");
	By password = By.name("pass");
	By loginButton = By.xpath("//label[@id='loginbutton']");
	
	public LoginPage2(WebDriver driver) {		
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	
	public void typeUserName(String uid)
	{
		driver.findElement(username).sendKeys(uid);
	}
	public void typePassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLoginButton()
	{
		driver.findElement(loginButton).click();
	}
}
