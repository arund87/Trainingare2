package testpack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testclass {
     
	WebDriver driver;
        @Test
	public void wordpressrun() {
	
      driver =new FirefoxDriver();
      driver.getee("https://wordpress.com/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
      driver.findElement(By.xpath("//a[@title='Get Started']")).click();
      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
      driver.quit();
	}

}
