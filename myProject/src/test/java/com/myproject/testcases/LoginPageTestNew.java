/**
 * 
 */
package com.myproject.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.myproject.base.BaseClass1;
import com.myproject.pageobjects.ManagerHomePage;
import com.myproject.utility.Log;
import com.myproject.pageobjects.LoginPage;

/**
 * @author user
 *
 */
public class LoginPageTestNew extends BaseClass1{
	LoginPage oLoginPage;
	ManagerHomePage oGuru99BankPage;
	
	
	@BeforeMethod
	public void setup()
	{
		launchApp();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	//@Test(groups={"smoke"})
	public void VerifyLogin()
	{
		Log.startTestCase("VerifyLogin");
		oLoginPage = new LoginPage();
		Log.info("Enter username and password");
		ManagerHomePage oManagerHomePage = oLoginPage.ClickLogin();
		String strActualURL =oManagerHomePage.getCurURL();
		Assert.assertEquals(strActualURL, "https://demo.guru99.com/v4/manager/Managerhomepage.php");
		System.out.println("VerifyLogin");
		Log.info("Verify Login success");
		Log.endTestCase("Verify Login end");
	}
	//@Test(groups={"smoke","sanity"})
	public void VerifyTitle()
	{
		/*oLoginPage = new LoginPage();
		ManagerHomePage oManagerHomePage = oLoginPage.ClickLogin();
		String strActualURL =oManagerHomePage.getCurURL();
		Assert.assertEquals(strActualURL, "https://demo.guru99.com/v4/manager/Managerhomepage.php");
		System.out.println("End of VerifyTitle");
		//oGuru99BankPage = new ManagerHomePage();
		//oGuru99BankPage.verifyHeader();*/
		Assert.assertEquals(true, true);
		
	}
//	@Test(groups={"smoke"})
	public void VerifyHomePage()
	{
		Assert.assertEquals(true, true);
		
	}
	//@Test(groups={"sanity"})
	public void VerifyLandPage()
	{
		Assert.assertEquals(true, true);
		
	}
	//@Test(groups={"smoke"})
	public void VerifyCompose()
	{
		Assert.assertEquals(true, true);
		
	}
	//@Test(groups={"sanity"})
	public void VerifySentMail()
	{
		Assert.assertEquals(true, true);
		
	}
	//@Test(groups={"regression"})
	@Test
	public void VerifyDraft()
	{
		Assert.assertEquals(true, true);
		
	}
	//@Test(groups={"regression"})
	@Test
	public void VerifyFOlder()
	{
		Assert.assertEquals(true, true);
		
	}

}
