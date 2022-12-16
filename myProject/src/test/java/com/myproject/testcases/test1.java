/**
 * 
 */
package com.myproject.testcases;

import org.testng.annotations.Test;

/**
 * @author user
 *
 */
public class test1 {
	
	@Test()
	public void testoneA()
	{
		System.out.println("testoneA class");
	}
	@Test()
	public void testoneB()
	{
		System.out.println("testoneA class");
	}
	@Test(groups= {"smoke"})
	public void testoneC()
	{
		System.out.println("testoneC class");
	}

}
