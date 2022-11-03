package github;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login2 
{
	 @Test
	 @Parameters("Browser")
		public void test(String Browser )
	 {
		 
		 WebDriver Driver=null;
		if(Browser.equals("eges"))
		{
			WebDriverManager.edgedriver().setup();  
			Driver=new EdgeDriver();
		}
		else if(Browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();  
			 Driver=new ChromeDriver();	
		}
		//sync
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Driver.get("https://mail.google.com/mail/&ogbl");
		Driver.findElement(By.name("identifier")).sendKeys("ramarajukeerthi020@gmail.com");
		Driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
		
	 
	 }

		 
}
