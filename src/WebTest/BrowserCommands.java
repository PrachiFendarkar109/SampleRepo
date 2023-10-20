package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommands
{

	public static void main(String[] args) 
	{
		//Create a Driver session
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Get the title
		String title=driver.getTitle();
		System.out.println("Application title is: "+title);
		
		//Get the current url
		String curl=driver.getCurrentUrl();
		System.out.println("Current url is: "+curl);
		
		//Get the Page source
		System.out.println(driver.getPageSource());
		
		//close the browser
		driver.quit();

	}

}
