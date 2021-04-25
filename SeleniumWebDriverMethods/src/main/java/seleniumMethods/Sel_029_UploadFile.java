package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_029_UploadFile {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		WebElement chooseFile = driver.findElement(By.xpath("//input[@name='upfile']"));
		
		chooseFile.sendKeys("C:\\Users\\User\\Desktop\\Hello.txt");
		
		WebElement press = driver.findElement(By.xpath("//input[@type='submit']"));
		
		press.click();
	}

}
