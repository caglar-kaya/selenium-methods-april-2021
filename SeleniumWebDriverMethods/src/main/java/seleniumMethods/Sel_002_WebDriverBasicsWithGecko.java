package seleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_002_WebDriverBasicsWithGecko {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
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
