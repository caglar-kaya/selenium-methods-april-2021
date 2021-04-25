package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_017_DropDownMenu_01 {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		// Select class : to select an item from dropdown menu
		Select select1 = new Select(month);
		select1.selectByVisibleText("Oct");
		Thread.sleep(3000);
		
		Select select2 = new Select(day);
		select2.selectByValue("20");
		Thread.sleep(3000);
		
		Select select3 = new Select(year);
		select3.selectByVisibleText("1988");
		Thread.sleep(3000);
		
		System.out.println(select1.isMultiple()); // false
		
		driver.close();
	}

}
