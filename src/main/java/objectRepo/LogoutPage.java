package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage
{
@FindBy(xpath="//img[@class='img-profile rounded-circle']")
private WebElement toClickOnlogoutImage;

@FindBy(xpath="//i[@class='fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400']")
private WebElement toClickOnlogoutButton;


@FindBy(xpath="//div[@id='logoutModal' and @class='modal fade show']/descendant::div[@class='modal-footer']/child::a[text()='Logout']")
private WebElement toClickOnlogoutPopup;

@FindBy(xpath="//div[@id='logoutModal' and @class='modal fade show']/descendant::div[text()='Prince Ly are you sure do you want to logout?']")
private WebElement toGetLogOutPopUpMsg;


//initilization

public LogoutPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

//utilization



//businesslogic

public WebElement getToClickOnlogoutImage() {
	return toClickOnlogoutImage;
}

public WebElement getToClickOnlogoutButton() {
	return toClickOnlogoutButton;
}

public WebElement getToClickOnlogoutPopup() {
	return toClickOnlogoutPopup;
}

public WebElement getToGetLogOutPopUpMsg() {
	return toGetLogOutPopUpMsg;
}

public void toLogoutApplication()
{
	toClickOnlogoutImage.click();
	toClickOnlogoutButton.click();
	//toClickOnlogoutButton.click();
}
	public void toGetLogOutPopUpMsg()
	{
		String actualLogoutText1=toGetLogOutPopUpMsg.getText();
		String expectedLogoutText1="Prince Ly are you sure do you want to logout?";
		if(expectedLogoutText1.equals(actualLogoutText1)){
		System.out.println("Test case is pass");
		}
		else {
		System.out.println("Test case is failed");
		}
		//logout1.click();
		toClickOnlogoutPopup.click();
}




}
