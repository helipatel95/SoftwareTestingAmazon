package nisarg_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class nisargAmazonBackToTop {

	static WebDriver driver;
	Screen myScreen;
	JavascriptExecutor jse;
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.ca");		
		
	}
	
	public void selectBackToTop() {
		try {
			Thread.sleep(3000);
			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0,4750)");
			
			myScreen = new Screen();
			Pattern p1 = new Pattern("C:\\Users\\Nisar\\Desktop\\BackToTopAmazon.PNG");
			
			myScreen.wait(p1, 5);
			myScreen.click(p1);
			
			
		} catch (FindFailed e) {
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args) {
		nisargAmazonBackToTop obj = new nisargAmazonBackToTop();
		obj.invokeBrowser();
		obj.selectBackToTop();
		
	}
}
