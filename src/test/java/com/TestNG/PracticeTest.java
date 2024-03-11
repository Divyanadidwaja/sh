package com.TestNG;

import org.testng.annotations.Test;

public class PracticeTest 
{
	@Test(invocationCount=2,dependsOnMethods="deleteTest")
public void createTest()
{
	System.out.println("Create test");
}
	@Test(priority=1)
	public void editTest()
	{
		System.out.println("edit test");
	}
	@Test
	public void deleteTest()
	{
		int [] a1= {1,2,3,4};
		System.out.println(a1[5]);
	}
	
}
