package seleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementUtil {
	
	// Common Selenium Methods :
	
	
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @param text
	 * @throws InterruptedException
	 */
	public static void selectDropDownByText(WebDriver driver, By locator, String text) throws InterruptedException {
		WebElement element = driver.findElement(locator);
		Select select = new Select(element);
		select.selectByVisibleText(text);
		Thread.sleep(3000);
	}
	
	/**
	 * This method is used to get alert text and to handle alert.
	 * @param driver
	 * @return
	 */
	public static String getAlertText(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("\nAlert Text: " + text);
		alert.accept();
		return text;
	}
	
	/**
	 * This method is used to handle alert.
	 * @param driver
	 */
	public static void handleAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	/**
	 * This method is used to launch a browser.
	 * @param driver
	 * @param browserName
	 * @return
	 */
	public static WebDriver launchBrowser(WebDriver driver, String browserName) {
		
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else if (browserName.equals("opera")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		} else {
			System.out.println(browserName + " is not available.");
		}
		
		return driver;
	}
	
	/**
	 * This method is used to launch an URL.
	 * @param driver
	 * @param url
	 */
	public static void launchURL(WebDriver driver, String url) {
		driver.get(url);
	}
	
	/**
	 * This method is used to get an element.
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	/**
	 * This method is used to get the page title.
	 * @param driver
	 * @return
	 */
	public static String getPageTitle(WebDriver driver) {
		String title = driver.getTitle();
		return title;
	}
	
	/**
	 * This method is used to click on an element.
	 * @param driver
	 * @param locator
	 */
	public static void clickOn(WebDriver driver, By locator) {
		driver.findElement(locator).click();
	}
	
	/**
	 * This method is used to close a browser.
	 * @param driver
	 */
	public static void closeBrowser(WebDriver driver) {
		driver.close();
	}
	
	/**
	 * This method is used to quit a browser.
	 * @param driver
	 */
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
	
}


















