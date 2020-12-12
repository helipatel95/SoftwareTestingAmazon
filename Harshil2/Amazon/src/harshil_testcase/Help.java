package harshil_testcase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFalied;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen; 

public class Help {
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
	
	public void selectHelp() {
		try {
			Pattern amazonHelp = new Pattern("C:\\Users\\14389\\Desktop\\AmazonProject\\Help.PNG");
			Pattern amazonPrimeMambership = new Pattern("C:\\Users\\14389\\Desktop\\AmazonProject\\ManagePrime.PNG");
			myScreen.wait(amazonHelp, 15);
			myScreen.click(amazonHelp);
			myScreen.wait(amazonPrimeMambership, 15);
			myScreen.click(amazonPrimeMambership);
		} catch (FindFailed e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Help myObj = new Help();
		myObj.invokeBrowser();
		myObj.selectHelp();
	}

}
