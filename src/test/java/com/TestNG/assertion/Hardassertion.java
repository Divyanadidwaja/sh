package com.TestNG.assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Hardassertion
{
@Test
public void hardassert()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
String actualTitle = driver.getTitle();
System.out.println(actualTitle);
String ExpectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

Assert.assertEquals(actualTitle, ExpectedTitle, "Title is verified");
System.out.println("title is verified");
	
}
}
