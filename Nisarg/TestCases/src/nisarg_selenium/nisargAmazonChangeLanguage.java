package nisarg_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class nisargAmazonChangeLanguage {

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
	
	public void changelanguage() {
		try {
			Thread.sleep(3000);
			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0,7000)");
			myScreen = new Screen();
			Pattern p1 = new Pattern("C:\\Users\\Nisar\\Desktop\\LangAmazon.PNG");
			Pattern p2 = new Pattern("C:\\Users\\Nisar\\Desktop\\LangAmazon1.PNG");
			Pattern p3 = new Pattern("C:\\Users\\Nisar\\Desktop\\LangAmazon2.PNG");
			
			
			myScreen.click(p1);
			myScreen.wait(p2, 2);
			myScreen.click(p2);
			myScreen.wait(p3, 2);
			myScreen.click(p3);
			
		} catch (FindFailed e) {
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args) {
		nisargAmazonChangeLanguage obj = new nisargAmazonChangeLanguage();
		obj.invokeBrowser();
		obj.changelanguage();
		
	}
}
