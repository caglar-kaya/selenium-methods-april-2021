package seleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_007_Navigate {

	public static void main(String[] args) throws InterruptedException {

		// Set property
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// GET method
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		
		// NAVIGATE method - back - forward - refresh
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(3000);

		driver.navigate().forward();
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(3000);

		driver.navigate().refresh();
		Thread.sleep(3000);

		driver.close();
		
		
		// Get - WebDriver will wait until the page has fully loaded returning script control
		
		// Navigate - WebDriver will NOT wait the page has fully loaded.
		
		// So Navigate method is faster than Get method. 
		
		// Navigate has back method, forward method, and refresh method.
		
		// Get has NOT any extra method.
	}

}
