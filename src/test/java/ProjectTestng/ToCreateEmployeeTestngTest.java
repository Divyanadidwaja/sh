package ProjectTestng;

import static org.testng.Assert.fail;

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
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.crm.genericUtils.Baseclass;
import com.crm.crm.genericUtils.ExcelUtils;
import com.crm.crm.genericUtils.FileUtils;
import com.crm.crm.genericUtils.WebdriverUtils;
import com.crm.crm.genericUtils.javaUtils;

import objectRepo.EmployeePage;
import objectRepo.LoginPage;
import objectRepo.LogoutPage;


@Listeners(com.crm.crm.genericUtils.listenerUtils.class)


public class ToCreateEmployeeTestngTest extends Baseclass
{
	
@Test
public void ToCreate() throws Exception
	//public static void main(String[] args) throws Exception
	{
	
	
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
		EmployeePage emp1=new EmployeePage(driver);
		emp1.ToCreateEmployeeAccount(Firstname, Lastname,job,Email, PhoneNumber, Date1, province, city2, driver,gender );
		
            String Username= elib.readDataFromExcelFile("Sheet3", 10, 1);
			String Password= elib.readDataFromExcelFile("Sheet3", 11, 1);	
			fail();
	}
}

