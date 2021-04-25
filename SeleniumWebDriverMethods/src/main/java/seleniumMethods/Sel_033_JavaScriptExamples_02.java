package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_033_JavaScriptExamples_02 {
	
	static By newUser = By.id("newUser");
	static By firstName = By.id("firstname");
	static By lastName = By.id("lastname");
	static By userName = By.id("userName");
	static By password = By.id("password");
	static By robotBox = By.xpath("//div[@id='g-recaptcha']//div//div");
//	static By notRobot = By.xpath("//div[@class='recaptcha-checkbox-borderAnimation']");
//	static By register = By.id("register");

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement newUserBtn = driver.findElement(newUser);
		// JavaScriptUtil.flash(newUserBtn, driver); // Didn't work for button
		JavaScriptUtil.clickElementByJS(newUserBtn, driver);
		
		Thread.sleep(3000);
		JavaScriptUtil.specificScrollPageDown(driver);
		
		Thread.sleep(3000);
		WebElement first_name = driver.findElement(firstName);
		JavaScriptUtil.flash(first_name, driver);
		JavaScriptUtil.sendKeysUsingJSWithID(driver, "firstname", "Caglar");
		
		Thread.sleep(3000);
		WebElement last_name = driver.findElement(lastName);
		JavaScriptUtil.flash(last_name, driver);
		JavaScriptUtil.sendKeysUsingJSWithID(driver, "lastname", "Kaya");
		
		Thread.sleep(3000);
		WebElement user_name = driver.findElement(userName);
		JavaScriptUtil.flash(user_name, driver);
		JavaScriptUtil.sendKeysUsingJSWithID(driver, "userName", "caglar01");
		
		Thread.sleep(3000);
		WebElement pass_word = driver.findElement(password);
		JavaScriptUtil.flash(pass_word, driver);
		JavaScriptUtil.sendKeysUsingJSWithID(driver, "password", "Caglar1234.");
		
		Thread.sleep(3000);
		WebElement robot_Box = driver.findElement(robotBox);
		JavaScriptUtil.drawBorder(robot_Box, driver);
		
//		Thread.sleep(3000);
//		WebElement not_Robot = driver.findElement(notRobot);
//		JavaScriptUtil.clickElementByJS(not_Robot, driver);
//		
//		Thread.sleep(3000);
//		WebElement registerBtn = driver.findElement(register);
//		JavaScriptUtil.clickElementByJS(registerBtn, driver);

		JavaScriptUtil.generateAlert(driver, "Selenium WebDriver can NOT handle with CAPTCHA");
		
		
	}

}









