package LocatorDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonFooterLinks
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		//get all Footer Links
		List <WebElement> list1=driver.findElements(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//li"));
		System.out.println("Total Links are: "+list1.size());
		
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
		}

	}

}
