package com.TestNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo3 
{
	@BeforeSuite
	public void Beforesuite3()
	{
		System.out.println("beforesuite3");
	}
	@BeforeTest
	public void Beforetest1()
	{
		System.out.println("beforetest3");
	}
	@BeforeClass
	public void Beforeclass1()
	{
		System.out.println("beforeclass3");
	}
	@BeforeMethod
	public void Beforemethod1()
	{
		System.out.println("beforemethod3");
	}
	@Test
	
	public void Test1()
	{
		System.out.println("test13");
	}
	@Test
	
	public void Test2()
	{
		System.out.println("test23");
	}
	@AfterMethod
	public void aftermethod1()
	{
		System.out.println("aftermethod3");
	}
	@AfterClass
	public void afterclass1()
	{
		System.out.println("afterclass3");
	}
	@AfterTest
	public void afterTest1()
	{
		System.out.println("aftertest3");
	}
	
@AfterSuite
public void aftersuite1()
{
	System.out.println("aftersuite3");
}
}
