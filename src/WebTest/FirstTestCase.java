package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase
{

	public static void main(String[] args)
	{
		//create chrome session
//		WebDriver driver1=new ChromeDriver();
//		driver1.get("https://www.facebook.com");
		
		WebDriver driver2=new FirefoxDriver();
		driver2.get("https://www.google.com");
		
//		WebDriver driver3=new EdgeDriver();
//		driver3.get("https://www.amazon.in");

	}

}
