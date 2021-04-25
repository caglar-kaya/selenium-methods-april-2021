package seleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Sel_037_HeadlessFirefox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "F:\\Drivers\\geckodriver.exe");
		
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.addArguments("--headless"); // -- is important!
		
		WebDriver driver = new FirefoxDriver(firefoxOptions);
		
		driver.get("https://amazon.com");
		
		System.out.println("\n" + driver.getTitle());
	}

}
