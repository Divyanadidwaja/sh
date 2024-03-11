package com.TestNG;

import org.testng.annotations.Test;

import com.crm.crm.genericUtils.Baseclass;

public class groupexecution2_Test extends Baseclass
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
