package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_040_CustomXpath_02_Text {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.com");
		
		// //span[text()='Hello, Sign in']
		driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
		
		// //span[contains(text(), 'Continue')]
		// driver.findElement(By.xpath("//span[contains(text(), 'Continue')]")).click();
		
		// //span//a[starts-with(@id, 'createAcc')]
		driver.findElement(By.xpath("//span//a[starts-with(@id, 'createAcc')]")).click();
		
	}

}



