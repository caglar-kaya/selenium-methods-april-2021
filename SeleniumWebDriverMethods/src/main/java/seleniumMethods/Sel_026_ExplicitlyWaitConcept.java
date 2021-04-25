package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_026_ExplicitlyWaitConcept {
	
	public static void main(String[] args) {

		// Implicitly Wait Concept waits for only elements.
		// Explicitly Wait Concept waits for both elements and non-elements.
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		WebDriverWait wait = new WebDriverWait(driver, 25);
		
		// parameter : locator
		wait.until(ExpectedConditions.elementToBeClickable(By.id("at-cv-lightbox-close")));
		
		// parameter : element
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("at-cv-lightbox-close"))));
		
		
		driver.findElement(By.id("at-cv-lightbox-close")).click();
		
		By enterMessage = By.id("user-message");
		By showMessage = By.cssSelector("button[onclick='showInput();']");
		By enterA = By.id("sum1");
		By enterB = By.id("sum2");
		By getTotal = By.xpath("//button[normalize-space()='Get Total']");
		
		getElement(driver, enterMessage, 10).sendKeys("Hi guys, my name is Caglar :-)");
		
		getElement(driver, showMessage, 20).click();
		
		getElement(driver, enterA, 5).sendKeys("33");
		
		getElement(driver, enterB, 15).sendKeys("44");
		
		getElement(driver, getTotal, 10).click();
		
		
	}
	
	public static void waitForPresenceOfElement(WebDriver driver, By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement getElement(WebDriver driver, By locator, int timeout) {
		waitForPresenceOfElement(driver, locator, timeout);
		
		WebElement element = driver.findElement(locator);
		
		return element;
	}

}
