package week4.day1.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1Frames {

	public static void main(String[] args) throws InterruptedException {
		
//Qstn 1: https://chercher.tech/practice/frames-example-selenium-webdriver	
		
		//Nested Frames
		
		//1)Goto Frame1
		//2)enter a txt in topic txtbox
		//3) Goto inner frame
		//4)click on checkbox
		//5)Goto the next frame 
		//6) Get all options from dropdown
		
		WebDriverManager.chromedriver().setup();
		// to launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		//return type of get method: void -> null
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
						
		//how to maximize the screen
		driver.manage().window().maximize();
				
		//syntax wait -important code
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame1);	
    	driver.findElement(By.xpath("//input")).sendKeys("Demo on Frames");
    	
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@id='a']")).click();
		
		driver.switchTo().defaultContent();
				
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(frame2);
		WebElement dropdown = driver.findElement(By.xpath("//select"));
		
		Select sec1 = new Select(dropdown);
		List<WebElement> option3 =sec1.getOptions();
		
		System.out.println(option3.size());
		
		//7) Get all options from dropdown
		for(WebElement each:option3) {
			Thread.sleep(200);
		System.out.println(each.getText());
			
		}
			
    //Qstn 2: https://www.leafground.com/frame.xhtml
		driver.get("https://www.leafground.com/frame.xhtml");
		WebElement f1 = driver.findElement(By.xpath("//iframe[1]"));
		driver.switchTo().frame(f1);
		driver.findElement(By.xpath("//button[@id='Click'][1]")).click();
		driver.switchTo().defaultContent();
		
		
	//Count Frames	
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Count of frames in this page: "+size);// why is the size shown as 3 ? it shud be 4 including the nested frame. check with Subraja

		
   //Inside Nested Frame		
		WebElement f3 = driver.findElement(By.xpath("(//iframe)[3]"));
		driver.switchTo().frame(f3);	
	
		//WebElement f3 = driver.findElement(By.xpath("//iframe[@src='framebutton.xhtml']"));
	    driver.switchTo().frame("frame2"); 
        WebElement btn = driver.findElement(By.xpath("//button[@id='Click']"));
        btn.click();
        
        if(btn.getText()=="Hurray! You Clicked Me.") {
        	System.out.println("Inside Nested Frame- Button is clicked");        	
        }else {System.out.println("Nested Frame- Button not clicked");}
        
	}

}
