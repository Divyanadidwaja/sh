import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class divya {

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("samsung mobile");
	driver.findElement(By.xpath("(//span[text()='samsung mobiles'])[4]")).click();
	driver.findElement(By.xpath("//span[text()='Samsung Galaxy S24 Ultra 5G AI Smartphone (Titanium Gray, 12GB, 512GB Storage)']")).click();
	Set<String> window = driver.getWindowHandles();
	for(String window2: window)
	{
		driver.switchTo().window(window2);
	}
	driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[1]")).click();
	}

}
