package com.TestNG;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.crm.genericUtils.WebdriverUtils;

@Listeners(com.crm.crm.genericUtils.listenerUtils.class)
public class SampleTest 
{
	@Test
public void testscript1() throws IOException

{
		
		WebDriver driver=new ChromeDriver();
		WebdriverUtils.getScreenShot(driver, "ScreenShot");
		driver.get("https://www.flipkart.com/");
	System.out.println("testscript one");
}


}
