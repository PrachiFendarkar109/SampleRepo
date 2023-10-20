package LocatorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorDemo1 
{

	public static void main(String[] args) 
	{
		//create Driver session
		WebDriver driver=new FirefoxDriver();
		driver.get("https://automationplayground.com/crm/");
		
		//signIn
		//driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.partialLinkText("In")).click();
		
		//login-Email
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		//password
		driver.findElement(By.id("password")).sendKeys("test123");
		
		//check box
		driver.findElement(By.id("remember")).click();
		
		//submit
		driver.findElement(By.id("submit-id")).click();
		
		//sign Out
		driver.findElement(By.linkText("Sign Out")).click();
		
		//Get the text
		WebElement ele=driver.findElement(By.tagName("p"));
		String text=ele.getText();
		System.out.println(text);

	}

}
