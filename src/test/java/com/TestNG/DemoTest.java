package com.TestNG;

import static org.testng.Assert.fail;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.crm.genericUtils.Baseclass;
@Listeners(com.crm.crm.genericUtils.listenerUtils.class)
public class DemoTest extends Baseclass
{
	
		@Test
	public void testscript1()
	{
			fail();
		System.out.println("testscript three");
	}
}
