package LocatorDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorDemo8_XpathAxies
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		//identify best sellers from search box
		driver.findElement(By.xpath("(//input[@id='twotabsearchtextbox']//following::a[text()='Best Sellers'])[1]")).click();
		
		//identify Hello from search box
		String text=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']//preceding::span [@id='glow-ingress-line1']")).getText();
		System.out.println(text);
		
		
		
		
		
		
	}

}
