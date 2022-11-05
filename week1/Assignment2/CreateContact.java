package week1.Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		/*
		 Assignment:2

			Open the browser
			Load the URL
			Maximize the browser
			Enter UserName
			Enter Password
			Click Login
			Click CRM/SFA
			Click Contacts Tab
			Click Create Contact
			Type First Name
			Type Last Name
			Click Create Contact Button
			Print the first name and browser title 
			Close the browser
         */
		WebDriverManager.chromedriver().setup();
		// to launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		//return type of get method: void -> null
		driver.get("http://leaftaps.com/opentaps/control/main");
				
		//how to maximize the screen
		driver.manage().window().maximize();
				
		//syntax wait -important code
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Parent to Child xPath
		driver.findElement(By.xpath("//p[@class='top']/input[@id='username']")).sendKeys("Democsr2");
		
		//ElderCousin to YoungerCousin xPath
		driver.findElement(By.xpath("//label[text()='Username']/following::input[@name='PASSWORD']")).sendKeys("crmsfa");
		
		//grandParent to grandChild xPath
		driver.findElement(By.xpath("//form[@id='login']//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();		
	    driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	    driver.findElement(By.xpath("  //a[text()='Create Contact']")).click();

	    driver.findElement(By.xpath(" //div[@class='fieldgroup']//input[@name='firstName']")).sendKeys("Anju");
	    driver.findElement(By.xpath("//div[@class='fieldgroup']//input[@name='lastName']")).sendKeys("Sree");
	   
	     driver.findElement(By.xpath("//input[@value ='Create Contact'] ")).click();
	    
	     String firstname  =driver.findElement(By.xpath("//span[@id='viewContact_firstName_sp']")).getText();
	     System.out.println(firstname);
	     System.out.println(driver.getTitle());
		
	}

}
