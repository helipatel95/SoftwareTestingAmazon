import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class TC01 {

	static void tc01() throws FindFailed {
		
		System.setProperty("webdriver.gecko.driver","/usr/bin/geckodriver");
        
		String filepath = "/home/m3rlin/AmazonTesting/TC01/";
        Screen s = new Screen();
        Pattern openButton = new Pattern(filepath + "cart.png");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://amazon.ca");
        WebElement elementUpload=driver.findElement(By.xpath("//*[@id='nav-cart']"));
        WebDriverWait wait=new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(elementUpload));
		s.click(openButton);
		
	}
	
}
