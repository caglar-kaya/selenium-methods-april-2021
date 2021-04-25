package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_042_CustomXpath_04_Last {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/login");
		
		// (//div[@class='col-md-9 col-sm-12'])[1]//input
		driver.findElement(By.xpath("(//div[@class='col-md-9 col-sm-12'])[1]//input")).sendKeys("caglar01");

		// last() concept : 
		
		// (//div[@class='col-md-9 col-sm-12'])[last()]//input
		driver.findElement(By.xpath("(//div[@class='col-md-9 col-sm-12'])[last()]//input")).sendKeys("Cag123.");;
		
		// ancestor:: concept :
		// //input[@id='userName']//ancestor::form
		
	}

}
