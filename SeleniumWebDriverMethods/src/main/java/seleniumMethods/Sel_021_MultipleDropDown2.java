package seleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_021_MultipleDropDown2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		selectMultiple(driver, "choice 6 2 1", "choice 6 2 2", "choice 6 2 3");
		
	}
	
	public static void selectMultiple(WebDriver driver, String ... choice) {
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		List<WebElement> listMulti = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		for (WebElement element : listMulti) {
			for (String string : choice) {
				if (string.equals(element.getText())) {
					element.click();
				}
			}
		}
	}

}
