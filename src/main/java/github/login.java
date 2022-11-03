package github;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login
{

	@Test
	public void test()
	{
	    WebDriverManager.chromedriver().setup();  
	    ChromeDriver Driver=new ChromeDriver();
		//sync
	    Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Driver.get("https://mail.google.com/mail/&ogbl");
		Driver.findElement(By.name("identifier")).sendKeys("ramarajukeerthi020@gmail.com");
		Driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
	}
	

}

	
		



