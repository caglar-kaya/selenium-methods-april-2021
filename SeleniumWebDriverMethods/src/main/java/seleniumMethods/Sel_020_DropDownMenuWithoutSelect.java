package seleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_020_DropDownMenuWithoutSelect {

	public static void main(String[] args) throws InterruptedException {

		// Interview Question : How to handle dropdown menu without Select class?
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		// 1. Way : to use specific locator of option that you want to select
//		WebElement yearSelectDirectly = driver.findElement(By.xpath("//option[@value='1988']"));
//		yearSelectDirectly.click();
		
		for (int i = 2021; i >= 1905; i--) {
			WebElement yearList = driver.findElement(By.xpath("//option[@value='" + i + "']"));
			if (yearList.getText().equals("1988")) {
				yearList.click();
			}
		}
		
		// 2. Way : to get list of options by using findElements concept and use for loop and if block
		List<WebElement> daysOptionList = driver.findElements(By.xpath("//select[@id='day']/option"));
		
		System.out.println(daysOptionList.size());
		
		for (int i = 0; i < daysOptionList.size(); i++) {
			System.out.print(daysOptionList.get(i).getText() + " ");
			if (daysOptionList.get(i).getText().equals("7")) {
				daysOptionList.get(i).click();
				break;
			}
		}
	}

}
