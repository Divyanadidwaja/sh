

package com.crm.crm.genericUtils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtils
{
public void waitForPageLoad(WebDriver driver,int sec)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
}
public void maximizeWindow(WebDriver driver)
{
	driver.manage().window().maximize();
}

public void minimizeWindow(WebDriver driver)
{
	driver.manage().window().minimize();
}
public void Fullscreen(WebDriver driver)
{
	driver.manage().window().fullscreen();
}
public WebDriverWait waituntil(WebDriver driver,int sec)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(sec));
	return wait;
}
public Select SelectClass(WebElement element)
{
	Select sel=new Select(element);
	return sel;
}
public void selectbyvisibletext(WebElement element,String text)
{
	SelectClass(element).selectByVisibleText(text);
}
public void selectbyindex(WebElement element,int index)
{                                                                                           
	SelectClass(element).selectByIndex(index);
}
public void selectbyvalue(WebElement element,String value)
{
	SelectClass(element).selectByValue(value);
}

public Select dropdownobj(WebElement element)

{
	Select sel=new Select(element);
	return null;
	
}

public void waitUntilEleToBeVisible(WebDriver driver,int sec,WebElement element)
{
	waituntil(driver,sec).until(ExpectedConditions.visibilityOf(element));
}
public void waitUntilEleToBeInVisible(WebDriver driver,int sec,WebElement element)
{
	waituntil(driver,sec).until(ExpectedConditions.invisibilityOf(element));
}
public void waitUntilEleToBeClickable(WebDriver driver,int sec,WebElement element)
{
	waituntil(driver,sec).until(ExpectedConditions.elementToBeClickable(element));
}
public Actions actionObj(WebDriver driver)
{
	Actions act=new Actions(driver);
	return act;
	
	
}
public void dragAndDrop(WebDriver driver,WebElement src,WebElement dst)
{
	actionObj(driver).dragAndDrop(src, dst).perform();
}
public void mouseHoverOnEle(WebDriver driver,WebElement element)
{
	actionObj(driver).click(element).perform();
}
public void ContextClick(WebDriver driver,WebElement element)
{
	actionObj(driver).contextClick(element).perform();
}
public void MoveByOffSet(WebDriver driver,WebElement element,int x,int y)
{
	actionObj(driver).moveByOffset(x, y).perform();
}
public void doubleClickAction(WebDriver driver,WebElement element)
{
	actionObj(driver).doubleClick().perform();
}
public void doubleClickaction(WebDriver driver,WebElement element)
{
	actionObj(driver).doubleClick().perform();
}
public void doubleClickaction(WebDriver driver)
{
	actionObj(driver).doubleClick().perform();
}
public void rightClickaction(WebDriver driver)
{
	actionObj(driver).contextClick().perform();
}
public void enterKeyPress(WebDriver driver)
{
	actionObj(driver).sendKeys(Keys.ENTER).perform();
}
public void enterKey() throws AWTException
{
	Robot rb = new Robot();
	rb.keyPress(KeyEvent.VK_ENTER);
}
public void enterRelease() throws AWTException
{
	Robot rb = new Robot();
	rb.keyRelease(KeyEvent.VK_ENTER);
}
public void switchToFrame(WebDriver driver,String nameorid)
{
	driver.switchTo().frame(nameorid);
}
public void switchToFrame(WebDriver driver,WebElement address)
{
	driver.switchTo().frame(address);
}
public void acceptAlert(WebDriver driver)
{
	driver.switchTo().alert().accept();
}
public void cancleAlert(WebDriver driver)
{
	driver.switchTo().alert().dismiss();
}



public void swithToWindow(WebDriver driver,String expWind)
{
	Set<String> window = driver.getWindowHandles();
	Iterator<String> it = window.iterator();
	while(it.hasNext())
	{
		String win = it.next();
		String currentTitle = driver.switchTo().window(win).getTitle();
		if(currentTitle.contains(expWind)) 
		{
			break;
		}
	}
}
public static String getScreenShot(WebDriver driver,String screenShotnames) throws IOException
{
	javaUtils jlib=new javaUtils();
	String FSName = screenShotnames+jlib.getsystemDateInFormat();
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	String path="./screenshot/"+FSName+".png";
	
	File dst=new File(path);
	String destination = dst.getAbsolutePath();
	FileUtils.copyFile(src, dst);
	
	return destination;
}
public void scrollAction(WebDriver driver)
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)","");
}

public void scrollAction(WebDriver driver,WebElement element)	
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	int y=element.getLocation().getY();
	js.executeScript("argument[0].scrollintoView()",element);
}
}


