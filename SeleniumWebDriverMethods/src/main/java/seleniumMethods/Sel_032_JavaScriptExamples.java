package seleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_032_JavaScriptExamples {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://darksky.net/");
		driver.manage().window().maximize();
		
		// String title = JavaScriptUtil.getTitleByJS(driver);
		// System.out.println(title);
		
		// JavaScriptUtil.scrollPageDown(driver);
		
		// JavaScriptUtil.specificScrollPageDown(driver);
		
		// String pageText = JavaScriptUtil.getPageInnerText(driver);
		// System.out.println(pageText);
		
		// Thread.sleep(3000);
		// JavaScriptUtil.refreshBrowserByJS(driver);
		
	}

}












