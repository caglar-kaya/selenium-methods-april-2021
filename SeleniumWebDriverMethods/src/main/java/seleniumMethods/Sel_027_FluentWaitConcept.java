package seleniumMethods;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_027_FluentWaitConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click Me - Fluent Wait')]")).click();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		// in line 24 we clicked the button and element (sentence) will appear 10 seconds later..
		// "Waiting for element..." will be printed 5 times.
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement element2 = driver.findElement(By.id("demo"));
				String textElement = element2.getText();
				if (textElement.equals("Software Testing Material - DEMO PAGE")) {
					System.out.println("\nText : " + textElement);
					return element2;
				} else {
					System.out.println("Waiting for element...");
					return null;
				}
			}
		});
			
		driver.close();
	}

}
