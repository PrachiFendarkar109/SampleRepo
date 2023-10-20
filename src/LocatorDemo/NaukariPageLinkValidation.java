package LocatorDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaukariPageLinkValidation 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/companies-hiring-in-india?src=gnbCompanies_homepage_srch");
		
		//Maximize the Screen
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total links are on page: "+links.size());
		
		String explink="https://www.naukri.com/remote-jobs?src=gnbjobs_homepage_srch";
		for(WebElement i:links)
		{
			System.out.println(i.getAttribute("href"));
			c
			try {
			if(i.getAttribute("href").contains(explink))
			{
				System.out.println("Link Found!.....Test pass");
				//i.click();
				break;
			}}catch(NullPointerException e)
			{
				System.out.println("Attribute href is null");
			}
			
		}

	}

}
