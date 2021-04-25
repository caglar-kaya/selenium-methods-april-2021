package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_018_DropDownMenu_02 {

	static WebDriver driver;
	
	static By month = By.id("month");
	static By day = By.id("day");
	static By year = By.id("year");
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(3000);

		selectDropDownByText(driver, month, "May");
		
		selectDropDownByText(driver, day, "29");
		
		selectDropDownByText(driver, year, "2011");
		
		driver.close();
		
	}
	
	public static void selectDropDownByText(WebDriver driver, By locator, String text) throws InterruptedException {
		WebElement element = driver.findElement(locator);
		Select select = new Select(element);
		select.selectByVisibleText(text);
		Thread.sleep(3000);
	}

}
