package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	
	@Test

	 public void checkPageTitle(){
		 
			WebDriver driver = new FirefoxDriver();
			WebDriverWait wait = new WebDriverWait(driver, 30);
			 driver.get("https://www.google.com");
//			 WebElement element = driver.findElement(By.xpath(".//*[@id='lst-ib']"));
//			 driver.getCurrentUrl();
//			 element.click();
//			 element.sendKeys("facebook");
//			 element.sendKeys(Keys.ENTER);
			 
			 String actualPageTitle = driver.getTitle();
			 
			 String expectedPageTitle = "1";
			 
			 
			 
			 Assert.assertEquals(actualPageTitle, expectedPageTitle, "Google title is incorrect");
			
	 }

}