package com.Practice.Package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class ReadTheDataFromPropertyFileTest {

	public static void main(String[] args) throws IOException {
		WebDriver driver=null;
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String BROWSER=pobj.getProperty("browser");
		String URL=pobj.getProperty("url");
		String USERNAME=pobj.getProperty("username");
		String PASSWORD=pobj.getProperty("password");
		if(BROWSER.equalsIgnoreCase("chrome"))
				{
			 driver=new ChromeDriver();
				}
		else
		{
			System.out.println("----------invalied browser");
		}
		driver.manage().window().maximize();
		
		driver.get(URL);
		driver.findElement(By.xpath("//input[@name='user']")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		driver.findElement(By.name("btnlogin")).click();
		
		
	}

	
}
