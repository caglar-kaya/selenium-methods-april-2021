package seleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_005_AlertHandling_02_GenericMethod {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// locator
		WebElement signInBtn = driver.findElement(By.name("proceed"));
		
		signInBtn.click();
		Thread.sleep(5000);
		
		//getAlertText();
		
		if (ElementUtil.getAlertText(driver).equals("Please enter a valid user name")) {
			System.out.println("Correct Alert Text");
		} else {
			System.out.println("In-correct Alert Text");
		}
		
		ElementUtil.handleAlert(driver);
		
		Thread.sleep(5000);
		driver.close();
	}
	
//	public static String getAlertText() {
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println("\nAlert Text: " + text);
//		alert.accept();
//		return text;
//	}

}
