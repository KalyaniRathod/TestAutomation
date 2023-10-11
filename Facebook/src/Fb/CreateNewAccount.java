package Fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement cnaccount=driver.findElement(By.xpath("//div[@class='_6ltg'][2]"));
		cnaccount.click();
		Thread.sleep(2000);
		
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s= new Select(day);
		
		s.selectByValue("29");
		
		Thread.sleep(2000);
		
		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select s1=new Select(month);
		
		s1.selectByValue("5");

	}

}
