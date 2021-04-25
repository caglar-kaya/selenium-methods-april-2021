package seleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_003_WebDriverManager {

	public static void main(String[] args) {

		// System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		String expectedTitle = 
		"Amazon.com: Online Shopping for Electronics,"
		+ " Apparel, Computers, Books, DVDs & more";
		
		if (title.equals(expectedTitle)) {
			System.out.println("Title is correct.");
		} else {
			System.out.println("Title is incorrect.");
		}
		
		driver.close();
	}

}
