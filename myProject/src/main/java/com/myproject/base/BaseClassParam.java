package com.myproject.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.myproject.actiondriver.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassParam {
	public static Properties prop;
	public static WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite()
	{
		DOMConfigurator.configure("Log4j.xml");
	}
	@BeforeTest
	public void loadConfig() 
	{
		try {
			prop = new Properties();
			System.out.println("Super constructor invoked");
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\Configuration\\Config.properties");
			prop.load(ip);
			System.out.println("Driver:  " + driver);
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void launchApp(String browserName)
	{
		WebDriverManager.chromedriver().setup();
		//String browserName = prop.getProperty("browser");
		if(browserName.contains("Chrome"))
		{
			driver = new ChromeDriver();
		}else if(browserName.contains("FireFox"))
		{
			driver = new FirefoxDriver();
		}else if(browserName.contains("IE"))
		{
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		Action.implicitWait(driver, 10);
		Action.pageLoadTimeOut(driver, 30);
		driver.get(prop.getProperty("url"));
	}

}
