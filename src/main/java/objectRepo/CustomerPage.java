package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage 
{
	//decelartion
	
	
		@FindBy(xpath ="//span[text()='Customer']")
		private WebElement toClickcustomerModule;
		
		@FindBy(xpath="//i[@class='fas fa-fw fa-plus']")
		private WebElement toClickPlusToAddCustomer;
		
		
	@FindBy(xpath="//div[@id='customerModal']/descendant::input[@placeholder='First Name']")
	private WebElement FirstNameTextfield;
	
	@FindBy(xpath="//div[@id='customerModal']/descendant::input[@placeholder='Last Name']")
	private WebElement LastNameTextfield;
	
	@FindBy(xpath="//div[@id='customerModal']/descendant::input[@placeholder='Phone Number']")
	private WebElement PhoneNumberTextfield;
	
	@FindBy(xpath="//div[@id='customerModal']/descendant::button[@type='submit']")
	private WebElement ToClickOnSava;
	
	//Initilization
	public CustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//BusinessLogic
	
	public void ToAddCustomerDetails(String Firstname,String Lastname,String phonenumber)
	{
		
		
		toClickcustomerModule.click();
		toClickPlusToAddCustomer.click();
		FirstNameTextfield.sendKeys(Firstname);
		LastNameTextfield.sendKeys(Lastname);
		PhoneNumberTextfield.sendKeys(phonenumber);
		
		ToClickOnSava.click();
		
		
	}
	
	//utilization
	public WebElement getToClickcustomerModule() {
		return toClickcustomerModule;
	}

	

	public WebElement getToClickPlusToAddCustomer() {
		return toClickPlusToAddCustomer;
	}



	public WebElement getFirstNameTextfield() {
		return FirstNameTextfield;
	}

	

	public WebElement getLastNameTextfield() {
		return LastNameTextfield;
	}


	public WebElement getToClickOnSava() {
		return ToClickOnSava;
	}

	}	//utilization
	
	

