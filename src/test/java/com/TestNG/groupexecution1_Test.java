package com.TestNG;

import org.testng.annotations.Test;

import com.crm.crm.genericUtils.Baseclass;

public class groupexecution1_Test extends Baseclass
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
