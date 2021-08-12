package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.browserEngine;
import utilities.testData;

public class T01_HomepageValidation {
	
	 public static WebDriver driver;
	 
	 @BeforeMethod
	 
	 public static void openBrowser()
	 
	 {
	  
		//loading the browser 
		driver=browserEngine.browserConfig();
	 }
	 
	 
	 @Test
	 
	 public static void hopmepage()
	 
	 {
	  // Load the application under Test 
	  
	  driver.get(testData.homepageURL);
	  
	  // validation the home page
	  
	  String homepageactualTitle=driver.getTitle();
	  
	  AssertJUnit.assertEquals(homepageactualTitle, testData.homepageexpectedTitle);
	  
	 }
	 

	 
	 
	 @AfterMethod
	 
	 public static void tearDonwn()
	 
	 {
	  // close the browser 
	  
	  driver.close();
	 }
	 
	 

}
