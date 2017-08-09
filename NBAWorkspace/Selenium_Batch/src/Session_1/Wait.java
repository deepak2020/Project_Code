package Session_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	static WebDriver driver = new FirefoxDriver();
	// Implicit wait --  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
	// Explicitly wait --

	public static void main(String[] args) {
		
		driver.manage().window().maximize();
		
		Wait wait = new Wait();
		Wait element = new Wait();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.gmail.com");
		WebElement emailid =  element.findElementbyXpath(".//*[@id='Email']");
		emailid.click();
		emailid.sendKeys("deepak2020rana@gmail.com");
		
		WebElement next =  driver.findElement(By.xpath("//*[@id='next']"));
		next.click();
		
		WebElement password = driver.findElement(By.xpath(".//*[@id='Passwd']"));
		
		wait.waitForElement(password, 60);
		password.click();
		password.sendKeys("test@124");	
		

	}
	
	public void waitForElement(WebElement pageElement, long time){
		WebDriverWait wait = new WebDriverWait(driver, time);
		pageElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='Passwd']")));
	}
	
	
	public WebElement findElementbyXpath(String xpath){
		return driver.findElement(By.xpath(xpath));
	}

}
