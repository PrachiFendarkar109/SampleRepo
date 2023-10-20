package LocatorDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorDemo6_XpathOperator_Indexing 
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		//Firstname-------Using AND operator
		driver.findElement(By.xpath("//input[@class='form-control' and @placeholder='First Name']")).sendKeys("Kavita");	
		
		//Lastname-------Using OR operator
		driver.findElement(By.xpath("//input[@placeholder='Last Name' or @name='lastname']")).sendKeys("Mane");
		
		//email------indexing
		driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("test2408@gmail.com");
		
		//telephone with position()
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=4]")).sendKeys("9898512280");
		
		//password
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=5]")).sendKeys("test123");
		
		//confirm password
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=6]")).sendKeys("test123");
		
		//yes radio button
		driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
		
		//checkbox
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		//continue
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		

	}

}
