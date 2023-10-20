package LocatorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorStrategies
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");

		//NoSuchElementException
		//driver.findElement(By.name("Prachi")).click();
		
		//startegy 3: Identification+Action
		driver.findElement(By.id("APjFqb")).sendKeys("Java",Keys.ENTER);
		
		
		/*
		//startegy 2: Identify+validate+Action
		WebElement ele=driver.findElement(By.id("APjFqb"));
		
		if(ele.isDisplayed() && ele.isEnabled())
		{
			ele.sendKeys("Selenium",Keys.ENTER);
		}
		
		
		/*
		//startegy 1: By Locator
		//searchbox
		//get the address---->By class from selenium
		By searchbox=By.id("APjFqb");
		
		//find the same address
		WebElement ele=driver.findElement(searchbox);
		
		//validate that element
		System.out.println("Is search box is enable? "+ele.isEnabled());
		System.out.println("Is search box display? "+ele.isDisplayed());
		
		//action on element
		ele.sendKeys("Java",Keys.ENTER);
		*/
		
		

	}

}
