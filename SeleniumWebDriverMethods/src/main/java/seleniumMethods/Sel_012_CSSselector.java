package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_012_CSSselector {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(2000);
		
		By userName = By.cssSelector("#userName");
		ElementUtil.getElement(driver, userName).sendKeys("Caglar Kaya");
		
		Thread.sleep(2000);
		driver.close();
	}

}
