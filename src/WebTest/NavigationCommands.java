package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommands 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Create a Driver session
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println("Application title is: "+driver.getTitle());
		
		//navigate
		driver.navigate().to("https://www.facebook.com");
		
		//selenium static wait
		Thread.sleep(2000);
		//back
		driver.navigate().back();//google
		
		Thread.sleep(2000);
		//Forward
		driver.navigate().forward();//facebook
		
		Thread.sleep(2000);
		//refresh
		driver.navigate().refresh();
		
		
		
		
		

	}

}
