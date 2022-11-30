package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadDatafrmExcel;

public class BaseClass {
	 /// DONE ----ASSIGNMENT DONE ---YAYYY!!
//	TestNg Assignment
//	============
//
//	 TestNg DataProvider Assignment 
//	HAPPY LEARNING🤝
//
//	. Dynamic data parametrization
//	           *Apply  for all the leaftaps testcases , wherever applicable
//	    - Create new excel document for the testcases that require the multiple data to operate on.
//	    - Implement the Data parametrization for all the required testcases through the DataProvider class to read the data from the excel sheet
//
//	==================================================================
//	Apply all learning in the Service now application
	
	public ChromeDriver driver;
	public String ExcelFilename;
	
	@DataProvider(name ="fetch")
	public String[][] sendData() throws IOException{
		// getting data from excel-> array to pass the values
		String [][]data = ReadDatafrmExcel.readData(ExcelFilename);
		return data;
		
	}
	
    @BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


	}
    @AfterMethod
    public void postCondition() {
    	driver.close();
    }
}
