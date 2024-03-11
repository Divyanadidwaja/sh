package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
//decelartion
	@FindBy(xpath ="//span[text()='Customer']")
	private WebElement toClickcustomerModule;
	
	@FindBy(xpath ="//span[text()='Employee']")
	private WebElement toClickemployeeModule;
	
	@FindBy(xpath="//span[text()='Supplier']")
	private WebElement toClickSupplierModule;
	
	@FindBy(xpath="//span[text()='Transaction']")
	private WebElement toClickTransaction;
	
	@FindBy(xpath="//span[text()='Accounts']")
	private WebElement toClickAccount;
	
	@FindBy(xpath="//span[text()='POS']")
	private WebElement toClickPos;
	
	@FindBy(xpath="//span[text()='Inventory']")
	private WebElement toClickInventory;
	
	@FindBy(xpath="//span[text()='Product']")
	private WebElement toClickProductModule;
	
	@FindBy(xpath="//span[text()='Prince Ly Cesar']")
	private WebElement toClickPrinceLyCesar;
	
	//Initilization
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
		
		public void toClickcustomerModule()
		{
		toClickcustomerModule.click();
		}
		
		public void toClickemployeeModule()
		{
		
		toClickemployeeModule.click();
		}
		public void toClickSupplierModule()
		{
		toClickSupplierModule.click();
		}
		public void toClickTransaction()
		{
		toClickTransaction.click();
		}
		
		public void toClickAccount()
		{
		toClickAccount.click();
		}
		public void toClickInventory()
		{
		toClickInventory.click();
		}
		public void toClickProductModule()
		{
		toClickProductModule.click();
		}
		public void toClickPrinceLyCesar()
		{
		toClickPrinceLyCesar.click();
		}
	
		
		
	

	//utilization
	
	public WebElement getToClickcustomerModule() {
		return toClickcustomerModule;
	}

	public WebElement getToClickemployeeModule() {
		return toClickemployeeModule;
	}

	public WebElement getToClickSupplierModule() {
		return toClickSupplierModule;
	}

	public WebElement getToClickTransaction() {
		return toClickTransaction;
	}

	public WebElement getToClickAccount() {
		return toClickAccount;
	}

	public WebElement getToClickPos() {
		return toClickPos;
	}

	public WebElement getToClickInventory() {
		return toClickInventory;
	}

	public WebElement getToClickProductModule() {
		return toClickProductModule;
	}

	public WebElement getToClickPrinceLyCesar() {
		return toClickPrinceLyCesar;
	}
	
	

}
