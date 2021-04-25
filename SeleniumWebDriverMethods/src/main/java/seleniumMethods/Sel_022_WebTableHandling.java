package seleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_022_WebTableHandling {
	
	static String url = "https://www.w3schools.com/html/html_tables.asp";

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("accept-choices")).click();
		
		// Whole table
		WebElement table = driver.findElement(By.id("customers"));
		System.out.println(table.getText());
		
		// Table Row 1
		WebElement tableRow1 = driver.findElement(By.xpath("//table[@id='customers']//tr[1]"));
		System.out.println("\n" + tableRow1.getText());
		
		// Whole Rows
		for (int i = 1; i <= 7; i++) {
			WebElement tableRow = driver.findElement(By.xpath("//table[@id='customers']//tr[" + i + "]"));
			System.out.println("\n" + tableRow.getText());
		}
		
		// List of Rows 
		List<WebElement> listRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		for (WebElement element : listRows) {
			String textRow = element.getText();
			System.out.println("\n" + textRow);
		}
	}

}
