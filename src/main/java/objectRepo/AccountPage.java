package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.crm.genericUtils.WebdriverUtils;

public class AccountPage extends WebdriverUtils
{
	@FindBy(xpath="//span[text()='Accounts']")
	private WebElement toClickAccount;
	
	@FindBy(xpath="//i[@class='fas fa-fw fa-plus']")
	private WebElement toClickOnPlusButton;
	
	@FindBy(xpath="//select[@name='empid']")
	private WebElement toClickOnSelectEmployeeDropDown;
	
	@FindBy(xpath="//form[@action='us_transac.php?action=add']/descendant::input[@placeholder='Username']")
	private WebElement UsernameTextfeild;
	
	@FindBy(xpath="//form[@action='us_transac.php?action=add']/descendant::input[@placeholder='Password']")
	private WebElement PassWordTextField;
	
	@FindBy(xpath="//div[@id='supplierModal']/descendant::button[@type='submit']")
	private WebElement ToClickOnSaveButton;
	
	@FindBy(xpath="//span[text()='Prince Ly Cesar']")
	private WebElement ToClickOnPrinceLyCesar;
	
	@FindBy(xpath="//div[@aria-labelledby='userDropdown']/descendant::a[@href='#']")
	private WebElement ToClickOnLogout;
	
	@FindBy(xpath="//div[@aria-modal=\"true\"]/descendant::a")
	private WebElement ToClickOnLogoutPopup;
	
	//Initilization
	
	public AccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization

	public WebElement getToClickAccount() {
		return toClickAccount;
	}

	public WebElement getToClickOnPlusButton() {
		return toClickOnPlusButton;
	}

	public WebElement getToClickOnSelectEmployeeDropDown() {
		return toClickOnSelectEmployeeDropDown;
	}

	public WebElement getUsernameTextfeild() {
		return UsernameTextfeild;
	}

	public WebElement getPassWordTextField() {
		return PassWordTextField;
	}

	public WebElement getToClickOnSaveButton() {
		return ToClickOnSaveButton;
	}

	public WebElement getToClickOnPrinceLyCesar() {
		return ToClickOnPrinceLyCesar;
	}

	public WebElement getToClickOnLogout() {
		return ToClickOnLogout;
	}

	public WebElement getToClickOnLogoutPopup() {
		return ToClickOnLogoutPopup;
	}
	
	//business logic
	public void ToCreateEmployeeAccounct(String EmployeeName,String USERNAME,String PASSWORD)
	{
		
		toClickAccount.click();
		toClickOnPlusButton.click();
		selectbyvisibletext(toClickOnSelectEmployeeDropDown,EmployeeName);
		UsernameTextfeild.sendKeys(USERNAME);
		PassWordTextField.sendKeys(PASSWORD);
		ToClickOnSaveButton.click();
		ToClickOnPrinceLyCesar.click();
		ToClickOnLogout.click();
		ToClickOnLogoutPopup.click();
	}
}
	
	
	
	
	
	
	

	

