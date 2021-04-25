package seleniumMethods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_031_BrowserWindowsPopup {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Follow On Twitter']")).click();
		
		// getWindowHandle == get the current window handling
		// getWindowHandles == get the all window handles that were opened
		// switchTo().window() == switch to between windows
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> itr = windowHandles.iterator();
		
		String parentWindowID = itr.next();
		System.out.println("\nParent window ID : " + parentWindowID);
		
		String childWindowID = itr.next();
		System.out.println("\nChild window ID : " + childWindowID);
		
		driver.switchTo().window(childWindowID);
		driver.manage().window().maximize();
		// Explicitly Wait : 
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Selenium Easy (@seleniumeasy) / Twitter"));
		System.out.println("\nChild window title : " + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println("\nParent window title : " + driver.getTitle());
		
		driver.close();
	}

}













