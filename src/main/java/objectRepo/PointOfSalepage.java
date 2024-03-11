package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.crm.genericUtils.WebdriverUtils;

public class PointOfSalepage extends WebdriverUtils
{
	@FindBy(xpath="//span[text()='POS']")
	private WebElement toclickonPos;
	
	@FindBy(xpath="//a[text()='Keyboard']")
	private WebElement toSelectProductCategoryInPos;
	
	@FindBy(xpath="//form[@action='pos.php?action=add&id=391']/descendant::input[@class='btn btn-info']")
	private WebElement toSelectProductInPos;
	
	@FindBy(xpath="//h4[text()='Point of Sale']")
	private WebElement toVerifyThatPosPageIsDisplaying;
	
	@FindBy(xpath="//select[@name='customer']")
	private WebElement toSelectCustomerFromDropDown;
	
	@FindBy(xpath="//button[@class='btn btn-block btn-success']")
	private WebElement toClickOnSubmitButtonInPOS;
	
	
	@FindBy(xpath="//input[@class='form-control text-right']")
	private WebElement toClickOnEnterCashInPOS;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-block']")
	private WebElement proceedToPaymentInPos;
	
	//Initialization
	
	public PointOfSalepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getToclickonPos() {
		return toclickonPos;
	}

	//Utilization
	public WebElement getToSelectProductCategoryInPos() {
		return toSelectProductCategoryInPos;
	}

	public WebElement getToSelectProductInPos() {
		return toSelectProductInPos;
	}

	public WebElement getToVerifyThatPosPageIsDisplaying() {
		return toVerifyThatPosPageIsDisplaying;
	}

	public WebElement getToSelectCustomerFromDropDown() {
		return toSelectCustomerFromDropDown;
	}

	public WebElement getToClickOnSubmitButtonInPOS() {
		return toClickOnSubmitButtonInPOS;
	}

	public WebElement getToClickOnEnterCashInPOS() {
		return toClickOnEnterCashInPOS;
	}

	public WebElement getProceedToPaymentInPos() {
		return proceedToPaymentInPos;
	}
	
	//BussinessLogic
	public void pos() {
		toclickonPos.click();
		toSelectProductCategoryInPos.click();
		toSelectProductInPos.click();
		
	}
	
	public void toCheckPosPageIsDisplaying(WebDriver driver,String customerName,String Productcash) {
		String actualText=toVerifyThatPosPageIsDisplaying.getText();
		String expactedText="Point of Sale";
		if(actualText.equalsIgnoreCase(expactedText)) {
			System.out.println("Pos page is displaying");
		}
		else {
			System.out.println("Pos page is not displaying");
		}
		selectbyvisibletext( toSelectCustomerFromDropDown,customerName);
		toClickOnSubmitButtonInPOS.click();
		toClickOnEnterCashInPOS.sendKeys(Productcash);
		proceedToPaymentInPos.click();
		acceptAlert(driver);
	}
	
	
}

