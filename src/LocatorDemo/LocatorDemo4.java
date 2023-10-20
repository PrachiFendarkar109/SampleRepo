package LocatorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorDemo4
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://automationplayground.com/crm/login.html");
		
		//email id-----tagname with id
		driver.findElement(By.cssSelector("input#email-id")).sendKeys("test@gmail.com");
		
		//password-----tagname with Attribute
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("test123");
		
		//submit button-----tagname with class name
		//driver.findElement(By.cssSelector("button.btn.btn-default.btn-primary")).click();
		
		//tagname with class name and attribute
		driver.findElement(By.cssSelector("button.btn[type='submit']")).click();
		
		

	}

}
