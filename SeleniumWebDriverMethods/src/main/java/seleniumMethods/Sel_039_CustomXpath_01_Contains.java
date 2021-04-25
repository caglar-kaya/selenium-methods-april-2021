package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_039_CustomXpath_01_Contains {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.com");
		
		// //span[@id='nav-link-accountList-nav-line-1']
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		
		// //input[@type='email' and @tabindex='1']
		driver.findElement(By.xpath("//input[@type='email' and @tabindex='1']")).sendKeys("caglar@gmail.com");
		
		// //input[contains(@type, 'submit')]
		driver.findElement(By.xpath("//input[contains(@type, 'submit')]")).click();
		
		// //a[contains(@id, 'createAccountSubmit') and @tabindex='6']
		driver.findElement(By.xpath("//a[contains(@id, 'createAccountSubmit') and @tabindex='6']")).click();
		
		// Dynamic Xpath in HTML
		// <input id="test_123"> // beginning
		// <input id="test_987"> // after refreshing the page
		
		// sample solution for above Dynamic Xpath case :
		// //input[contains(@id, 'test_')] --> contains() concept is used to handle Dynamic Xpath
		
	}

}


















