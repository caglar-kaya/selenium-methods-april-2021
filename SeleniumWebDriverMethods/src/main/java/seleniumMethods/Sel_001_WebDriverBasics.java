package seleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_001_WebDriverBasics {

	public static void main(String[] args) {
		
		// Set property
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.siliconelabs.com/");
		
		String title = driver.getTitle();
		System.out.println("Webpage Title: " + title);
		
		// Verification
		if (title.equals("Silicone Labs")) {
			System.out.println("Title is correct.");
		} else {
			System.out.println("Title is incorrect.");
		}
		
		driver.close(); // or driver.quit();
		System.out.println("Test is completed.");
	}

}
