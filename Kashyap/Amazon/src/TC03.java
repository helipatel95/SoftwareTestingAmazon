import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class TC03 {

	static void tc03() throws InterruptedException, FindFailed {
		
		System.setProperty("webdriver.gecko.driver","/usr/bin/geckodriver");
		
		String filepath = "/home/m3rlin/AmazonTesting/TC03/";
		Screen s2 = new Screen();
		Pattern openButton = new Pattern(filepath + "1.png");
		Pattern openButton2 = new Pattern(filepath + "2.png");
		Pattern openButton3 = new Pattern(filepath + "3.png");
		Pattern openButton4 = new Pattern(filepath + "4.png");
		WebDriver driver = new FirefoxDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		driver.get("https://amazon.ca");
		js.executeScript("window.scrollBy(0,5000)");
		WebElement elementUpload=driver.findElement(By.xpath("//*[@id='icp-touch-link-country']"));
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(elementUpload));
		Thread.sleep(2000);
		s2.click(openButton);
		s2.click(openButton2);
		s2.click(openButton3);
		s2.click(openButton4);
		
	}
	
}
