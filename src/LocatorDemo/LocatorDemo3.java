package LocatorDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorDemo3
{

	public static void main(String[] args) 
	{
		//Create a driver session
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Number of text boxes
		List<WebElement> textboxes=driver.findElements(By.tagName("input"));
		System.out.println("Total input boxes are on page: "+textboxes.size());
		System.out.println(textboxes);//[]
				
		//Number of images
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("Total Number of images on the page: "+images.size());
		
		//Number of links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total Number of links on the page: "+links.size());
		
		//get number of links and print the value of attribute href and print text of link
		
		String explink="https://www.youtube.com/c/OrangeHRMInc";
		for(WebElement i:links)
		{
			System.out.println(i.getAttribute("href"));
			System.out.println(i.getText());
			if(i.getAttribute("href").contains(explink))
			{
				i.click();
				break;
			}
		}

	}

}
