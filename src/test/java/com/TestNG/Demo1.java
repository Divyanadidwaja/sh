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

public class Demo1
{
	@BeforeSuite
	public void Beforesuite1()
	{
		System.out.println("beforesuite1");
	}
	@BeforeTest
	public void Beforetest1()
	{
		System.out.println("beforetest1");
	}
	@BeforeClass
	public void Beforeclass1()
	{
		System.out.println("beforeclass1");
	}
	@BeforeMethod
	public void Beforemethod1()
	{
		System.out.println("beforemethod1");
	}
	@Test
	
	public void Test1()
	{
		System.out.println("test1");
	}
	@Test
	
	public void Test2()
	{
		System.out.println("test2");
	}
	@AfterMethod
	public void aftermethod1()
	{
		System.out.println("aftermethod1");
	}
	@AfterClass
	public void afterclass1()
	{
		System.out.println("afterclass1");
	}
	@AfterTest
	public void afterTest1()
	{
		System.out.println("aftertest1");
	}
	
@AfterSuite
public void aftersuite1()
{
	System.out.println("aftersuite1");
}
}
