package com.Practice.Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice1 
{
	public static void main(String[] args) throws InterruptedException
	{
		String MonthAndYear="March 2024";
		int date=26;
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://www.makemytrip.com/");
	    Thread.sleep(2000);

	WebElement frame = driver.findElement(By.xpath("//iframe[@title='notification-frame-~10cb5088a']"));
	
	driver.switchTo().frame(frame);
	driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
	
	 //   Actions action=new Actions(driver);
	 //   action.doubleClick().click().perform();
	 //   action.moveByOffset(50, 50).click().perform();
	 //   driver.navigate().refresh();
	    
	   // WebElement  frame = driver.findElement(By.id(""));	
	 //   driver.switchTo().frame(frame)
	    driver.findElement(By.xpath("//a[@class='headerIcons makeFlex hrtlCenter column active']")).click();
	    driver.findElement(By.xpath("//label[@for='fromCity']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("new delhi");
	    driver.findElement(By.xpath("//p[text()='New Delhi, India']")).click();
	    driver.findElement(By.xpath("//span[text()='To']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("bangalore");
	    driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
	    driver.findElement(By.xpath("//span[text()='Departure']")).click();
	     
	   driver.findElement(By.xpath("//div[text()='"+MonthAndYear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
	
	
}
}
