package com.TestNG;

import org.testng.annotations.Test;

public class TravelTest{


	@Test(dataProviderClass=DataProviderTest.class,dataProvider="setData" )
	
		public void company(String company,String location)
		{
			System.out.println("company name is"+company+"location is"+location);
		}
	}



