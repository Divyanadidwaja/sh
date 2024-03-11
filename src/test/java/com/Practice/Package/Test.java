package com.Practice.Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://practice.expandtesting.com/tooltips");
	
	WebElement tooltip = driver.findElement(By.xpath("//button[@id='btn1']"));
	Actions action=new Actions(driver);
	action.click(tooltip).perform();
	WebElement ele = driver.findElement(By.xpath("//div[text()='Tooltip on top']"));

	System.out.println(ele.getText());
	
	


	}

}
