package LocatorDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchScenario 
{

	public static void main(String[] args) 
	{
	 
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		//search box
		driver.findElement(By.name("q")).sendKeys("Java");
		
		//get all options
		List<WebElement>list=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		System.out.println("Total options are: "+list.size());
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
		
		
	}

}
