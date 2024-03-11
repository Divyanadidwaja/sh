package com.TestNG;

import org.testng.annotations.Test;

public class ExecutDataProviderTest 


{
@Test(dataProviderClass=ExcelDataprovider1Test.class,dataProvider="excelData")

	public void excelData(String key,String value,String Price)
	{
		System.out.println("key--->"+key+"value-->"+value+"price-->"+Price);
	}
}
