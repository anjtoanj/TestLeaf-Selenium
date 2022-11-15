package week4.day1.Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2Alert {

	public static void main(String[] args) throws InterruptedException {
		// https://www.leafground.com/alert.xhtml
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Simple Alert
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		// Confirm Alert
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']")).click();
		String text = alert.getText();
		System.out.println(text);
		alert.dismiss();
		
		//Prompt ALert
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']")).click();
		alert.sendKeys("Hello");
		alert.accept();
		String text2 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(text2);
		if (text2.contains("Hello")) {
			System.out.println("Text entered successfully");
		}
		else {
			System.out.println("Not entered");
		}
		
		//Sweet Alert -Simple Dialog
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt95']")).click();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).click();
   
		//Sweet Alert -Modal Dialog
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).click();
		System.out.println("Closed Sweet Alert Simple Dialog");

		Thread.sleep(2000);
	    driver.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[2]")).click();
	    System.out.println("Closed Sweet Modal Dialog");
	    
	    //Sweet Alert (Confirmation)
	    driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-danger']")).click();
	    driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-c pi pi-times']")).click();
	    System.out.println("Closed Sweet Alert (Confirmation) Dialog");

	    //Minimize and Maximize
	    driver.findElement(By.xpath("(//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-outlined'])[2]")).click();
	   //Maximize the 'Minimize and Maximize' dialog box
	    Thread.sleep(2000);
	     driver.findElement(By.xpath("//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-maximize ui-corner-all']")).click();
	     System.out.println("Maximize the 'Minimize and Maximize' dialog box");
	     //Minimize the 'Minimize and Maximize' dialog box
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-minimize ui-corner-all']")).click();
	     System.out.println("Minimize the 'Minimize and Maximize' dialog box");
	     //Close the 'Minimize and Maximize' dialog box
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();
	     System.out.println("Close the 'Minimize and Maximize' dialog box");
	}

}
