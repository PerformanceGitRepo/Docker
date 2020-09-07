package docker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LaunchChrome {
	@Test
	public static void main() throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
	    opt.setExperimentalOption("useAutomationExtension", false);
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver   driver = new ChromeDriver(opt);
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Vishnu");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("2-292");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Kochin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		driver.close();
		
	}
}
