package com.TestNG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.crm.genericUtils.ExcelUtils;


public class ExecuteDptest
{
@Test(dataProvider="getexcelData")
public void getData(String src,String dst,String price)
{
	System.out.println("From==>"+src+ "to==>"+dst+"price==>"+price);
}



@DataProvider
public Object[][] getexcelData() throws EncryptedDocumentException, IOException
{
	ExcelUtils elib=new ExcelUtils ();                   
		Object[][] value = elib.excelData("DataProvider");
	return value;	
	
}
}
