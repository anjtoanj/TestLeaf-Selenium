package week3.day4.ClassroomAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		
		// DONE yayyy ---:D---
		
//		        1)Go to erial (https://erail.in/)
//			    2)Enter from as MS and press enter
//			    3)In Destination type cape and press enter
//			    4)Uncheck sort date   
//			    5)Print the train names

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(30);
		WebElement frmStation = driver.findElement(By.id("txtStationFrom"));
		frmStation.clear();
		frmStation.sendKeys("MS", Keys.ENTER);//2)Enter from as MS and press enter
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("Cape", Keys.ENTER);//3)In Destination type cape and press enter
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();//4)Uncheck sort date   
		driver.findElement(By.id("buttonFromTo")).click();
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//th"));

		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr"));
	//	System.out.println("No.of rows in the table : " +rows.size());

		String text = null;
	    List<WebElement> col = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr//td"));
	//System.out.println("No.of columns in the table : " +col.size());	
	
	for(int i=2;i<=rows.size();i++) {
		try {
			//System.out.println(col.get(i).getText());	
			text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]//td["+2+"]")).getText();
			
		} catch (Exception e) {
			System.out.println(" blank ");
		}	
		System.out.println(text);
	    }		
	   
	//driver.close();
	}	
}	
