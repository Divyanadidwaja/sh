package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Transactionpage
{
	
	//decleartion
@FindBy(xpath="//span[text()='Transaction']")
private WebElement toclickontransaction;



@FindBy(xpath="//input[@class='form-control form-control-sm']")
private WebElement toclickonformcontrol;

@FindBy(xpath="//img[@class='img-profile rounded-circle']")
private WebElement toclickonroundedcircle;

@FindBy(xpath="//div[@id='logoutModal' and @class='modal fade show']"
		+ "/descendant::div[@class='modal-footer']/child::a[text()='Logout']")
private WebElement toclickonlogout;

@FindBy(xpath="//div[@id='logoutModal' and @class='modal fade show']/"
		+ "descendant::div[text()='Prince Ly are you sure do you want to logout?']")
private WebElement toClickonlogoutpopup;

//initilization

public void tochecktransaction(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
//utilization
public WebElement getToclickontransaction() {
	return toclickontransaction;
}

public WebElement getToclickonformcontrol() {
	return toclickonformcontrol;
}

public WebElement getToclickonroundedcircle() {
	return toclickonroundedcircle;
}

public WebElement getToclickonlogout() {
	return toclickonlogout;
}

public WebElement getToClickonlogoutpopup() {
	return toClickonlogoutpopup;
}

//utilization

public void TransactionCustomer(String Transaction)
{
	toclickontransaction.click();
	toclickonformcontrol.sendKeys(Transaction);
	toclickonroundedcircle.click();
	toclickonlogout.click();
	toClickonlogoutpopup.click();
	
	
}



}
