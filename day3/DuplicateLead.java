package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		/*http://leaftaps.com/opentaps/control/main
		 
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Email
		9	Enter Email
		10	Click find leads button
		11	Capture name of First Resulting lead
		12	Click First Resulting lead
		13	Click Duplicate Lead
		14	Verify the title as 'Duplicate Lead'
		15	Confirm the duplicated lead name is same as captured name
		16	Close the browser (Do not log out)
		
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
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	/*	driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TestLeaf");
		
		//ElderCousin to YoungerCousin xPath:
		driver.findElement(By.xpath("//span[contains(text(),'First name')]/following::input")).sendKeys("Anju");
		driver.findElement(By.xpath("//span[text()='Last name']/following::input")).sendKeys("Sreekumar");
		
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_primaryEmail\"]")).sendKeys("anju.TestLeaf@gmail.com");
        driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
    */
        
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
        driver.findElement(By.xpath("//span[text()='Email']")).click();
        driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("anju.TestLeaf@gmail.com");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        
        //11	Capture name of First Resulting lead
		Thread.sleep(3000);
        String firstNameFirstRecord =driver.findElement(By.xpath("(//div[contains(@class,\"firstName\")])[3]/a")).getText();
        System.out.println(firstNameFirstRecord);
        
        //12	Click First Resulting lead
        driver.findElement(By.xpath("(//div[contains(@class,\"partyId\")]/a)[2]")).click();
        driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
        
       // 14	Verify the title as 'Duplicate Lead'
        String pageTitle = driver.getTitle();
        if (pageTitle.contains("Duplicate Lead")) {
        	System.out.println("Page title is Duplicate Lead");        	
        }
        
      //15	Confirm the duplicated lead name is same as captured name
        String duplicatedLead = driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).getAttribute("value");       
        
        if (firstNameFirstRecord.equalsIgnoreCase(duplicatedLead))
        {
        	System.out.println("First Record in the Lead list and Duplicated Record are the same");
        }else {
        	System.out.println("First Record in the Lead list and Duplicated Record are different");
        }
        
      //16	Close the browser (Do not log out)
        driver.close();     
		
	}

}
