package seleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_023_WebTableHandling_02 {
	
	static WebDriver driver;
	
	static String url = "https://www.w3schools.com/html/html_tables.asp";

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		
		driver = new ChromeDriver(options);
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("accept-choices")).click();
		
		printColumn(2);
		
		
	}
	
	public static int createListRows(WebDriver driver) {
		List<WebElement> listRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int numOfRows = listRows.size();
		return numOfRows;
	}
	
	//*[@id="customers"]/tbody/tr[1]/th[1] //*[@id="customers"]/tbody/tr[1]/th[2] //*[@id="customers"]/tbody/tr[1]/th[3]
	
	public static void printColumn(int column) {
		for (int rowNum = 2; rowNum <= createListRows(driver); rowNum++) {
			By rows = By.xpath("//*[@id='customers']/tbody/tr[" + rowNum + "]/td[" + column + "]");
			String text = driver.findElement(rows).getText();
			System.out.println(text);
		}
	}

}












