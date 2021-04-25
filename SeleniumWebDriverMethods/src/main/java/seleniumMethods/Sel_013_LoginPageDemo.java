package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sel_013_LoginPageDemo {

	public static WebDriver driver;
	
	static By email = By.id("username");
	static By password = By.xpath("//input[@id='password']");
	static By loginBtn = By.cssSelector("#loginBtn");
	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://app.hubspot.com/login"; 

		driver = ElementUtil.launchBrowser(driver, "chrome");
		
		ElementUtil.launchURL(driver, url);
		Thread.sleep(3000);
		
		ElementUtil.getElement(driver, email).sendKeys("caglar@gmail.com");
		Thread.sleep(3000);
		
		ElementUtil.getElement(driver, password).sendKeys("12345#");
		Thread.sleep(3000);

		ElementUtil.getElement(driver, loginBtn).click();
		
		ElementUtil.closeBrowser(driver);
		
		
		
		
	}

}










