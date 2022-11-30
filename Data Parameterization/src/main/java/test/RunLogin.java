package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunLogin extends BaseClass {
	 @BeforeTest
	 public void sendExcelData() {
		 ExcelFilename ="Login";
	 }
	 
	@Test(dataProvider="fetch")
	public void runCreateLead(String username, String password) {
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(username)
		.enterPassword(password);   
			
	}
}
