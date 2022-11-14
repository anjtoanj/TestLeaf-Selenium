package week4.day1.ClassroomAssignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassAssignment2 {

	public static void main(String[] args) {
		
//		1) Load the url(https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt) 
//		2)Click Try It button 
//		3)Pass a text in the alert and get the Text and accept the alert 
//		4)Verify your name is printed successfully
		WebDriverManager.chromedriver().setup();
		// to launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		//return type of get method: void -> null
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
						
		//how to maximize the screen
		driver.manage().window().maximize();
				
		//syntax wait -important code
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Goto the Frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Anju");
		alert.accept();

		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text);
		if(text.contains("Anju")) {
			System.out.println("Message contains your name");
		}
		else {System.out.println("Message doesn't have your name");}			
  
	}

}
