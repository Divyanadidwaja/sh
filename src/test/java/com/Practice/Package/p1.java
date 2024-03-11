package com.Practice.Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 
{
	public static void main(String [] args) throws InterruptedException
	{
		String MonthAndYear="June 2024";
		int date=26;
	WebDriver  driver=new  ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.makemytrip.com/");
	WebElement frame=driver.findElement(By.xpath("//iframe[@title='notification-frame-~10cb5088a']"));
	driver.switchTo().frame(frame);
	driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
	driver.findElement(By.xpath("//a[@href='https://www.makemytrip.com/flights/']")).click();
	driver.findElement(By.xpath("//span[text()='From']")).click();
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("new delhi");
	driver.findElement(By.xpath("//span[text()='To']")).click();
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Bangalore");
	driver.findElement(By.xpath("//span[text()='Departure']")).click();
	Thread.sleep(3000);
	for(;;)
		try {
	 driver.findElement(By.xpath("//div[text()='"+MonthAndYear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
	break;
		}
	catch(Exception e)
	{
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	}
	
}
}
