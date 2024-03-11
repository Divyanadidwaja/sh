package com.TestNG.assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert1 
{
	@Test
	public void softassert()
	{
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
SoftAssert sa = new SoftAssert();
String actualTitle=driver.getTitle();
String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, oks & More. Best Offers!";

sa.assertEquals(actualTitle, expectedTitle,"hi");
System.out.println("testcase failed");
sa.assertAll();

	}
}
