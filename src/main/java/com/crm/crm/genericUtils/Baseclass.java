package com.crm.crm.genericUtils;

import java.sql.SQLException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import objectRepo.LoginPage;
import objectRepo.LogoutPage;

public class Baseclass 
{
	
	public DatabaseUtils dlib=new DatabaseUtils();
	public FileUtils flib=new  FileUtils();
	public ExcelUtils elib=new ExcelUtils ();
	public WebdriverUtils wlib=new WebdriverUtils();
	public javaUtils jlib=new javaUtils();
	public static WebDriver sdriver;
	public WebDriver driver;
	
	
	@BeforeSuite(alwaysRun = true)
	public void connectToDB() throws SQLException
	{
		//dlib.connectToDB();
		System.out.println("---connect to DB");
	}
	//@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchTheBrowser( ) throws Exception
	{
		String BROWSER = flib.readDataFromPropertyFile("browser");
		
		 
		 if(BROWSER.equalsIgnoreCase("chrome"))
		 {
			 driver=new ChromeDriver();
		 }
		 
		 else if(BROWSER.equalsIgnoreCase("firefox"))
		 {
			 driver=new FirefoxDriver();
		 }
		 else if(BROWSER.equalsIgnoreCase("edge"))
		 {
			 driver=new EdgeDriver();
		 }
		 else
		 {
			 System.out.println("----Invalied Browser---");
		 }
		 
		 sdriver=driver;
		 
		 //maximize window
			 wlib.maximizeWindow(driver);
			 
			 //enter uel
			 String URL = flib.readDataFromPropertyFile("url");
			 
				driver.get(URL);
			 
			 //wait for page load
			 
			 wlib.waitForPageLoad(driver, 10);
			 System.out.println("--Browser Launched--");
			 
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loginToAppl() throws Exception
	{
		
		String USERNAME = flib.readDataFromPropertyFile("username");
		String PASSWORD=flib.readDataFromPropertyFile("password");
		//login to application
		LoginPage lp=new LoginPage(driver);
	
		lp.login(USERNAME, PASSWORD, driver);
		lp.popupmsg(driver);
		
		System.out.println("---Logged in to the application");
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void logoutfromApp()
	{
		LogoutPage lo=new LogoutPage(driver);
		lo.toLogoutApplication();
		lo.toGetLogOutPopUpMsg();
		System.out.println("Logout from application");
	}
	@AfterClass(alwaysRun = true)
	public void closeBrowser()
	{
		driver.quit();
		System.out.println("Browser closed");
	}
	
	@AfterSuite(alwaysRun = true)
	public void closeDB() throws SQLException
	{
		//dlib.disconnectDB();
		System.out.println("---Close database");
	}
	

}











