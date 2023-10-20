package LocatorDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment4
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//email id
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("test@gmail.com");
		
		//password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test123");
		
		//button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Warning
		String text=driver.findElement(By.xpath("//p[contains(@class,'oxd-text oxd-text--p oxd')]")).getText();
		System.out.println(text);

	}

}
