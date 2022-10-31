package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook1 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		// to launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//syntax wait -important code
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//get does not return anything
		driver.get("http://www.facebook.com");		
	
		//how to maximize the screen
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("Selenium");
		driver.findElement(By.name("lastname")).sendKeys("Selenium");
		driver.findElement(By.name("reg_email__")).sendKeys("00919876546583");
		driver.findElement(By.id("password_step_input")).sendKeys("SeleniumTesting01");
		
		
		
		WebElement select1 = driver.findElement(By.id("day"));
		Select obj1 =new Select(select1);
		obj1.selectByValue("20");
		
		WebElement select2 = driver.findElement(By.id("month"));
		Select obj2 =new Select(select2);
		obj2.selectByVisibleText("Aug");
		
		WebElement select3 = driver.findElement(By.id("year"));
		Select obj3 =new Select(select3);
		obj3.selectByIndex(19);
		
		driver.findElement(By.name("sex")).click();
	}
}
	    