package com.Practice.Package;

import org.testng.annotations.Test;

public class ReadDataFromCmdTest 
{
@Test
public void readDataTest()
{
	String browser=System.getProperty("browser");
	String url=System.getProperty("url");
	String username=System.getProperty("username");
	String password=System.getProperty("password");
	
	System.out.println(browser);
	System.out.println(url);
	
}
}
