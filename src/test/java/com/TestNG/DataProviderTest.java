package com.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest 
{
@Test(dataProvider = "setData")
public void company(String company,String location)
{
	System.out.println("company name is"+company+"location is"+location);
}
	
	
@DataProvider
public  Object[][] get()
{
	Object[][] obj=new Object[2][2];
	obj[0][0]="testYantra";
	obj[0][1]="Bangalore";
	
	obj[1][0]="Qspider";
	obj[1][1]="Mysore";
	
	return obj;
	
	

}

}
