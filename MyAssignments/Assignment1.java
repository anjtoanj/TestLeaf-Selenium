package week4.day2.Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		//IN PROGRESS
		// Mousehover over 
		
		
//		1. Launch https://www.snapdeal.com/
//			2. Go to Mens Fashion
//			3. Go to Sports Shoes
//			4. Get the count of the sports shoes
//			5. Click Training shoes
//			6. Sort by Low to High
//			7. Check if the items displayed are sorted correctly
//			8.Select the price range (900-1200)
//			9.Filter with color yellow 
//			10 verify the all applied filters 
//			11. Mouse Hover on first resulting Training shoes
//			12. click QuickView button
//			13. Print the cost and the discount percentage
//			14. Take the snapshot of the shoes.
		WebDriverManager.chromedriver().setup();
		// to launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		//return type of get method: void -> null
		
	//	1. Launch https://www.snapdeal.com/
		driver.get("https://www.snapdeal.com/");
						
		//how to maximize the screen
		driver.manage().window().maximize();
				
		//syntax wait -important code
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		2. Go to Mens Fashion
		Actions actions = new Actions(driver);
		WebElement menFashion = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		Thread.sleep(30);
		actions.moveToElement(menFashion);
		actions.click().build().perform();		
	
//		3. Go to Sports Shoes
		WebElement sportsShoe = driver.findElement(By.xpath("//span[contains(text(),\"Sports Shoes\")]"));
		actions.moveToElement(sportsShoe);
		actions.click().build().perform();
		
//		4. Get the count of the sports shoes
		WebElement countofSportsShoe = driver.findElement(By.xpath("//span[@class='category-name category-count']"));
		System.out.println(countofSportsShoe.getText());
		
//		5. Click Training shoes
		driver.findElement(By.xpath("//div[contains(text(),'Training Shoes')]")).click();
		
//		6. Sort by Low to High
        WebElement dropdown2 = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']"));
		dropdown2.click();
		WebElement priceLowtoHigh = driver.findElement(By.xpath("(//li[@class='search-li'])[1]"));
		System.out.println(priceLowtoHigh.getText());
		priceLowtoHigh.click();
	
		
		
//		7. Check if the items displayed are sorted correctly- // can't solve need help
	    String str1 = null;
		List<WebElement> shoePriceList = driver.findElements(By.xpath("//div[@class='product-discount']/preceding::span[@class='lfloat product-price']"));
	//	System.out.println(shoePriceList.get(1).getText());
		ArrayList<Integer> priceList = new ArrayList<Integer>();
		
		for (int i = 0; i < shoePriceList.size(); i++) {
			 str1 = shoePriceList.get(i).getText(); // price not taken correctly from UI
			 System.out.println(str1);
			 str1 = str1.replace("Rs."," ");
			 str1 = str1.trim();
			 str1 = str1.replace(",","");
			Integer convertedPrice = Integer.parseInt(str1);
			 priceList.add(convertedPrice);
			}
		 System.out.println("Converted from string to Integer");
		 Collections.sort(priceList);
		 System.out.println("Sorted priceList - Low price to High :" +priceList);	
		 
//			8.Select the price range (900-1200)
          WebElement minRange = driver.findElement(By.xpath("//input[@name='fromVal']"));
          minRange.clear();
          minRange.sendKeys("900");
          WebElement maxRange= driver.findElement(By.xpath("//input[@name='toVal']"));
		  maxRange.clear();
		  maxRange.sendKeys("1200");
          driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
          System.out.println("Selected the price range (900-1200)");
         
//		  9.Filter with color yellow
          Thread.sleep(3000);
          driver.findElement(By.xpath("//label[@for='Color_s-Yellow']")).click();
  		  
//            
//			10 verify the all applied filters 
          //check if yellow shoe is displayed
          Thread.sleep(3000);
         boolean selectedYellow = driver.findElement(By.xpath("//label[@for='Color_s-Yellow']")).isSelected();
         System.out.println("Yellow shoe is selected " + selectedYellow);
         
          //check if range is displayed correctly
         String lowRange = driver.findElement(By.xpath("//span[text()='Rs 900']")).getText();
         String highRange = driver.findElement(By.xpath("//span[text()='Rs 1200']")).getText();
         
         if(lowRange =="Rs 700" && highRange == "Rs 1200") {
        	    System.out.println("The price range is between Rs.900 and Rs.1200");
          }else 
           {System.out.println("The price range is not between Rs.900 and Rs.1200");}
        
        
//			11. Mouse Hover on first resulting Training shoes
          Actions actions1 =new Actions(driver);
          WebElement filteredShoe = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
          actions1.moveToElement(filteredShoe).perform();
          
//			12. click QuickView button 
          Thread.sleep(2000);
          driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]")).click();
       
//			13. Print the cost and the discount percentage
         System.out.println(driver.findElement(By.xpath("//div[contains(@class,'product-price pdp-e-i-PAY-l')]")).getText());
         System.out.println(driver.findElement(By.xpath("//span[text()='25% Off']")).getText());
       
          
//			14. Take the snapshot of the shoes.	
         File source = driver.getScreenshotAs(OutputType.FILE);
         File dest = new File("./snaps/firstYellowShoe.png");
         FileUtils.copyFile(source, dest);
         //cannot take the snapshot of alertbox
        
		}

}


