package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_011_Xpath {

	public static void main(String[] args) throws InterruptedException {

		// Absolute XPath :
		// /html/body/div/div/div/div[2]/div[2]/div[1]/form/div[1]/div[2]/input
		
		// Relative XPath : 
		// //*[@id="userName"]
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(2000);
		
		// Customized unique xPath : //input[@id='userName']
		
		By userName = By.xpath("//*[@id='userName']");
//		WebElement fullName = driver.findElement(userName);
//		fullName.sendKeys("Caglar Kaya");
		
		ElementUtil.getElement(driver, userName).sendKeys("Caglar Kaya");
		
		Thread.sleep(2000);
		driver.close();
	}

}














