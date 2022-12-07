package week3.day4.Assignments;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableChitorgarh {

	
	public static void main(String[] args) {
		
//DONE --yayyy!!		
		// Chittorgarh:
		// 1. Launch the URL https://www.chittorgarh.com/
		//2. Click on stock market
		//3. Click on NSE bulk Deals
		//4. Get all the Security names
		//5. Ensure whether there are duplicate Security names
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		// 1. Launch the URL https://www.chittorgarh.com/
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//2. Click on stock market
		driver.findElement(By.xpath("//a[text()=\"STOCK MARKET \"]")).click();
		
		//3. Click on NSE bulk Deals
		driver.findElement(By.linkText("NSE Bulk Deals")).click();
		
		//4. Get all the Security names
		 driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//th"));
        
		List<WebElement> Rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr"));
		int rowCount = Rows.size();
		String [] SecurityNames = new String[rowCount];
		
	    for(int i=1;i<rowCount;i++) {
	    	String text = driver.findElement(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr["+i+"]//td[3]")).getText();
		 //   System.out.println(text);rowCount
		    SecurityNames[i-1]=text;
		    
		//    System.out.println(SecurityNames[i-1]);
	    }
	     int length = SecurityNames.length;

	// create HashSet object
       HashSet<String> hs = new HashSet<String>();
	 	   for(int i=0;i<length;i++) {	    		    
		    for(int j=i+1;j<length;j++) {
		    	if(SecurityNames[i].equals(SecurityNames[j])) {
		    		 hs.add(SecurityNames[i]);
 		 
		    }
	    }      

	}
	 	  System.out.println(hs);
	 	  driver.quit();
  }
	
	
}	  
