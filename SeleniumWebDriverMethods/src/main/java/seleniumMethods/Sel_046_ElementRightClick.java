package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_046_ElementRightClick {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions actions = new Actions(driver);
		
		WebElement rightClickMe = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		actions.contextClick(rightClickMe).build().perform();
		
		WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
		String textCopy = copy.getText();
		System.out.println(textCopy);
		copy.click();
		//actions.click(copy); // Didn't work!
	}

}
