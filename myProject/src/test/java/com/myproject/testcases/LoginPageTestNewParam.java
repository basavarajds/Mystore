/**
 * 
 */
package com.myproject.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import com.myproject.base.BaseClassParam;
import com.myproject.pageobjects.ManagerHomePage;
import com.myproject.utility.Log;
import com.myproject.pageobjects.LoginPage;

/**
 * @author user
 *
 */
public class LoginPageTestNewParam extends BaseClassParam{
	LoginPage oLoginPage;
	ManagerHomePage oGuru99BankPage;
	
	
	@Parameters("browser")
	@BeforeMethod(groups= {"Regression"})
	public void setup(String browserName)
	{
		launchApp(browserName);
	}
	
	
	@AfterMethod(groups= {"Regression"},enabled= true)
	public void tearDown()
	{
		driver.close();
	}
	
	@Test(groups={"Regression"})
	public void VerifyFOlder() throws InterruptedException
	{
		Assert.assertEquals(true, true);
		Thread.sleep(5000);
		
	}

}
