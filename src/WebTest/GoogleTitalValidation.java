package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTitalValidation 
{

	public static void main(String[] args) 
	{
		/*
		 Step 1: Open browser with google application.
		 Step 2: Get the current title of the application.
		 Step 3: Validate that current title is matching with expected title: Google
		         as per validation print message.
		 Step 4: Close the browser.
		 */
		
		//Step 1: Open browser with google application.
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com"); //InvalidArgumentException - for wrong URL (For Protocol is missing)you will get this Exception
		
		//Step 2: Get the current title of the application.
		String actTitle=driver.getTitle();
		System.out.println("Application current title: "+actTitle);
		
		/* Step 3: Validate that current title is matching with expected title: Google
        as per validation print message.
		*/
		if(actTitle.equals("Google"))
		{
			System.out.println("Title matched!.....Test pass");
		}else
		{
			System.out.println("Title is not matched!.....Test Fail");
		}
		
		//Step 4: Close the browser.   close() OR quit()
		driver.close();
		//driver.quit();

	}

}
