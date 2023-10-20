package LocatorDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorDemo7_XpathMethods 
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		//for bestsellers link------>text()
		driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]")).click();
		String text1=driver.findElement(By.xpath("//span[@id='zg_banner_text']")).getText();
		System.out.println(text1);
		
		//cart-------->normalize-space()
		driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
		String text2=driver.findElement(By.xpath("(//h2)[1]")).getText();
		System.out.println(text2);
		
		//search box------contains()
		driver.findElement(By.xpath("//input[contains(@id,'searchtext')]")).sendKeys("Watch",Keys.ENTER);
		
		//search box-----starts-with(prefix)
		driver.findElement(By.xpath("//input[starts-with(@id,'two')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@id,'two')]")).sendKeys("Books",Keys.ENTER);
		

	}

}
