package com.Practice.Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) 
	{
		String MonthAndYear="March 2024";
		int date=24;
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://www.goibibo.com/");
    driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
    driver.findElement(By.xpath("//span[text()='Departure']")).click();
    for(;;)
    {
    	try
    	{
    		 driver.findElement(By.xpath("//div[text()='"+MonthAndYear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
    			break;
    	}
    
    
  catch(Exception e)
  {
	  driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
  }
    }
	
	 driver.findElement(By.xpath("//span[text()='Done']")).click();
}
}

