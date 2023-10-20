package LocatorDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorDemo5_XpathDemo 
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//email id
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@gmail.com");
		
		//password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test123");
		
		//button
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//Warning
		String text=driver.findElement(By.xpath("//div[contains(@class,'alert')]")).getText();
		System.out.println(text);
		
		

	}

}
