package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_034_FrameHandling {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		driver.manage().window().maximize();
		System.out.println("\nDefault Content Title: " + driver.getTitle());
		
		driver.switchTo().frame(driver.findElement(By.name("main")));
		System.out.println("\nFrame Content Title: " + driver.getTitle());
		
		// xPath : //h2[contains(text(), 'Title bar')]
		WebElement header = driver.findElement(By.xpath("//h2[contains(text(), 'Title bar')]"));
		System.out.println("\n" + header.getText());
		
		driver.switchTo().defaultContent();
		System.out.println("\nDefault Content Title: " + driver.getTitle());
	}

}
