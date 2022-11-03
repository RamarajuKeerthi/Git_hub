package github;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginFacebook
{
	@Test
	@Parameters({"Username","Password","browser"})
	public void facebooklogin_paramaeter(String Username,String Password,String browser)
	{
		WebDriver driver=null;
		if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();  
	      driver=new ChromeDriver();
		}
		else if(browser.equals("edgs"))
		{
			WebDriverManager.edgedriver().setup();  
		      driver=new EdgeDriver();	
		}
		//sync
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		WebElement ram =driver.findElement(By.name("q"));
		ram.sendKeys("facebook login");
		ram.submit();
		driver.findElement(By.xpath("//*[@class='LC20lb MBeuO DKV0Md']")).click();
		driver.findElement(By.name("email")).sendKeys(Username);
		driver.findElement(By.name("pass")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
		
	}
}
