package com.TestNG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.crm.genericUtils.ExcelUtils;
import com.crm.crm.genericUtils.FileUtils;
import com.crm.crm.genericUtils.WebdriverUtils;

import objectRepo.LoginPage;
@Test(dataProvider = "getexcelData")
public class GetData 
{
	public void getdata(String Username, String PASSWORD) throws Exception
	{
	 FileUtils flib=new  FileUtils();
	 WebdriverUtils wlib=new WebdriverUtils();
	 
	String URL = flib.readDataFromPropertyFile("url");
	//String Username = flib.readDataFromPropertyFile("USERNAME");
	//String PASSWORD = flib.readDataFromPropertyFile("PASSWORD");
	 WebDriver driver=new ChromeDriver();
	 wlib.maximizeWindow(driver);
	 driver.get(URL);
	 wlib.waitForPageLoad(driver, 10);
	 
	 LoginPage lp=new  LoginPage(driver);
	 lp.login(Username,PASSWORD,driver);
	}
	 
	 @DataProvider
	 public Object[][] getexcelData() throws EncryptedDocumentException, IOException
	 {
	 	ExcelUtils elib=new ExcelUtils ();
	 	Object[][] value = elib.excelData("LoginCrd");
	 	return value;	
	 	
	 }
	
	 
	 
}	 
	

