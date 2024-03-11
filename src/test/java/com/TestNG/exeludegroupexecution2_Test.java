package com.TestNG;

import org.testng.annotations.Test;

public class exeludegroupexecution2_Test
{
	@Test(groups = "regrationsuite")
	public void customer()
	{
		System.out.println("customer");
	}
	@Test(groups = "regrationsuite")
	public void pos()
	{
		System.out.println("pos");
	}
}
