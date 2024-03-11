package com.CustomerModule;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.crm.genericUtils.ExcelUtils;
import com.crm.crm.genericUtils.FileUtils;
import com.crm.crm.genericUtils.WebdriverUtils;


public class CustomerModule1Test
	{
		public static void main(String[] args) throws Exception {
			WebDriver driver=null;
			//Create obj for utils
			 FileUtils flib=new  FileUtils();
			 ExcelUtils elib=new ExcelUtils ();
			 WebdriverUtils wlib=new WebdriverUtils();
			
			
//			FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
//			Properties pobj=new Properties();
//			pobj.load(fis);
			String BROWSER=flib.readDataFromPropertyFile("browser");
			//String BROWSER=pobj.getProperty("browser");
			String URL=flib.readDataFromPropertyFile("url");
			//String URL=pobj.getProperty("url");
			String USERNAME=flib.readDataFromPropertyFile("username");
			//String USERNAME=pobj.getProperty("username");
			String PASSWORD=flib.readDataFromPropertyFile("password");
			//String PASSWORD=pobj.getProperty("password");
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
			
			//driver.manage().window().maximize();
			
			driver.get(URL);
			//To give implicitwait
			wlib.waitForPageLoad(driver, 10);
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			
			driver.findElement(By.xpath("//input[@name='user']")).sendKeys(USERNAME);
			driver.findElement(By.name("password")).sendKeys(PASSWORD);
			driver.findElement(By.name("btnlogin")).click();
			//to handle alert
			wlib.acceptAlert(driver);
			
			//Alert alert = driver.switchTo().alert();
			//alert.accept();
			driver.findElement(By.xpath("//span[text()='Customer']")).click();
			driver.findElement(By.xpath("//i[@class='fas fa-fw fa-plus']")).click();
		//To read data from excelsheet
			
			String Firstname = elib.readDataFromExcelFile("Sheet2", 0, 1);
			String Lastname = elib.readDataFromExcelFile("Sheet2", 1, 1);
			String phonenumber = elib.readDataFromExcelFile("Sheet2", 2, 1);
		driver.findElement(By.xpath("//div[@id='customerModal']/descendant::input[@placeholder='First Name']")).sendKeys(Firstname);
	driver.findElement(By.xpath("//div[@id='customerModal']/descendant::input[@placeholder='Last Name']")).sendKeys(Lastname)	;
	driver.findElement(By.xpath("//div[@id='customerModal']/descendant::input[@placeholder='Phone Number']")).sendKeys(phonenumber);
//			FileInputStream fis1 =new FileInputStream(".\\src\\test\\resources\\Excel.xlsx");
//			Workbook workbook = WorkbookFactory.create(fis1);
//			Sheet sheet = workbook.getSheet("Sheet2");
//			driver.findElement(By.xpath("//div[@id='customerModal']/descendant::input[@placeholder='First Name']")).sendKeys(sheet.getRow(0).getCell(1).toString());
//			driver.findElement(By.xpath("//div[@id='customerModal']/descendant::input[@placeholder='Last Name']")).sendKeys(sheet.getRow(1).getCell(1).toString());
//			driver.findElement(By.xpath("//div[@id='customerModal']/descendant::input[@placeholder='Phone Number']")).sendKeys(sheet.getRow(2).getCell(1).toString());
//			
////			FileInputStream fis1 = new FileInputStream(".\\src\\test\\resources\\Customerdetails.properties");
//			Properties pobj1=new Properties();
//			pobj1.load(fis1);
//			String FIRSTNAME=pobj1.getProperty("firstname");
//			String LASTNAME=pobj1.getProperty("lastname");
//			String PHONENUMBER=pobj1.getProperty("phonenumber");
			
//			driver.findElement(By.xpath("//div[@id='customerModal']/descendant::input[@placeholder='First Name']")).sendKeys(FIRSTNAME);
//			driver.findElement(By.xpath("//div[@id='customerModal']/descendant::input[@placeholder='Last Name']")).sendKeys(LASTNAME);
//			driver.findElement(By.xpath("//div[@id='customerModal']/descendant::input[@placeholder='Phone Number']")).sendKeys(PHONENUMBER);
//			
			driver.findElement(By.xpath("//div[@id='customerModal']/descendant::button[@type='submit']")).click();
			
		}

	}

