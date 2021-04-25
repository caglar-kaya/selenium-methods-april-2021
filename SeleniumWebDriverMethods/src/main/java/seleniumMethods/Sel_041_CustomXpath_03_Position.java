package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_041_CustomXpath_03_Position {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wufoo.com/html5/tabindex-attribute/");
		
		// position concept : 
		
		// (//p//input) : 1 of 6
		// (//p//input)[1] : 1 of 1
		driver.findElement(By.xpath("(//p//input)[1]")).sendKeys("Hello");
		
		// (//p//input) : 1 of 6
		// (//p//input)[position()=2]
		driver.findElement(By.xpath("(//p//input)[position()=2]")).sendKeys("World");
		
		// parent - child tags concept in HTML : 
		
		// //div[@class='header__post-text']//a[text()='Sign up'] --> direct child (parent to child)
		// //div[@class='header__banner']//a[text()='Sign up']    --> in-direct child (grandparent to child)
		driver.findElement(By.xpath("//div[@class='header__post-text']//a[text()='Sign up']")).click();
		
		// following:: concept (parent tag --> child tag)
		
		// //div[@class='field__container ']//following::input[@id='email']
		driver.findElement(By.xpath("//div[@class='field__container ']//following::input[@id='email']")).sendKeys("caglar@gmail.com");
		
		// child tag --> parent tag
		// //input[@name='username']/../../../../.. like this
		// //input[@name='username']//parent::div
		// //input[@name='username']//parent::div//parent::form
		
		
	}

}















