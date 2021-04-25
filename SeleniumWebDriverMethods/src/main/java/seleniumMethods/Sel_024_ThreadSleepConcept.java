package seleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_024_ThreadSleepConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		
		//Thread sleep is not part of the Selenium
		//Thread sleep is a feature of Java.
		//Thread sleep is a static wait.
		//Thread sleep is used to slow down element or thread on a webpage.
		
		Thread.sleep(5000);
		
		System.out.println("\nTitle is : " + driver.getTitle());
		
		driver.close();
		
		
	}

}
