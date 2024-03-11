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

public class annotationTest 
{
@BeforeSuite
public void  beforesuit()
{
	System.out.println("---Connect to Database---");
}
@BeforeTest
public void  beforetest()
{
	System.out.println("before test");
}
@BeforeClass
public void  beforeclass()
{
	System.out.println("launch the browser");
}
@BeforeMethod
public void  beforemethod()
{
	System.out.println("log in to application");
}
@Test
public void test()
{
	System.out.println("test method");
}
@Test
public void test1()
{
	System.out.println("test1 method");
}

@AfterSuite
public void aftersuite()
{
	System.out.println("after suite");
}
@AfterClass
public void afterclass()
{
	System.out.println("after class");
}
@AfterTest
public void aftertest()
{
	System.out.println("after test");
}
@AfterMethod
public void aftermethod()
{
	System.out.println("after method");
}

}
