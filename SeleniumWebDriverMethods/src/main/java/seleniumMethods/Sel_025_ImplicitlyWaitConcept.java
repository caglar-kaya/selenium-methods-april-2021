package seleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_025_ImplicitlyWaitConcept {

	public static void main(String[] args) throws InterruptedException {

		// Implicitly Wait 
		
		// Implicitly wait tells webdriver to wait if the element is not available
		// immediately and waits till the element is visible in specified time
		
		// If webdriver couldn't find the element in specified time, then
		// NoSuchElementException will be thrown
		
		// Implicitly wait works only with elements
		// Implicitly wait doesn't work with non-element (Ex: Title)
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		System.out.println(driver.getTitle());
		
		// this line gives a chance to webdriver for 45 seconds to find element
		// but if webdriver finds element earlier than 45 seconds, it doesn't wait.
		
		//driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
		// if we used Thread Sleep, We would have to wait for all 45 seconds.
		
		//Thread.sleep(45000);
		
		driver.findElement(By.id("at-cv-lightbox-close")).click();
		
		driver.close();
	}

}
