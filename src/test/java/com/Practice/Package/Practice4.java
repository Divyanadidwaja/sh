package com.Practice.Package;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4 {

	public static void main(String[] args)
	{
		
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.epfindia.gov.in/");
List<WebElement> allLinks=driver.findElements(By.xpath("//a"));                                          
System.out.println(allLinks.size());
for(WebElement link:allLinks)
{
	String eachlink=link.getAttribute("href");
	URL url=null;
	int StatusCode=0;
	try
	{
		url=new URL(eachlink);
		HttpURLConnection httpConn=(HttpURLConnection)
		url.openConnection();
		StatusCode=httpConn.getResponseCode();
	//	if(StatusCode>=400)
			if(StatusCode>=400 && eachlink!=null)
		{
			System.out.println(eachlink+"--->"+StatusCode);
		}
		
	}
	catch(Exception e)
	{
		System.out.println(eachlink+"--->"+StatusCode);
	}
	
}
	}

}
