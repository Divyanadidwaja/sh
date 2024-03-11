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

public class demo2 
{
	@BeforeSuite
	public void Beforesuite2()
	{
		System.out.println("beforesuite2");
	}
	@BeforeTest
	public void Beforetest1()
	{
		System.out.println("beforetest2");
	}
	@BeforeClass
	public void Beforeclass1()
	{
		System.out.println("beforeclass2");
	}
	@BeforeMethod
	public void Beforemethod1()
	{
		System.out.println("beforemethod2");
	}
	@Test
	
	public void Test1()
	{
		System.out.println("test12");
	}
	@Test
	
	public void Test2()
	{
		System.out.println("test22");
	}
	@AfterMethod
	public void aftermethod1()
	{
		System.out.println("aftermethod2");
	}
	@AfterClass
	public void afterclass1()
	{
		System.out.println("afterclass2");
	}
	@AfterTest
	public void afterTest1()
	{
		System.out.println("aftertest2");
	}
	
@AfterSuite
public void aftersuite1()
{
	System.out.println("aftersuite2");
}
}
