package seleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_038_HeadlessChrome {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("headless"); // headless or --headless
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.get("https://youtube.com");
		
		System.out.println("\n" + driver.getTitle());
	}

}
