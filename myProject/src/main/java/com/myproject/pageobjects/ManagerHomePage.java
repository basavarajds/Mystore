package com.myproject.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.myproject.base.BaseClass;

public class ManagerHomePage extends BaseClass{

	@FindBy(xpath="//h2[text()='Guru99 Bank']")
	WebElement header;
	public ManagerHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	public void verifyHeader()
	{
		String strHeader = header.getText();
		Assert.assertEquals(strHeader, "Guru99 Bank");
	}
	public String getCurURL()
	{
		String strCurUrl = driver.getCurrentUrl();
		return strCurUrl;
	}
}
