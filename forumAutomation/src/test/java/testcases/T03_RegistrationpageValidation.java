package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.browserEngine;
import utilities.testData;

public class T03_RegistrationpageValidation {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public static void openBrowser() {
		
		// loading the browser
		driver=browserEngine.browserConfig();
		   
		
	}
	
	@Test
	public static void registrationpage() {
		
		// loading page
		driver.get(testData.RegistrationpageURL);
		
		// validating the registration page
		
		String registrationactualtitle=driver.getTitle();
		
		AssertJUnit.assertEquals(registrationactualtitle, testData.RegistrationexpectedTitle);
		
		// doing registration
		
		driver.findElement(By.name("fname")).sendKeys(testData.RegistrationFNAME);
		driver.findElement(By.name("lname")).sendKeys(testData.RegistrationLNAME);
		driver.findElement(By.name("email")).sendKeys(testData.RegistrationEMAIL);
		driver.findElement(By.name("password")).sendKeys(testData.RegistrationPW);
		driver.findElement(By.name("phone")).sendKeys(testData.RegistrationPH);
		
		new Select(driver.findElement(By.name("language"))).selectByVisibleText("English");
		
		new Select(driver.findElement(By.name("titles"))).selectByIndex(1);
				
		new Select(driver.findElement(By.name("course"))).selectByVisibleText("Load Runner");
			
		driver.findElements(By.name("gender")).get(1).click();
				
		driver.findElement(By.xpath("//*[@id='home']/div/div[1]/div[6]/input")).click();
		driver.findElement(By.xpath("//*[@id='home']/div/div[2]/input")).click();
		
	}
	

	@AfterMethod
	public static void tearDown() {
		
		// close the browser
		
		driver.quit();
		
		
	}

}
