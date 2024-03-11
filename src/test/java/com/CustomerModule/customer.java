package com.CustomerModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.crm.genericUtils.Baseclass;
import com.crm.crm.genericUtils.ExcelUtils;
import com.crm.crm.genericUtils.FileUtils;
import com.crm.crm.genericUtils.WebdriverUtils;

import objectRepo.LoginPage;

public class customer extends Baseclass{

	//public static void main(String[] args) throws Exception {
	
	@Test
	public void test() throws Exception {
		//WebDriver driver=null;
		//Create obj for utils
//		 FileUtils flib=new  FileUtils();
//		 ExcelUtils elib=new ExcelUtils ();
//		 WebdriverUtils wlib=new WebdriverUtils();
		
		 
//			String USERNAME=flib.readDataFromPropertyFile("username");
//			
//			String PASSWORD=flib.readDataFromPropertyFile("password");
//		 
//		LoginPage login=new LoginPage(driver);
//		login.login(USERNAME, PASSWORD, driver);
		

//		String BROWSER=flib.readDataFromPropertyFile("browser");
//	
//		String URL=flib.readDataFromPropertyFile("url");
//		

//	
//		if(BROWSER.equalsIgnoreCase("chrome"))
//				{
//			 driver=new ChromeDriver();
//				}
//		else
//		{
//			System.out.println("----------invalied browser");
//		}
//		//To maximize the window
//		wlib.maximizeWindow(driver);
//		
//		
//		
//		driver.get(URL);
//		//To give implicitwait
//		wlib.waitForPageLoad(driver, 10);
//	
//		
//		
//		
//		driver.findElement(By.xpath("//input[@name='user']")).sendKeys(USERNAME);
//		driver.findElement(By.name("password")).sendKeys(PASSWORD);
//		driver.findElement(By.name("btnlogin")).click();
//		//to handle alert
//		wlib.acceptAlert(driver);
		
		
		driver.findElement(By.xpath("//span[text()='Customer']")).click();
		driver.findElement(By.xpath("//i[@class='fas fa-fw fa-plus']")).click();
	//To read data from excelsheet
		
		String Firstname = elib.readDataFromExcelFile("Sheet2", 0, 1);
		String Lastname = elib.readDataFromExcelFile("Sheet2", 1, 1);
		String phonenumber = elib.readDataFromExcelFile("Sheet2", 2, 1);
	driver.findElement(By.xpath("//div[@id='customerModal']/descendant::input[@placeholder='First Name']")).sendKeys(Firstname);
driver.findElement(By.xpath("//div[@id='customerModal']/descendant::input[@placeholder='Last Name']")).sendKeys(Lastname)	;
driver.findElement(By.xpath("//div[@id='customerModal']/descendant::input[@placeholder='Phone Number']")).sendKeys(phonenumber);

	
		driver.findElement(By.xpath("//div[@id='customerModal']/descendant::button[@type='submit']")).click();

	}

}
