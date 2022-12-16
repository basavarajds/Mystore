/**
 * 
 */
package com.myproject.testcases;

import org.testng.annotations.Test;

/**
 * @author user
 *
 */
public class test3 {
	
	@Test()
	public void testthreeA()
	{
		System.out.println("testthreeA class");
	}
	@Test()
	public void testthreeB()
	{
		System.out.println("testthreeB class");
	}
	@Test(groups= {"smoke"})
	public void testthreeC()
	{
		System.out.println("testthreeC class");
	}

}
