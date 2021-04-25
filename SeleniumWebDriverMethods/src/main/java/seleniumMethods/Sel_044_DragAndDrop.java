package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_044_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		
		Thread.sleep(3000);
		
		// First way :
		// actions.dragAndDrop(source, target).build().perform();
		
		// Interview Questions
		
		// actions :
		// .clickAndHold(sourceElement)
		// .moveToElement(targetElement)
		// .release()
		// .build()
		// .perform()
		
		// Second way : 
		actions.clickAndHold(source).moveToElement(target).release().build().perform();
	}

}











