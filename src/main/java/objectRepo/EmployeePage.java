package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.crm.genericUtils.WebdriverUtils;
import com.crm.crm.genericUtils.javaUtils;

public class EmployeePage extends WebdriverUtils
{
	

	@FindBy(xpath ="//span[text()='Employee']")
	private WebElement toClickemployeeModule;
	
	@FindBy(xpath="//i[@class='fas fa-fw fa-plus']")
	private WebElement toClickOnPlusButton;
	
	@FindBy(xpath="//div[@id='employeeModal']/descendant::input[@placeholder='First Name']")
	private WebElement FirstNameTextField;
	
	@FindBy(xpath="//div[@id='employeeModal']/descendant::input[@placeholder='Last Name']")
	private WebElement LastNameTextField;
	
	@FindBy(xpath="//form[@action='emp_transac.php?action=add']/child::div[@class='form-group']/child::select[@name='gender']")
	private WebElement toSelectEmployeeGender;
	

	@FindBy(xpath="//div[@id='employeeModal']/descendant::input[@placeholder='Email']")
	private WebElement EmailTextField;
	
	@FindBy(xpath="//div[@id='employeeModal']/descendant::input[@placeholder='Phone Number']")
	private WebElement PhoneNumberTextField;
	

	
	@FindBy(xpath="//select[@name='jobs']")
	private WebElement ToSelectJobFromDropDown;
	
	@FindBy(xpath="//input[@id='FromDate']")
	private WebElement ToSelectDateFromDropDown;
	
	@FindBy(xpath="//div[@id='employeeModal']/descendant::select[@id='province']")
	private WebElement ToSelectEmployeeProvinceFromDropDown;
	
	@FindBy(xpath="//div[@id='employeeModal']/descendant::select[@id='city']")
	private WebElement ToSelectEmployeeCity;
	
	@FindBy(xpath="//div[@id='employeeModal']/descendant::button[@type='submit']")
	private WebElement ToClickOnSaveButton;
	
	//initilization
	public EmployeePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization

	public WebElement getToClickemployeeModule() {
		return toClickemployeeModule;
	}

	public WebElement getToClickOnPlusButton() {
		return toClickOnPlusButton;
	}

	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}
	public WebElement getToSelectEmployeeGender() {
		return toSelectEmployeeGender;
	}


	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getPhoneNumberTextField() {
		return PhoneNumberTextField;
	}

	public WebElement getToSelectJobFromDropDown() {
		return ToSelectJobFromDropDown;
	}

	public WebElement getToSelectDateFromDropDown() {
		return ToSelectDateFromDropDown;
	}

	public WebElement getToSelectEmployeeProvinceFromDropDown() {
		return ToSelectEmployeeProvinceFromDropDown;
	}

	public WebElement getToSelectEmployeeCity() {
		return ToSelectEmployeeCity;
	}

	public WebElement getToClickOnSaveButton()
	{
		return ToClickOnSaveButton;
	}

	//business logic
	public void ToCreateEmployeeAccount(String Firstname,String Lastname,String job,String Email,
			String PhoneNumber,String Date1,String Province,String city, WebDriver driver,String Female)
	
{
		

	javaUtils j = new javaUtils();
//		CustomerPage c1 = new CustomerPage(driver);
//		c1.getToClickcustomerModule();
		toClickemployeeModule.click();
		toClickOnPlusButton.click();
		FirstNameTextField.sendKeys(Firstname);
		LastNameTextField.sendKeys(Lastname);
		 EmailTextField.sendKeys(Email);
		 PhoneNumberTextField.sendKeys(PhoneNumber+j.getRandomNo());
		 selectbyvisibletext(toSelectEmployeeGender,Female);
		selectbyvisibletext(ToSelectJobFromDropDown,job);
		ToSelectDateFromDropDown.click();
		ToSelectDateFromDropDown.sendKeys(Date1);
		selectbyvisibletext(ToSelectEmployeeProvinceFromDropDown,Province);
		selectbyvisibletext(ToSelectEmployeeCity,city);
		ToClickOnSaveButton.click();
		
		
		
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
