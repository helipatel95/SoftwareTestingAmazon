package nisarg_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class nisargAmazonSearchBar {
	
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
	
	
	public void selectSearchBar() {
		try {
			myScreen = new Screen();
			Pattern p1 = new Pattern("C:\\Users\\Nisar\\Desktop\\SearchAllAmazon.PNG");
			Pattern p2 = new Pattern("C:\\Users\\Nisar\\Desktop\\SearchAutomativeAmazon.PNG");
			Pattern searchTextBox = new Pattern("C:\\Users\\Nisar\\Desktop\\SearchAmazon.PNG");
			
			
			myScreen.click(p1);
			
			myScreen.wait(p2, 2);
			myScreen.click(p2);
			
			myScreen.wait(searchTextBox, 2);
			myScreen.type("C:\\\\Users\\\\Nisar\\\\Desktop\\\\SearchAmazon.PNG", "tubeless tire repair kit");
			
			Pattern searchTextBox1 = new Pattern("C:\\Users\\Nisar\\Desktop\\Tubelesstirekit.PNG");
			myScreen.wait(searchTextBox1, 2);
			myScreen.click(searchTextBox1);
			
		} catch (FindFailed e) {
			e.printStackTrace();
		}	
	} 
		

	public static void main(String[] args) {
		nisargAmazonSearchBar obj = new nisargAmazonSearchBar();
		obj.invokeBrowser();
		obj.selectSearchBar();
		
	}

}
