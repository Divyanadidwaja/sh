package com.TestNG;

import org.testng.annotations.Test;

public class excludegroupexecution1_Test 
{
	@Test(groups = "smokeSuit")
	public void supplier()
	{
		System.out.println("supplier");
	}
	@Test(groups = "regrationsuite")
	public void product()
	{
		System.out.println("product");
	}
}
