package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_010_LinkConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		driver.get("https://the-internet.herokuapp.com/login");
		Thread.sleep(2000);
		
		By elementalSeleniumLink = By.linkText("Elemental Selenium");
		ElementUtil.getElement(driver, elementalSeleniumLink).click();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
