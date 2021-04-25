package seleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_016_FindElementSSSconcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// findelementS concept
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
		// How many links are there in linkList?
		int numberOflinks = linkList.size();
		System.out.println("\nTotal number of links in linkList : " + numberOflinks);
		
//		for (int i = 0; i < linkList.size(); i++) {
//			System.out.println(i + 1 + ". : " + linkList.get(i));
//		}
		
//		for (int i = 0; i < linkList.size(); i++) {
//			String textLinks = linkList.get(i).getText();
//			System.out.println(i + 1 + ". : " + textLinks);
//		}
		
//		for (int i = 0; i < linkList.size(); i++) {
//			String textLinks = linkList.get(i).getText();
//			if (textLinks.isEmpty()) {
//				System.out.println(i + 1 + ". : " + "***Link Text is Empty.***");
//			} else {
//				System.out.println(i + 1 + ". : " + textLinks);
//			}
//		}
		
		for (int i = 0; i < linkList.size(); i++) {
			String textLinks = linkList.get(i).getText();
			if (textLinks.equals("Forgot Password?")) {
				linkList.get(i).click();
				break;
			}
		}
		
		
	}

}
