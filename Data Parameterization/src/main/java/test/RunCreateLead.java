package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;


import base.BaseClass;
import pages.CreateLead;
import pages.LoginPage;

public class RunCreateLead extends BaseClass {
	
	 @BeforeTest
	 public void sendExcelData() {
		 ExcelFilename ="CreateLead";
	 }
	 
	@Test(dataProvider="fetch")
	public void runCreateLead(String username, String password, String companyname, String firstname, String lastname,String phonenumber) {
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(username)
		.enterPassword(password)
		.clickSubmit()
		.clickSRMSFA()
		.clickLeadsSubmit()
		.createLead()
		.enterCompanyName(companyname)
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.enterPhoneNumber(lastname);  
		
	}
	
}
