package week3.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPhonePrize {
	
//	       1)Go to Amazon website(https://www.amazon.in/)
//		   2)Type Phones
//		   3)Print price of every phone
//		   4)Print the lowest price
	
	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phone",Keys.ENTER);
		 List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		 
		 List<Integer> str = new ArrayList<Integer>();
		 int num = findElements.size();
		 
			System.out.println("Price of every phones ");
		// Set<Integer> unique = new TreeSet<Integer>();
			for(int i=0;i<num;i++) {
				String text = findElements.get(i).getText();
				System.out.println(text);
				String replace = text.replace(",","");
				
				if (replace == "") {break;}				
				str.add(Integer.parseInt(replace));		
			}
			Collections.sort(str);
			System.out.println("Phone with Lowest price: " +str.get(0));
			}		
			
	}


