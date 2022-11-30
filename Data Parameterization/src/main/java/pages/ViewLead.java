package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewLead extends BaseClass{
	
	public ViewLead(ChromeDriver driver) {
		this.driver =driver;
	}
	public ViewLead verifyCreateLead() {
		String text = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(text);
		if(text.contains(text)) {
			System.out.println("Lead created successfully");
		}else
		{ System.out.println("Lead not created"); }
		return this;
	}

}
