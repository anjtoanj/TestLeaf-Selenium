package week2.day3;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
        
		WebDriverManager.chromedriver().setup();
		
		// to launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//return type of get method: void -> null
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//how to maximize the screen
		driver.manage().window().maximize();
		
		//syntax wait -important code
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("Democsr2");		
		driver.findElement(By.xpath("//input[@id ='password']")).sendKeys("crmsfa");		
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		String company_name = "Test Leaf";
	    driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys(company_name);
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Anju");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sreekumar");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id ='updateLeadForm_companyName']")).clear();
		
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Test IT");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String updated_company_name =driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		if (updated_company_name.equals(company_name))
		       System.out.println("Company name :not updated");
		else
			   System.out.println("Company name :updated");			
			
		
	}
}