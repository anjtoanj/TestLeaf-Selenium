package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import base.BaseClass;

public class LoginPage extends BaseClass{
	

	 
	public LoginPage(ChromeDriver driver){
		this.driver = driver;
	}
	
	public LoginPage enterUsername(String username) {
	   driver.findElement(By.id("username")).sendKeys(username);
	   return this;
	}
	
	public LoginPage enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	public WelcomePage clickSubmit() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
	
}


