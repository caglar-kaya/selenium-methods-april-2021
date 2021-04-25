package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sel_006_AlertHandling_03_CommonMethods {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://mail.rediff.com/cgi-bin/login.cgi";
		
		By goBtn = By.name("proceed");
		
		// Launch Browser
		driver = ElementUtil.launchBrowser(driver, "chrome");
		
		// Navigate URL
		ElementUtil.launchURL(driver, url);
		
		// Get Title
		System.out.println(ElementUtil.getPageTitle(driver));
		
		// Click on Sign in
		ElementUtil.clickOn(driver, goBtn);
		
		Thread.sleep(5000);
		
		String text = ElementUtil.getAlertText(driver);
		if (text.equals("Please enter a valid user name")) {
			System.out.println("Alert text is correct.");
		} else {
			System.out.println("Alert text is in-correct.");
		}
		
		ElementUtil.handleAlert(driver);
		
		ElementUtil.closeBrowser(driver);
		
		System.out.println("\nTest is completed.");
		
	}

}
