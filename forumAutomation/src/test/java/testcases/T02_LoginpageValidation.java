package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.browserEngine;
import utilities.testData;

public class T02_LoginpageValidation {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public static void openBrowser() {
		
		//loading the browser 
		driver=browserEngine.browserConfig();
	
	}
	
	@Test
	public static void loginpage() throws InterruptedException {
		
	//loading the login page
	driver.get(testData.loginpageURL);
	
	//validating the login page 
	
	
	
	String loginpageactualtitle=driver.getTitle();
	
    AssertJUnit.assertEquals(loginpageactualtitle, testData.loginpageexpectedTitle);
	
	//identify the name text box 
	
	Thread.sleep(2000);
	driver.findElement(By.name("email")).sendKeys(testData.loginUID);
	
	//identify the password text box 
	
	driver.findElement(By.name("password")).sendKeys(testData.loginPW);
	
	//identify the sign in button 
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[2]/div[3]/div[2]/button")).click();
	
	//validating the login process
	
	
	
	
	String afterloginactualtitle=driver.getTitle();
	
	AssertJUnit.assertEquals(afterloginactualtitle,testData.afterloginexpectedtitle);
	
	//logout process
	
	driver.findElement(By.xpath("//*[@id='navbar-right']/li/a/span")).click();
	
	driver.findElement(By.xpath("//*[@id='navbar-right']/li/ul/li/a")).click();
		   
		
	}
	
	
	@AfterMethod
	public static void tearDown() {
		
		//closing the browser
		
		driver.quit();
		
	}
	

}
