package seleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_004_AlertHandling_01 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// locator
		WebElement signInBtn = driver.findElement(By.name("proceed"));
		
		signInBtn.click();
		Thread.sleep(3000);
		
		// handle alert
		Alert alert = driver.switchTo().alert();

		String textSignInAlert = alert.getText();
		System.out.println("\nSign in Alert Text: " + textSignInAlert);
		
		if (textSignInAlert.equals("Please enter a valid user name")) {
			System.out.println("\nSing in alert text is correct.");
		} else {
			System.out.println("\nSing in alert text is in-correct.");
		}
		
		alert.accept();
		Thread.sleep(3000);
		
		driver.close();
	}

}
