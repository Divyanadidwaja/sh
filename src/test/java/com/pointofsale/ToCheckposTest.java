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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.crm.genericUtils.ExcelUtils;
import com.crm.crm.genericUtils.FileUtils;
import com.crm.crm.genericUtils.WebdriverUtils;

public class ToCheckposTest
{
	
	public static void main(String[] args) throws Exception {
		WebDriver driver=null;
		 FileUtils flib=new  FileUtils();
		 ExcelUtils elib=new ExcelUtils ();
		 WebdriverUtils wlib=new WebdriverUtils();
		 String BROWSER=flib.readDataFromPropertyFile("browser");
			String URL=flib.readDataFromPropertyFile("url");
			String USERNAME=flib.readDataFromPropertyFile("username");
	String PASSWORD=flib.readDataFromPropertyFile("password");
		
//		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
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
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("//span[text()='Customer']")).click();
		driver.findElement(By.xpath("//i[@class='fas fa-fw fa-plus']")).click();
//		FileInputStream fis1 =new FileInputStream(".\\src\\test\\resources\\Excel.xlsx");
//		Workbook workbook = WorkbookFactory.create(fis1);
//		Sheet sheet = workbook.getSheet("Sheet2");
//		To fetch data from excel
		String firstname = elib.readDataFromExcelFile("Sheet2", 0, 1);
		String lastname = elib.readDataFromExcelFile("Sheet2", 1, 1);
		String phonenumber = elib.readDataFromExcelFile("Sheet2", 2, 1);
		
		
		driver.findElement(By.xpath("//div[@id='customerModal']/descendant::input[@placeholder='First Name']")).sendKeys(firstname);
	driver.findElement(By.xpath("//div[@id='customerModal']/descendant::input[@placeholder='Last Name']")).sendKeys(lastname);
	driver.findElement(By.xpath("//div[@id='customerModal']/descendant::input[@placeholder='Phone Number']")).sendKeys(phonenumber);
		
//		FileInputStream fis1 = new FileInputStream(".\\src\\test\\resources\\Customerdetails.properties");
//		Properties pobj1=new Properties();
//		pobj1.load(fis1);
//		String FIRSTNAME=pobj1.getProperty("firstname");
//		String LASTNAME=pobj1.getProperty("lastname");
//		String PHONENUMBER=pobj1.getProperty("phonenumber");
//		
//		driver.findElement(By.xpath("//div[@id='customerModal']/descendant::input[@placeholder='First Name']")).sendKeys(sheet.getRow(0).getCell(1).toString());
//		driver.findElement(By.xpath("//div[@id='customerModal']/descendant::input[@placeholder='Last Name']")).sendKeys(sheet.getRow(1).getCell(1).toString());
//		driver.findElement(By.xpath("//div[@id='customerModal']/descendant::input[@placeholder='Phone Number']")).sendKeys(sheet.getRow(2).getCell(1).toString());
		driver.findElement(By.xpath("//div[@id='customerModal']/descendant::button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='POS']")).click();
		driver.findElement(By.xpath("//a[text()='Keyboard']")).click();
		driver.findElement(By.xpath("//form[@action='pos.php?action=add&id=62']/descendant::input[@class='btn btn-info']")).click();
		//driver.findElement(By.xpath("//div[@class='card-body col-md-3']/descendant::i[@class='fas fa-fw fa-plus']")).()click();
		
		WebElement ele=driver.findElement(By.xpath("//select[@name='customer']"));
		Select sel=new Select(ele);
		sel.selectByValue("38");
		 WebElement text = driver.findElement(By.xpath("//option[@value='38']"));
		 
		String ActualText = text.getText();
		String ExpectedText="divya nandi";
		if(ActualText.equalsIgnoreCase(ExpectedText))
		{
			System.out.println("Testcase is pass");
		}
		else
			System.out.println("Testcase is fail");
		//To Logout the application
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='img-profile rounded-circle']")).click();
		Thread.sleep(2000);
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
driver.findElement(By.xpath("//input[@name='user']")).sendKeys(USERNAME);
driver.findElement(By.name("password")).sendKeys(PASSWORD);
driver.findElement(By.name("btnlogin")).click();
Alert alert1 = driver.switchTo().alert();
alert1.accept();
driver.findElement(By.xpath("//span[text()='Transaction']")).click();
String transaction = elib.readDataFromExcelFile("Sheet5", 0, 1);

driver.findElement(By.xpath("//input[@class='form-control form-control-sm']")).sendKeys(transaction);
//FileInputStream fis2 =new FileInputStream(".\\src\\test\\resources\\Excel.xlsx");
//Workbook workbook1 = WorkbookFactory.create(fis2);
//Sheet sheet1 = workbook.getSheet("Sheet5");
//	//driver.findElement(By.xpath("//input[@type='search']")).sendKeys(sheet.getRow(0).getCell(1).toString());
//	WebElement transaction = driver.findElement(By.xpath("//input[@class='form-control form-control-sm']"));
//	transaction.click();
//	transaction.sendKeys(sheet.getRow(0).getCell(1).toString());
	Thread.sleep(2000);
//	driver.findElement(By.xpath("//img[@class='img-profile rounded-circle']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//i[@class='fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400']")).click();
//	
//WebElement logout2 = driver.findElement(By.xpath("//div[@id='logoutModal' and @class='modal fade show']/descendant::div[@class='modal-footer']/child::a[text()='Logout']"));
//logout2.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@class='img-profile rounded-circle']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//i[@class='fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400']")).click();
	
WebElement logout1 = driver.findElement(By.xpath("//div[@id='logoutModal' and @class='modal fade show']/descendant::div[@class='modal-footer']/child::a[text()='Logout']"));

WebElement logoutmsg1=driver.findElement(By.xpath("//div[@id='logoutModal' and @class='modal fade show']/descendant::div[text()='Prince Ly are you sure do you want to logout?']"));
String actualLogoutText1=logoutmsg1.getText();
System.out.println("textmsg:"+" " +actualLogoutText1);

String expectedLogoutText1="Prince Ly are you sure do you want to logout?";
if(expectedLogoutText1.equals(actualLogoutText1)){
System.out.println("Test case is pass");
}
else {
System.out.println("Test case is failed");
}
logout1.click();

}

		
	
	}

	




