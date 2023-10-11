package Fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        
        
        WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	    WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
	    email.sendKeys("9689079507");
	    pass.sendKeys("imalone");
	    
	    WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
	     login.click();
//	     
//	     
//	     WebElement frends=driver.findElement(By.xpath("//span[text()='Friends']"));
//	     frends.click();
//	     
//	     
//	     driver.get("https://www.facebook.com/friends");
//	     Thread.sleep(1000);
//	     WebElement birthday=driver.findElement(By.xpath("//span[text()='Birthdays']"));
//	     Thread.sleep(1000);
//	     
//	     birthday.click();
//	
	
	   WebElement group=driver.findElement(By.xpath("//span[text()='Groups']"));
	   group.click();
	   driver.get("https://www.facebook.com/groups/feed/");
	   WebElement yourgroup=driver.findElement(By.xpath("//span[text()='Your groups']"));
	   yourgroup.click();
//	   WebElement group=driver.findElement(By.xpath(""));
//
//	   
//	   WebElement group=driver.findElement(By.xpath(""));
//
//	   
//	   WebElement group=driver.findElement(By.xpath(""));
//
//	   
//	   WebElement group=driver.findElement(By.xpath(""));

	
	
	}

}
