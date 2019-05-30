package com.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By username = By.id("email");
	By password = By.name("pass");
	By loginButton = By.xpath("//label[@id='loginbutton']");
	
	public LoginPage(WebDriver driver) {		
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	
	public void typeUserName()
	{
		driver.findElement(username).sendKeys("indranil.mitm@gmail.com");
	}
	public void typePassword()
	{
		driver.findElement(password).sendKeys("billuu@123");
	}
	
	public void clickLoginButton()
	{
		driver.findElement(loginButton).click();
	}
}
