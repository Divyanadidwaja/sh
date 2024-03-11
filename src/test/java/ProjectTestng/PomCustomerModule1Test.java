package ProjectTestng;

import static org.testng.Assert.fail;

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
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.crm.genericUtils.Baseclass;
import com.crm.crm.genericUtils.ExcelUtils;
import com.crm.crm.genericUtils.FileUtils;
import com.crm.crm.genericUtils.WebdriverUtils;

import objectRepo.CustomerPage;
import objectRepo.HomePage;
import objectRepo.LoginPage;
import objectRepo.LogoutPage;
@Listeners(com.crm.crm.genericUtils.listenerUtils.class)
public class PomCustomerModule1Test extends Baseclass
{
	
@Test(groups = "smoke testing",retryAnalyzer = com.crm.crm.genericUtils.RetryImpUtils.class )
public void ToCreateCustomer() throws Exception

{

    	String Firstname = elib.readDataFromExcelFile("Sheet2", 0, 1);
		String Lastname = elib.readDataFromExcelFile("Sheet2", 1, 1);
		String phonenumber = elib.readDataFromExcelFile("Sheet2", 2, 1);
		
		//to add customer
		
		CustomerPage custo=new CustomerPage(driver);
	fail();
		custo.ToAddCustomerDetails(Firstname, Lastname, phonenumber);
		System.out.println("customer created sucessfully in custo");
		}

}

