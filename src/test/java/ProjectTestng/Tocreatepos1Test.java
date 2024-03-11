package ProjectTestng;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.testng.annotations.Test;

import com.crm.crm.genericUtils.Baseclass;

import objectRepo.CustomerPage;
import objectRepo.HomePage;
import objectRepo.PointOfSalepage;

public class Tocreatepos1Test extends Baseclass
{
	@Test(groups = "integration")
	public void tOAdd_Customer () throws Exception {

			
			String Firstname = elib.readDataFromExcelFile("Sheet2", 0, 1);
			String Lastname = elib.readDataFromExcelFile("Sheet2", 1, 1);
			String phonenumber = elib.readDataFromExcelFile("Sheet2", 2, 1);
			
			//to add customer
			
			CustomerPage custo=new CustomerPage(driver);
			custo.ToAddCustomerDetails(Firstname, Lastname, phonenumber);
			
			Thread.sleep(2000);
	
			
			String Customername = elib.readDataFromExcelFile("Sheet5", 0, 1);
			String Productcash = elib.readDataFromExcelFile("Sheet5", 1, 1);
			fail();
		
		//To Verify Customer Details is Displaying in POS
			PointOfSalepage p1=new PointOfSalepage(driver);
			Thread.sleep(2000);
			p1.pos();
			Thread.sleep(2000);
			p1.toCheckPosPageIsDisplaying(driver, Customername, Productcash);
			Thread.sleep(2000);
				}


	}


