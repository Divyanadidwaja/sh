package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.crm.genericUtils.Baseclass;
import com.crm.crm.genericUtils.ExcelUtils;
import com.crm.crm.genericUtils.FileUtils;
import com.crm.crm.genericUtils.WebdriverUtils;

import objectRepo.CustomerPage;
import objectRepo.HomePage;
import objectRepo.LoginPage;
import objectRepo.LogoutPage;

public class CustomerTest extends Baseclass
{
	@Test
public void customermodule() throws Exception
{
	//WebDriver driver=null;
//	//Create obj for utils
//	 FileUtils flib=new  FileUtils();
//	 ExcelUtils elib=new ExcelUtils ();
//	 WebdriverUtils wlib=new WebdriverUtils();
//	
//	
//
//	String BROWSER=flib.readDataFromPropertyFile("browser");
//    String URL=flib.readDataFromPropertyFile("url");
//	String USERNAME=flib.readDataFromPropertyFile("username");
//	String PASSWORD=flib.readDataFromPropertyFile("password");
	
	


//	if(BROWSER.equalsIgnoreCase("chrome"))
//			{
//		 driver=new ChromeDriver();
//			}
//	else
//	{
//		System.out.println("----------invalied browser");
//	}
//	//To maximize the window
//	wlib.maximizeWindow(driver);
//	
	
	
//	driver.get(URL);
//	//To give implicitwait
//	wlib.waitForPageLoad(driver, 10);

	
	//login to the application
	
//	LoginPage log=new LoginPage(driver);
//	log.login(USERNAME, PASSWORD, driver);
//	

	//to click on customer module
	HomePage h1=new HomePage(driver);
	h1.toClickcustomerModule();
	
	String Firstname = elib.readDataFromExcelFile("Sheet2", 0, 1);
	String Lastname = elib.readDataFromExcelFile("Sheet2", 1, 1);
	String phonenumber = elib.readDataFromExcelFile("Sheet2", 2, 1);
	
	//to add customer
	
	CustomerPage custo=new CustomerPage(driver);
	custo.ToAddCustomerDetails(Firstname, Lastname, phonenumber);
	
//	LogoutPage logo=new LogoutPage(driver);
//	logo.toLogoutApplication();
//	logo.toGetLogOutPopUpMsg();
	


	
	
	
	
}
}

