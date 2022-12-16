/**
 * 
 */
package com.myproject.testcases;

import org.testng.annotations.Test;

/**
 * @author user
 *
 */
public class test2 {
	
	@Test()
	public void testtwoA()
	{
		System.out.println("testtwoA class");
	}
	@Test(groups= {"smoke","regression"})
	public void testtwoB()
	{
		System.out.println("testtwoB class");
	}
	@Test()
	public void testtwoC()
	{
		System.out.println("testtwoC class");
	}

}
