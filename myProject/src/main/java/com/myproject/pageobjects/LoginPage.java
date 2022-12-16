package com.myproject.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myproject.actiondriver.Action;
import com.myproject.base.BaseClass;

public class LoginPage extends BaseClass{
	@FindBy(xpath="//input[@type='text']")
	WebElement userName;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btnLogin;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public ManagerHomePage ClickLogin()
	{
		Action.type(userName, prop.getProperty("username"));
		Action.type(password, prop.getProperty("password"));
		Action.click1(btnLogin, "Login Button");
		return new ManagerHomePage();
		
	}

}
