package seleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_036_HtmlUnitDriverHeadless {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		// We added dependency : htmlunit-driver
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("https://amazon.com");
		
		System.out.println("\n" + driver.getTitle());
		
	}

}
