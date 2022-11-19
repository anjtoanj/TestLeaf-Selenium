package week4.day4.Assignment1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseClass {
//	Assignment:1 (Leaftaps Application)
//	=======================
//	1. Create BaseClass with preCondition() and postCondition() with @BeforeMethod and @AfterMethod 
//	2. Move the common code from all the 5 testcases into preCondition() and postCondition()
//	3. Extend the DuplicateLead and MergeLead test cases with BaseClass and execute sequentially and parallely using testng.xml
//	=============================

	 public ChromeDriver driver;
	 
	  @BeforeMethod
	  public void preCondition() {
		   WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("Demosalesmanager");		
			driver.findElement(By.xpath("//input[@id ='password']")).sendKeys("crmsfa");		
			driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();	
	  }

	  @AfterMethod
	  public void postCondition() {
		  driver.close();
		  
	  }	
 
 

  

}
