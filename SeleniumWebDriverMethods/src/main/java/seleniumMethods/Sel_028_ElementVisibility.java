package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_028_ElementVisibility {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/register");
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@name='agreeTerms']"));
		WebElement submitBtn = driver.findElement(By.id("submitButton"));
		
		// isDisplayed
		// isEnabled
		// isSelected
		
		System.out.println("\nWhen checkbox is unclicked : ");
		System.out.println("Is checkbox selected : " + checkBox.isSelected());
		System.out.println("Is submit button displayed : " + submitBtn.isDisplayed());
		System.out.println("Is submit button enabled : " + submitBtn.isEnabled());
		
		checkBox.click();
		System.out.println("\nWhen checkbox is clicked : ");
		System.out.println("Is checkbox selected : " + checkBox.isSelected());
		System.out.println("Is submit button displayed : " + submitBtn.isDisplayed());
		System.out.println("Is submit button enabled : " + submitBtn.isEnabled());
		
		
	}

}
