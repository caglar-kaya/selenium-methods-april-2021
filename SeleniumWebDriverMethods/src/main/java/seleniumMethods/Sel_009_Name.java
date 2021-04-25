package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_009_Name {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// First usage
//		WebElement userElement = driver.findElement(By.name("username"));
//		userElement.sendKeys("caglar@gmail.com");
		
		// Second usage
//		driver.findElement(By.name("username")).sendKeys("caglar@gmail.com");
		
		// Third usage
		By username = By.name("username");
//		WebElement userElement = driver.findElement(username);
//		userElement.sendKeys("caglar@gmail.com");
		
		// Fourth usage
		ElementUtil.getElement(driver, username).sendKeys("caglar@gmail.com");
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
