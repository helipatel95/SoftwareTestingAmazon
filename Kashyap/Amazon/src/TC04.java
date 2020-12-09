import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class TC04 {
	
	static void tc04() throws FindFailed, InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/usr/bin/geckodriver");
		
		String filepath = "/home/m3rlin/AmazonTesting/TC04/";
		Screen s2 = new Screen();
		Pattern openButton = new Pattern(filepath + "1.png");
		Pattern openButton2 = new Pattern(filepath + "2.png");
		Pattern openButton3 = new Pattern(filepath + "3.png");
		Pattern openButton4 = new Pattern(filepath + "4.png");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://amazon.ca");
		driver.manage().window().maximize();
		WebElement elementUpload=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(elementUpload));
		s2.click(openButton);
		s2.type("harry potter and the philosopher's stone");
		s2.click(openButton2);
		Thread.sleep(4000);
		s2.click(openButton3);
		s2.click(openButton4);
		
	}

}
