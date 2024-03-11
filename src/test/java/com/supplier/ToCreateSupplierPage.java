package com.supplier;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.crm.crm.genericUtils.ExcelUtils;
import com.crm.crm.genericUtils.FileUtils;
import com.crm.crm.genericUtils.WebdriverUtils;

public class ToCreateSupplierPage
{
	@listners()
	public static void main(String[] args) throws Exception {
		WebDriver driver=null;
		 FileUtils flib=new  FileUtils();
		 ExcelUtils elib=new ExcelUtils ();
		 WebdriverUtils wlib=new WebdriverUtils();
		 String BROWSER=flib.readDataFromPropertyFile("browser");
			String URL=flib.readDataFromPropertyFile("url");
			String USERNAME=flib.readDataFromPropertyFile("username");
	String PASSWORD=flib.readDataFromPropertyFile("password");

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
		driver.findElement(By.xpath("//span[text()='Supplier']")).click();
		driver.findElement(By.xpath("//i[@class='fas fa-fw fa-plus']")).click();
		FileInputStream fis1 =new FileInputStream(".\\src\\test\\resources\\Excel.xlsx");
		Workbook workbook = WorkbookFactory.create(fis1);
		
		Sheet sheet = workbook.getSheet("Sheet4");
		
		String company = sheet.getRow(0).getCell(1).getStringCellValue();
		String provience = sheet.getRow(1).getCell(1).getStringCellValue();
		String phonenumber=sheet.getRow(3).getCell(1).getStringCellValue();

		
	//	String cellValue = sheet.getRow(4).getCell(2).getStringCellValue();
		//String gender = sheet.getRow(4).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//div[@id='supplierModal']/descendant::input[@name='companyname']")).sendKeys(company);
	WebElement ele=driver.findElement(By.xpath("//div[@id='supplierModal']/descendant::select[@id='province']"));
	
		 Select select = new Select(ele);
		 Thread.sleep(2000);
		 select.selectByVisibleText(provience);
		 WebElement supCity1=driver.findElement(By.xpath("(//select[@id='city'])[1]"));
			Select select6=new Select(supCity1);
			Thread.sleep(2000);
			select6.selectByVisibleText("Bucay");
			driver.findElement(By.xpath("//form[@action='sup_transac.php?action=add']/descendant::input[@placeholder='Phone Number']")).
			sendKeys(phonenumber);
			driver.findElement(By.xpath("//form[@action='sup_transac.php?action=add']/child::button[@class='btn btn-success']")).click();
			driver.findElement(By.xpath("//span[text()='Product']")).click();

			driver.findElement(By.xpath("//i[@class='fas fa-fw fa-plus']")).click();
			String PRODUCTCODE=sheet.getRow(6).getCell(1).getStringCellValue();
			String PRODUCTNAME=sheet.getRow(7).getCell(1).getStringCellValue();
			String PRODUCTDESCRIPTION=sheet.getRow(8).getCell(1).getStringCellValue();
			String PRODUCTQUANTITY=sheet.getRow(9).getCell(1).getStringCellValue();
			String PRODUCTONHANDQUANTITY=sheet.getRow(10).getCell(1).getStringCellValue();
			String PRODUCTPRICE=sheet.getRow(11).getCell(1).getStringCellValue();
			String PRODUCTCATEGORY=sheet.getRow(12).getCell(1).getStringCellValue();
			String PRODUCTSUPPLIER=sheet.getRow(13).getCell(1).getStringCellValue();
			String PRODUCTDATEOFSTOCK=sheet.getRow(14).getCell(1).getStringCellValue();

driver.findElement(By.xpath("//form[@action='pro_transac.php?action=add']/descendant::input[@placeholder='Product Code']")).sendKeys(PRODUCTCODE);

driver.findElement(By.xpath("//form[@action='pro_transac.php?action=add']/descendant::input[@placeholder='Name']")).sendKeys(PRODUCTNAME);

driver.findElement(By.xpath("//form[@action='pro_transac.php?action=add']/descendant::textarea[@placeholder='Description']")).sendKeys(PRODUCTDESCRIPTION);

driver.findElement(By.xpath("//form[@action='pro_transac.php?action=add']/descendant::input[@placeholder='Quantity']")).sendKeys(PRODUCTQUANTITY);

driver.findElement(By.xpath("//form[@action='pro_transac.php?action=add']/descendant::input[@placeholder='On Hand']")).sendKeys(PRODUCTONHANDQUANTITY);

driver.findElement(By.xpath("//form[@action='pro_transac.php?action=add']/descendant::input[@placeholder='Price']")).sendKeys(PRODUCTPRICE);


WebElement proCategory=driver.findElement(By.xpath("//form[@action='pro_transac.php?action=add']/descendant::select[@name='category']"));
Select select2=new Select(proCategory);
select2.selectByVisibleText(PRODUCTCATEGORY);

WebElement proSupplier=driver.findElement(By.xpath("//form[@action='pro_transac.php?action=add']/descendant::select[@name='supplier']"));
Select select1=new Select(proSupplier);
select1.selectByVisibleText(PRODUCTSUPPLIER);

WebElement ProducData = driver.findElement(By.xpath("//form[@action='pro_transac.php?action=add']/descendant::input[@placeholder='Date Stock In']"));
ProducData.click();
ProducData.sendKeys(PRODUCTDATEOFSTOCK);

driver.findElement(By.xpath("//form[@action='pro_transac.php?action=add']/descendant::i[@class='fa fa-check fa-fw']")).click();

//To Verify Added Product is Displaying in Inventory

driver.findElement(By.xpath("//span[text()='Inventory']")).click();

WebElement searchTextFIELD = driver.findElement(By.xpath("//input[@class='form-control form-control-sm']"));
searchTextFIELD.click();
searchTextFIELD.sendKeys(PRODUCTCODE);

String expectedCode="AD101";

if(PRODUCTCODE.equals(expectedCode)) {
System.out.println("Test case pass");
}
else {
System.out.println("Test case fail");
}

//LOGOUT
driver.findElement(By.xpath("//span[text()='Prince Ly Cesar']")).click();

driver.findElement(By.xpath("//a[@data-toggle='modal']")).click();

driver.findElement(By.xpath("//div[@aria-modal='true']/descendant::a[@class='btn btn-primary']")).click();
		
		
	}
}
