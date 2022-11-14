package week4.day1.ClassroomAssignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassroomAssignment1 {

	public static void main(String[] args) throws InterruptedException {
//		 1)Load the url(https://testleaf.herokuapp.com/pages/Alert.html) 
//		2)Click on the prompt box 
//		3)Enter a text in the text box 
//		4)Get the text 
//		5)accept the alert/dismiss
		
		WebDriverManager.chromedriver().setup();
		// to launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		//return type of get method: void -> null
		driver.get("https://testleaf.herokuapp.com/pages/Alert.html");
		
				
		//how to maximize the screen
		driver.manage().window().maximize();
				
		//syntax wait -important code
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
        Alert alert = driver.switchTo().alert();
        
        String text = alert.getText();
        System.out.println(text);
        
        alert.sendKeys("SimpliLearn");
      //  Thread.sleep(3000);
        alert.accept();
       
        String text2 = driver.findElement(By.xpath("//p[@id=\"result1\"]")).getText();
        System.out.println(text2);
        if (text2.contains("SimpliLearn")) {
        	System.out.println("The text contains SimpliLearn");
        }else {System.out.println("Not matched");}
        

	}

}
