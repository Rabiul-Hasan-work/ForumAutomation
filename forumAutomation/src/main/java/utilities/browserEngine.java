package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserEngine {
	
	
public static WebDriver driver;
	
	public static WebDriver browserConfig()
	
	{
		
       System.setProperty("webdriver.chrome.driver","C:\\Java projects\\MavenSelenium\\forumAutomation\\drivers\\chromedriver.exe");
		
	   driver= new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver","C:\DPSummer\June26\forumAutomation\drivers\geckodriver.exe");
		 
		//driver=new FirefoxDriver();
			
		System.out.println("Chrome Browser opened");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
		
	}
}