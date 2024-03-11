package com.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.crm.crm.genericUtils.ExcelUtils;
import com.crm.crm.genericUtils.FileUtils;
import com.crm.crm.genericUtils.WebdriverUtils;
import com.crm.crm.genericUtils.javaUtils;

import objectRepo.EmployeePage;
import objectRepo.LoginPage;
import objectRepo.LogoutPage;

public class PomToCreateEmployeeTest
{

	public static void main(String[] args) throws Exception {
		WebDriver driver=null;
		//to create reference
		FileUtils flib=new  FileUtils();
		 ExcelUtils elib=new ExcelUtils ();
		 WebdriverUtils wlib=new WebdriverUtils();
		 javaUtils  jlib=new javaUtils();
      
		String BROWSER=flib.readDataFromPropertyFile("browser");
	    String URL=flib.readDataFromPropertyFile("url");
		String USERNAME=flib.readDataFromPropertyFile("username");
		String PASSWORD=flib.readDataFromPropertyFile("password");
		 //login to the application

		if(BROWSER.equalsIgnoreCase("chrome"))
				{
			 driver=new ChromeDriver();
				}
		else
		{
			System.out.println("----------invalied browser");
		}
		//To maximize the window
		wlib.maximizeWindow(driver);
		
		
		
		driver.get(URL);
		//To give implicitwait
		wlib.waitForPageLoad(driver, 10);
	
		
		//login to the application
		

		String cellValue= elib.readDataFromExcelFile("Sheet3", 4, 2);
		String gender= elib.readDataFromExcelFile("Sheet3", 4, 2);
		String job= elib.readDataFromExcelFile("Sheet3", 5, 1);
		String Date1= elib.readDataFromExcelFile("Sheet3", 6, 1);
		String province= elib.readDataFromExcelFile("Sheet3", 7, 1);
		String city2= elib.readDataFromExcelFile("Sheet3", 8, 1);
		String emp= elib.readDataFromExcelFile("Sheet3", 9, 1);
		//to addemployee
		String Firstname= elib.readDataFromExcelFile("Sheet3", 0, 1);
		String Lastname= elib.readDataFromExcelFile("Sheet3", 1, 1);
		String Email= elib.readDataFromExcelFile("Sheet3", 2, 1);
		String PhoneNumber= elib.readDataFromExcelFile("Sheet3", 3, 1);
		
		LoginPage log=new LoginPage(driver);
		log.login(USERNAME, PASSWORD, driver);
		
		EmployeePage emp1=new EmployeePage(driver);
		emp1.ToCreateEmployeeAccount(Firstname, Lastname,job,Email, PhoneNumber, Date1, province, city2, driver,gender );
		

		
	//driver.findElement(By.xpath("//span[text()='Employee']")).click();
//	driver.findElement(By.xpath("//i[@class='fas fa-fw fa-plus']")).click();
	
//	
// driver.findElement(By.xpath("//div[@id='employeeModal']/descendant::input[@placeholder='First Name']")).sendKeys(Firstname);
// driver.findElement(By.xpath("//div[@id='employeeModal']/descendant::input[@placeholder='Last Name']")).sendKeys(Lastname);

	
	 
	

		

		
		
		

//	WebElement ele = driver.findElement(By.xpath("//form[@action='emp_transac.php?action=add']/child::div[@class='form-group']/child::select[@name='gender']"));
	
		//select by visibletext
//	wlib.selectbyvisibletext(ele,gender);
		

	
	
//	driver.findElement(By.xpath("//div[@id='employeeModal']/descendant::input[@placeholder='Email']")).sendKeys(Email);
//	driver.findElement(By.xpath("//div[@id='employeeModal']/descendant::input[@placeholder='Phone Number']")).sendKeys(PhoneNumber+jlib.getRandomNo());
	
//	
	//	WebElement ele2=driver.findElement(By.xpath("//select[@name='jobs']"));
		//select by visibletext
		
		//wlib.selectbyvisibletext(ele2, job);
		
//		
		//WebElement date = driver.findElement(By.xpath("//input[@id='FromDate']"));
		//date.click();
		//date.sendKeys(Date1);
		//date.sendKeys("2110", Keys.TAB, "2024");
	//	WebElement province1=driver.findElement(By.xpath("//div[@id='employeeModal']/descendant::select[@id='province']"));
		//select by visibletext province
		
	//	wlib.selectbyvisibletext(province1, province);

		// WebElement city= driver.findElement(By.xpath("//div[@id='employeeModal']/descendant::select[@id='city']"));
		//select by visibletext city
		 
	//	 wlib.selectbyvisibletext(city, city2);

		// driver.findElement(By.xpath("//div[@id='employeeModal']/descendant::button[@type='submit']")).click();
		 
// driver.findElement(By.xpath("//span[text()='Accounts']")).click();
       //  driver.findElement(By.xpath("//i[@class='fas fa-fw fa-plus']")).click();
		
		// WebElement employee= driver.findElement(By.xpath("//select[@name='empid']"));
	//	 employee.click();
		 
		 //select by visible text emp
		// wlib.selectbyvisibletext(employee, emp);
		 

		 
			String Username= elib.readDataFromExcelFile("Sheet3", 10, 1);
			String Password= elib.readDataFromExcelFile("Sheet3", 11, 1);
			// driver.findElement(By.xpath("//form[@action='us_transac.php?action=add']/descendant::input[@placeholder='Username']")).sendKeys(Username);
			// driver.findElement(By.xpath("//form[@action='us_transac.php?action=add']/descendant::input[@placeholder='Password']")).sendKeys(Password);
//		 
//		 driver.findElement(By.xpath("//div[@id='supplierModal']/descendant::button[@type='submit']")).click();
//		 driver.findElement(By.xpath("//span[text()='Prince Ly Cesar']")).click();
//		 driver.findElement(By.xpath("//div[@aria-labelledby='userDropdown']/descendant::a[@href='#']")).click();
//		driver.findElement(By.xpath("//div[@aria-modal=\"true\"]/descendant::a")).click();
			LogoutPage logo=new LogoutPage(driver);
			logo.toLogoutApplication();
			logo.toGetLogOutPopUpMsg();
		
		
	}
}
