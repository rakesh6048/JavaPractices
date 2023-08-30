package Latest_Practice_TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUPAndDown {

	

	
	public static void main(String[] args) throws InterruptedException {
		
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.apple.com/in/");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  Thread.sleep(3000);
	  Actions act = new Actions(driver); 
	 act.scrollByAmount(0, 2000).perform();
	 
	 
	}

}
