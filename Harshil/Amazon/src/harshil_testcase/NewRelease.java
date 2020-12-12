package harshil_testcase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFalied;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class NewRelease {
	Webdriver driver;
	Screen myScreen;	
	
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.gecko.driver", 
					"C:\\Users\\14389\\Desktop\\Selenium\\Exe files\\geckodriver-master\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window.maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeout().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeout().implicityWait(30, TimeUnit.SECONDS);
			driver.get("https://www.amazon.ca");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectNewRelease() {
		try {
			Pattern amazonNewRelease = new Pattern("C:\\Users\\14389\\Desktop\\AmazonProject\\NewRelease.PNG");
			myScreen.wait(amazonNewRelease, 15);
			myScreen.click(amazonNewRelease);
		} catch (FindFailed e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		NewRelease myObj = new NewRelease();
		myObj.invokeBrowser();
		myObj.selectNewRelease();
	}
}
