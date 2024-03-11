package objectRepo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.crm.genericUtils.WebdriverUtils;

public class LoginPage extends WebdriverUtils
{
//Declaration
	
	@FindBy(xpath="//input[@name='user']")
	private WebElement usernametextfield;
	
	@FindBy(name="password")
	private WebElement passwordtextfield;
	
	@FindBy(name="btnlogin")
	private WebElement loginbutton;
	
	
	
	
	//Initilization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//Utilization
	
	public WebElement getUsernametextfield() {
		return usernametextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	//Business Logic
	
	public void popupmsg(WebDriver driver)
	{
		
	
		String actualText = driver.switchTo().alert().getText();
		String ExpectedText="Prince Ly Welcome!";
		Assert.assertEquals(actualText, ExpectedText, "hi");
		acceptAlert(driver);
	}
	
	
	public void login(String USERNAME,String PASSWORD,WebDriver driver)
	{
		usernametextfield.sendKeys(USERNAME);
		passwordtextfield.sendKeys(PASSWORD);
		loginbutton.click();
		//acceptAlert(driver);
		
		
	}

	
}
	
	
	

