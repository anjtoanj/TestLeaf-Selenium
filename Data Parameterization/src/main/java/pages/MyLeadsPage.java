package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyLeadsPage extends BaseClass {
	public MyLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}
	public CreateLead createLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLead(driver); 
	}
	
	
}
