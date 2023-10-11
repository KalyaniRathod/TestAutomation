package Trivago;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.trivago.com/");
      Thread.sleep(2000);
     // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
      
      WebElement destination=driver.findElement(By.xpath("//input[@type='search']"));
      destination.sendKeys("goa");
      Thread.sleep(2000);
      WebElement goa=driver.findElement(By.xpath("//span[text()='Region · India']"));
      goa.click();
      driver.get("https://www.trivago.com/#");
      Thread.sleep(2000);
//      WebElement date=driver.findElement(By.xpath("//span[text()='Select dates']"));
//      date.click();
      
      //driver.get("https://www.trivago.com/#overlay-calendar");
//      try {
//          driver.get("https://www.trivago.com/#");
//
//          // Adds the cookie into current browser context
//          driver.manage().addCookie(new Cookie("ok", "click"));
//
//          // Get cookie details with named cookie 'foo'
//          Cookie cookie1 = driver.manage().getCookieNamed("ok");
//          System.out.println(cookie1);
//      } finally {
//          
//      }
      WebElement selectdate=driver.findElement(By.xpath("//time[@datetime=\'2023-10-30\']"));
      selectdate.click();
      Thread.sleep(3000);
      WebElement clickdate=driver.findElement(By.xpath("//time[@datetime=\'2023-12-30\']"));
      clickdate.click();
      Thread.sleep(2000);
      WebElement guest=driver.findElement(By.xpath("//button[text()='Apply']"));
      guest.click();
//	
	
	
	}

}
