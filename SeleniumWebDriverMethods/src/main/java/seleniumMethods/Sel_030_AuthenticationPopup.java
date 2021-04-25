package seleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_030_AuthenticationPopup {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// This line doesn't handle authentication pop-up window..
		// driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		// FIRST WAY :
		// driver.get("https://USERNAME:PASSWORD@the-internet.herokuapp.com/basic_auth");
		// username : admin
		// password : admin
		// Don't forget : and @ symbols..
		
		// username : password @
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		// SECOND WAY (Same logic)
//		String username = "admin";
//		String password = "admin";
//		
//		driver.get("https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth");

	}

}
