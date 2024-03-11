package com.TestNG;

import org.testng.annotations.Test;

import com.crm.crm.genericUtils.Baseclass;

public class classwithonemethodincliude extends Baseclass
{
	@Test(groups = "smoke")
public void supplier()
{
	System.out.println("supplier");
}
	@Test(groups = "smoke")
public void customer()
{
	System.out.println("customer");
}
	@Test(groups = "regraration")
public void product()
{
	System.out.println("product");
}
	@Test(groups = "smoke")
public void pos()
{
	System.out.println("pos");
}

}
