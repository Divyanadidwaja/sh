package ProjectTestng;

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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.crm.genericUtils.Baseclass;
import com.crm.crm.genericUtils.ExcelUtils;
import com.crm.crm.genericUtils.FileUtils;
import com.crm.crm.genericUtils.WebdriverUtils;

import objectRepo.LoginPage;
import objectRepo.LogoutPage;
import objectRepo.Productpage;
import objectRepo.SupplierModulepage;

public class ToCreateSupplierPosTest extends Baseclass
{
	@Test(groups = "integration")
	public void ToCreateSupplier() throws Exception {
	
		

		String company = elib.readDataFromExcelFile("Sheet4", 0, 1);
		
		String provience = elib.readDataFromExcelFile("Sheet4", 1, 1);
		
		String city = elib.readDataFromExcelFile("Sheet4", 2, 1);
		
		String phonenumber = elib.readDataFromExcelFile("Sheet4", 3, 1);
		
		SupplierModulepage sup=new SupplierModulepage(driver);
		sup.supplier(driver,company,city,provience, phonenumber);
		

		String PRODUCTCODE= elib.readDataFromExcelFile("Sheet4", 6, 1);
		String PRODUCTNAME = elib.readDataFromExcelFile("Sheet4", 7, 1);
		String PRODUCTDESCRIPTION = elib.readDataFromExcelFile("Sheet4", 8, 1);
		String PRODUCTQUANTITY = elib.readDataFromExcelFile("Sheet4", 9, 1);
		String  PRODUCTONHANDQUANTITY = elib.readDataFromExcelFile("Sheet4", 10, 1);
		String PRODUCTPRICE = elib.readDataFromExcelFile("Sheet4", 11, 1);
		String PRODUCTCATEGORY = elib.readDataFromExcelFile("Sheet4", 12, 1);
		String PRODUCTSUPPLIER = elib.readDataFromExcelFile("Sheet4", 13, 1);
		String PRODUCTDATEOFSTOCK = elib.readDataFromExcelFile("Sheet4", 14, 1);
		 Productpage pro=new  Productpage(driver);
		 pro.product(driver, PRODUCTCODE, PRODUCTNAME, PRODUCTDESCRIPTION, PRODUCTQUANTITY, PRODUCTONHANDQUANTITY, PRODUCTPRICE, PRODUCTCATEGORY, PRODUCTSUPPLIER, PRODUCTDATEOFSTOCK);
		 
}
}

