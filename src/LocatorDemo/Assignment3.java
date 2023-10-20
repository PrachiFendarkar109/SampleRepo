package LocatorDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3 
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//email id
		driver.findElement(By.cssSelector("input.oxd-input[placeholder='Username']")).sendKeys("Admin");
		
		//password
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		
		//login button
		driver.findElement(By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")).click();
		
		//logout button
		driver.findElement(By.cssSelector("p.oxd-userdropdown-name")).click();
		
		//logout
		driver.findElement(By.cssSelector("a[href='/web/index.php/auth/logout']")).click();
		

	}

}
