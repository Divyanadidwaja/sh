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

public class ToCreateEmployeeTest
{

	public static void main(String[] args) throws Exception {
		WebDriver driver=null;
		//to create reference
		FileUtils flib=new  FileUtils();
		 ExcelUtils elib=new ExcelUtils ();
		 WebdriverUtils wlib=new WebdriverUtils();
		 javaUtils  jlib=new javaUtils();
      
		 
		 //login to the application
		String BROWSER = flib.readDataFromPropertyFile("browser");
		 String URL = flib.readDataFromPropertyFile("url");
		String USERNAME = flib.readDataFromPropertyFile("username");
		String PASSWORD = flib.readDataFromPropertyFile("password");
//		 FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
//		Properties pobj=new Properties();
//		pobj.load(fis);
//		String BROWSER=pobj.getProperty("browser");
//		String URL=pobj.getProperty("url");
//		String USERNAME=pobj.getProperty("username");
//		String PASSWORD=pobj.getProperty("password");
		if(BROWSER.equalsIgnoreCase("chrome"))
				{
			 driver=new ChromeDriver();
				}
		else
		{
			System.out.println("----------invalied browser");
		}
		driver.manage().window().maximize();
		
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='user']")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		driver.findElement(By.name("btnlogin")).click();
		//alert popup
		wlib.acceptAlert(driver);
		
//		Alert alert = driver.switchTo().alert();
//	alert.accept();
	driver.findElement(By.xpath("//span[text()='Employee']")).click();
	driver.findElement(By.xpath("//i[@class='fas fa-fw fa-plus']")).click();
	//read the data from excel
	//to create customer
	
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
 driver.findElement(By.xpath("//div[@id='employeeModal']/descendant::input[@placeholder='First Name']")).sendKeys(Firstname);
 driver.findElement(By.xpath("//div[@id='employeeModal']/descendant::input[@placeholder='Last Name']")).sendKeys(Lastname);

	
	 
	
//	FileInputStream fis1 =new FileInputStream(".\\src\\test\\resources\\Excel.xlsx");
//		Workbook workbook = WorkbookFactory.create(fis1);
//		
//		Sheet sheet = workbook.getSheet("Sheet3");
//		String cellValue = sheet.getRow(4).getCell(2).getStringCellValue();
//		String gender = sheet.getRow(4).getCell(2).getStringCellValue();
//		String job = sheet.getRow(5).getCell(1).getStringCellValue();
//		String Date1 = sheet.getRow(6).getCell(1).getStringCellValue();
//		String provience = sheet.getRow(7).getCell(1).getStringCellValue();
//		String city2 = sheet.getRow(8).getCell(1).getStringCellValue();
//	String emp = sheet.getRow(9).getCell(1).getStringCellValue();
		
		
		System.out.println(gender);
		
		
		
//		 driver.findElement(By.xpath("//div[@id='employeeModal']/descendant::input[@placeholder='First Name']")).sendKeys(sheet.getRow(0).getCell(1).toString());
//		driver.findElement(By.xpath("//div[@id='employeeModal']/descendant::input[@placeholder='Last Name']")).sendKeys(sheet.getRow(1).getCell(1).toString());
	WebElement ele = driver.findElement(By.xpath("//form[@action='emp_transac.php?action=add']/child::div[@class='form-group']/child::select[@name='gender']"));
	
		//select by visibletext
	wlib.selectbyvisibletext(ele,gender);
		
//		 Select select = new Select(ele);
//		 Thread.sleep(2000);
//		select.selectByVisibleText(gender);
	
	String Email= elib.readDataFromExcelFile("Sheet3", 2, 1);
	String PhoneNumber= elib.readDataFromExcelFile("Sheet3", 3, 1);
	driver.findElement(By.xpath("//div[@id='employeeModal']/descendant::input[@placeholder='Email']")).sendKeys(Email);
	driver.findElement(By.xpath("//div[@id='employeeModal']/descendant::input[@placeholder='Phone Number']")).sendKeys(PhoneNumber+jlib.getRandomNo());
	
//		driver.findElement(By.xpath("//div[@id='employeeModal']/descendant::input[@placeholder='Email']")).sendKeys(sheet.getRow(2).getCell(1).toString());
//		driver.findElement(By.xpath("//div[@id='employeeModal']/descendant::input[@placeholder='Phone Number']")).sendKeys(sheet.getRow(3).getCell(1).toString());
		WebElement ele2=driver.findElement(By.xpath("//select[@name='jobs']"));
		//select by visibletext
		
		wlib.selectbyvisibletext(ele2, job);
		
//		Select select1 = new Select(ele2);
//		 Thread.sleep(2000);
//		select1.selectByVisibleText(job);
		WebElement date = driver.findElement(By.xpath("//input[@id='FromDate']"));
		date.click();
		date.sendKeys(Date1);
		//date.sendKeys("2110", Keys.TAB, "2024");
		WebElement province1=driver.findElement(By.xpath("//div[@id='employeeModal']/descendant::select[@id='province']"));
		//select by visibletext province
		
		wlib.selectbyvisibletext(province1, province);
//		Select select3 = new Select(province1);
//		 Thread.sleep(2000);
//		 select3.selectByVisibleText(province);
		 Thread.sleep(2000);
		 WebElement city= driver.findElement(By.xpath("//div[@id='employeeModal']/descendant::select[@id='city']"));
		//select by visibletext city
		 
		 wlib.selectbyvisibletext(city, city2);
		 
//		 Select select4 = new Select(city);
//		 Thread.sleep(2000);
//		 select4.selectByVisibleText(city2);
		 driver.findElement(By.xpath("//div[@id='employeeModal']/descendant::button[@type='submit']")).click();
		 
 driver.findElement(By.xpath("//span[text()='Accounts']")).click();
         driver.findElement(By.xpath("//i[@class='fas fa-fw fa-plus']")).click();
		
		 WebElement employee= driver.findElement(By.xpath("//select[@name='empid']"));
		 employee.click();
		 
		 //select by visible text emp
		 wlib.selectbyvisibletext(employee, emp);
		 
//	 Select select5 = new Select(employee);
//	 Thread.sleep(2000);
//		 select5.selectByVisibleText(emp);
		 
//login to the application as Employee
		 
			String Username= elib.readDataFromExcelFile("Sheet3", 10, 1);
			String Password= elib.readDataFromExcelFile("Sheet3", 11, 1);
			 driver.findElement(By.xpath("//form[@action='us_transac.php?action=add']/descendant::input[@placeholder='Username']")).sendKeys(Username);
			 driver.findElement(By.xpath("//form[@action='us_transac.php?action=add']/descendant::input[@placeholder='Password']")).sendKeys(Password);
		 
//		 driver.findElement(By.xpath("//form[@action='us_transac.php?action=add']/descendant::input[@placeholder='Username']")).sendKeys(sheet.getRow(10).getCell(1).toString());
//		 driver.findElement(By.xpath("//form[@action='us_transac.php?action=add']/descendant::input[@placeholder='Password']")).sendKeys(sheet.getRow(11).getCell(1).toString()); 
		 driver.findElement(By.xpath("//div[@id='supplierModal']/descendant::button[@type='submit']")).click();
		 driver.findElement(By.xpath("//span[text()='Prince Ly Cesar']")).click();
		 driver.findElement(By.xpath("//div[@aria-labelledby='userDropdown']/descendant::a[@href='#']")).click();
		driver.findElement(By.xpath("//div[@aria-modal=\"true\"]/descendant::a")).click();
		
		
		
	}
}
