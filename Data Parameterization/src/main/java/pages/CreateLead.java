package pages;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadDatafrmExcel;

public class CreateLead extends BaseClass {
	
 
	public CreateLead(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	public CreateLead enterCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		return this;
		}
	
	public CreateLead enterFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		return this;
		}
	
	public CreateLead enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;
		}
	public CreateLead enterPhoneNumber(String phoneNumber) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNumber);
		return this;
	}
	public  ViewLead clickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLead(driver);
	}
	
}