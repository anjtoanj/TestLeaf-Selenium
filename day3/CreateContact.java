package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * //Pseudo Code
		 * 
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 * 
		 * 2. Enter UserName and Password Using Id Locator
		 * 
		 * 3. Click on Login Button using Class Locator
		 * 
		 * 4. Click on CRM/SFA Link
		 * 
		 * 5. Click on contacts Button
		 * 
		 * 6. Click on Create Contact
		 *  
		 * 7. Enter FirstName Field Using id Locator
		 * 
		 * 8. Enter LastName Field Using id Locator
		 * 
		 * 9. Enter FirstName(Local) Field Using id Locator
		 * 
		 * 10. Enter LastName(Local) Field Using id Locator
		 * 
		 * 11. Enter Department Field Using any Locator of Your Choice
		 * 
		 * 12. Enter Description Field Using any Locator of your choice 
		 * 
		 * 13. Enter your email in the E-mail address Field using the locator of your choice
		 * 
		 * 14. Select State/Province as NewYork Using Visible Text
		 * 
		 * 15. Click on Create Contact
		 * 
		 * 16. Click on edit button 
		 * 
		 * 17. Clear the Description Field using .clear
		 * 
		 * 18. Fill ImportantNote Field with Any text
		 * 
		 * 19. Click on update button using Xpath locator
		 * 
		 * 20. Get the Title of Resulting Page.
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
	    driver.findElement(By.xpath("//div[@class='fieldgroup']//input[@name='firstNameLocal']")).sendKeys("Anju");
	    driver.findElement(By.xpath("//div[@class='fieldgroup']//input[@name='lastNameLocal']")).sendKeys("Sree");
	    driver.findElement(By.xpath("//div[@class='fieldgroup']//input[@name='departmentName']")).sendKeys("Selenium"); 
	    driver.findElement(By.xpath("//div[@class='fieldgroup']//textarea")).sendKeys("Selenium Assignment");
	    
	    // Phone number=> Country code, Area code, Phone number
	    driver.findElement(By.xpath("(//input[@name ='primaryPhoneCountryCode'])[4]")).sendKeys("00");
	    driver.findElement(By.xpath("(//input[@name ='primaryPhoneAreaCode'])[4]")).sendKeys("64");
	    driver.findElement(By.xpath("(//input[@name ='primaryPhoneNumber'])[4]")).sendKeys("2234567890");//have to check here
	    driver.findElement(By.xpath("//div[@class='fieldgroup']//input[@name='primaryEmail']")).sendKeys("anju1.TestLeaf@gmail.com");
	    driver.findElement(By.xpath("//div[@class='fieldgroup']//select[@name='generalStateProvinceGeoId']")).sendKeys("New Zealand");
	    driver.findElement(By.xpath("//input[@value ='Create Contact'] ")).click();
	    
	    driver.findElement(By.xpath("//a[text()='Edit']")).click();
	    driver.findElement(By.xpath("//form[@id='updateContactForm']//textarea")).clear();
	    driver.findElement(By.xpath("(//form[@id='updateContactForm']//textarea)[2]")).sendKeys("Important Notice");
	    driver.findElement(By.xpath("//input[@value='Update'] ")).click();
	    	    
	    System.out.println(driver.getTitle());
		
	}

}
