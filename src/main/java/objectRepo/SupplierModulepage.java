package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.crm.genericUtils.WebdriverUtils;

public class SupplierModulepage extends WebdriverUtils
{
    @FindBy(xpath="//span[text()='Supplier']")
    private WebElement toclickonSupplier;
    
    @FindBy(xpath="//i[@class='fas fa-fw fa-plus']")
    private WebElement toclickonPlusButton;
    
    @FindBy(xpath="//form[@action='sup_transac.php?action=add']/descendant::select[@id='city']")
    private WebElement toSelectcity;
    
    @FindBy(xpath="//div[@id='supplierModal']/descendant::input[@name='companyname']")
    private WebElement toSelectCompanyName;
    
    @FindBy(xpath="//div[@id='supplierModal']/descendant::select[@id='province']")
    private WebElement toSelectProvinceDropdown;
    
   @FindBy(xpath="//form[@action='sup_transac.php?action=add']/descendant::input[@placeholder='Phone Number']")
    private WebElement PhoneNumberTextField;
   
   @FindBy(xpath="//form[@action='sup_transac.php?action=add']/child::button[@class='btn btn-success']")
   private WebElement toClickonsaveButton;
   
   //Initialization
   public SupplierModulepage(WebDriver driver) {
   	PageFactory.initElements(driver,this);
   }


 //Utilization

   
   public WebElement getToSelectCompanyName() {
	return toSelectCompanyName;
}





public WebElement getToclickonSupplier() {
	return toclickonSupplier;
}


public WebElement getToclickonPlusButton() {
	return toclickonPlusButton;
}


public WebElement getToSelectcity() {
	return toSelectcity;
}


public WebElement getToSelectProvinceDropdown() {
	return toSelectProvinceDropdown;
}


public WebElement getPhoneNumberTextField() {
	return PhoneNumberTextField;
}


public WebElement getToClickonsaveButton() {
	return toClickonsaveButton;
}


	//BussinessLogic
	public void supplier(WebDriver driver,String companyname, String city,String province,String phonenumber) {
		toclickonSupplier.click();
		toclickonPlusButton.click();
		toSelectCompanyName.sendKeys(companyname);
		selectbyvisibletext(toSelectProvinceDropdown,province);
		selectbyvisibletext(toSelectcity,city);
		
		PhoneNumberTextField.sendKeys(phonenumber);
		toClickonsaveButton.click();
		
		
		
		
	}

    
	
		

	}


