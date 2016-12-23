package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
	
	private static WebDriver driver = null;	

	public static void main(String[] args) {
		
	
		
		
		
		
		
		
		//Print a LogIn message on the screen
		System.out.println("Login successfully");
		
		//Find the LogOut element
		driver.findElement(By.xpath(".//[@id='accouny_logout')]/a")).click();
		
		//Print a LogOut message on the screen
		System.out.println("LogOut Successfully");
		
		//Close the driver
		driver.quit();
		
	}
	

}
