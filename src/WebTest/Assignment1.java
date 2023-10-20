package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String actTitle=driver.getTitle();
		System.out.println("Application current title: "+actTitle);
		
		if(actTitle.equals("OrangeHRM"))
		{
			System.out.println("Title matched!.....Test pass");
		}else
		{
			System.out.println("Title is not matched!.....Test fail");
		}
		
		driver.close();

	}

}
