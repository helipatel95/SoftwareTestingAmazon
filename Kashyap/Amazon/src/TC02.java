import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class TC02 {
	
	static void tc02() throws FindFailed {
		
		System.setProperty("webdriver.gecko.driver","/usr/bin/geckodriver");
		
		String filepath = "/home/m3rlin/AmazonTesting/TC02/";
		Screen s2 = new Screen();
        Pattern openButton = new Pattern(filepath + "address.png");
        Pattern openButton2 = new Pattern(filepath + "address_add.png");
        Pattern openButton3 = new Pattern(filepath + "apply.png");
        WebDriver driver2 = new FirefoxDriver();
        driver2.get("https://amazon.ca");
        WebElement elementUpload=driver2.findElement(By.xpath("//*[@id='nav-packard-glow-loc-icon']"));
        WebDriverWait wait=new WebDriverWait(driver2, 30);
        wait.until(ExpectedConditions.elementToBeClickable(elementUpload));
		s2.click(openButton);
		s2.click(openButton2);
		s2.type("H2V4H4");
		s2.click(openButton3);
		
	}

}
