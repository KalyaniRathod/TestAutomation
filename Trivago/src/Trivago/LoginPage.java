package Trivago;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.trivago.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement login=driver.findElement(By.xpath("//span[text()='Log in']"));
		login.click();
		driver.get("https://auth.trivago.com/en-US");
		WebElement loginID=driver.findElement(By.xpath("//input[@name='email']"));
		loginID.sendKeys("rathodkalyani@gmail.com");
		WebElement next=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		next.click();
		driver.get("https://auth.trivago.com/en-US/register");
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("Ayansh@123");
		WebElement newAcc=driver.findElement(By.xpath("//button[text()='Create account']"));
		newAcc.click();
		
	}

}
