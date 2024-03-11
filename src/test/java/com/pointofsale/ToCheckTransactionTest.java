package com.pointofsale;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.crm.genericUtils.Baseclass;
import com.crm.crm.genericUtils.ExcelUtils;
import com.crm.crm.genericUtils.FileUtils;
import com.crm.crm.genericUtils.WebdriverUtils;




public class ToCheckTransactionTest extends Baseclass
{
	//public void Transaction() {
		
	
	public static void main(String[] args) throws Exception {
		WebDriver driver=null;
		 FileUtils flib=new  FileUtils();
		 ExcelUtils elib=new ExcelUtils ();
		 WebdriverUtils wlib=new WebdriverUtils();
////		
////		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
////		Properties pobj=new Properties();
////		pobj.load(fis);
//		 String BROWSER=flib.readDataFromPropertyFile("browser");
//			String URL=flib.readDataFromPropertyFile("url");
//			String USERNAME=flib.readDataFromPropertyFile("username");
//	      String PASSWORD=flib.readDataFromPropertyFile("password");
////		String BROWSER=pobj.getProperty("browser");
////		String URL=pobj.getProperty("url");
////		String USERNAME=pobj.getProperty("username");
////		String PASSWORD=pobj.getProperty("password");
//		if(BROWSER.equalsIgnoreCase("chrome"))
//				{
//			 driver=new ChromeDriver();
//				}
//		else
//		{
//			System.out.println("----------invalied browser");
//		}
//		driver.manage().window().maximize();
//		
//		driver.get(URL);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		driver.findElement(By.xpath("//input[@name='user']")).sendKeys(USERNAME);
//		driver.findElement(By.name("password")).sendKeys(PASSWORD);
//		driver.findElement(By.name("btnlogin")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
		
		driver.findElement(By.xpath("//span[text()='Transaction']")).click();
		
	FileInputStream fis1 =new FileInputStream(".\\src\\test\\resources\\Excel.xlsx");
	Workbook workbook = WorkbookFactory.create(fis1);
	Sheet sheet = workbook.getSheet("Sheet5");
	String transaction = elib.readDataFromExcelFile("Sheet5", 0, 1);
	driver.findElement(By.xpath("//input[@class='form-control form-control-sm']")).sendKeys(transaction);
		//driver.findElement(By.xpath("//input[@type='search']")).sendKeys(sheet.getRow(0).getCell(1).toString());
//		WebElement transaction = driver.findElement(By.xpath("//input[@class='form-control form-control-sm']"));
//		transaction.click();
//		transaction.sendKeys(sheet.getRow(0).getCell(1).toString());
	//	Thread.sleep(2000);
//		driver.findElement(By.xpath("//img[@class='img-profile rounded-circle']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//i[@class='fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400']")).click();
//		
//WebElement logout2 = driver.findElement(By.xpath("//div[@id='logoutModal' and @class='modal fade show']/descendant::div[@class='modal-footer']/child::a[text()='Logout']"));
//logout2.click();
	//	Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='img-profile rounded-circle']")).click();
	//	Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400']")).click();
		
WebElement logout = driver.findElement(By.xpath("//div[@id='logoutModal' and @class='modal fade show']/descendant::div[@class='modal-footer']/child::a[text()='Logout']"));

WebElement logoutmsg=driver.findElement(By.xpath("//div[@id='logoutModal' and @class='modal fade show']/descendant::div[text()='Prince Ly are you sure do you want to logout?']"));
String actualLogoutText=logoutmsg.getText();
System.out.println("textmsg:"+" " +actualLogoutText);

String expectedLogoutText="Prince Ly are you sure do you want to logout?";
if(expectedLogoutText.equals(actualLogoutText)){
	System.out.println("Test case is pass");
}
else {
	System.out.println("Test case is failed");
}
logout.click();

	}
}

