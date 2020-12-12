package harshil_testcase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFalied;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class CustomerService {
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
	
	public void selectCustomerService() {
		try { 
			Pattern amazonCustomerService = new Pattern("C:\\Users\\14389\\Desktop\\AmazonProject\\CustomerService.PNG");
			myScreen.wait(amazonCustomerService, 15);
			myScreen.click(amazonCustomerService);
		} catch (FindFailed e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		CustomerService myObj = new CustomerService();
		myObj.invokeBrowser();
		myObj.selectCustomerService();
	}

}
