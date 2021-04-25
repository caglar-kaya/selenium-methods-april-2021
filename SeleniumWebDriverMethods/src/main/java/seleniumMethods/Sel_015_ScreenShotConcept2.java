package seleniumMethods;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_015_ScreenShotConcept2 {
	
	static WebDriver driver;
	static WebElement element;

	public static void main(String[] args) throws IOException {

		// to take a screenshot we have to add : commons-io dependency
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://siliconelabs.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		element = driver.findElement(By.xpath("//img[@class='main-logo']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", element);
		
		File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Point p = element.getLocation();
		int width = element.getSize().getWidth();
		int height = element.getSize().getHeight();
		
		// use java.awt
		Rectangle rectangle = new Rectangle(width + 250, height + 60);
		
		BufferedImage image = null;
		image = ImageIO.read(screenShot);
		
		BufferedImage destination = image.getSubimage(p.getX(), p.getY(), rectangle.width, rectangle.height);
		
		ImageIO.write(destination, "png", screenShot);
		
		FileUtils.copyFile(screenShot, new File("C:\\Users\\User\\Desktop\\Selenium Screenshots\\pic2.png"));
		
		driver.quit();
	}

}
