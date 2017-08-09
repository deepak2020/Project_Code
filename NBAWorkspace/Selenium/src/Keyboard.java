import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class Keyboard {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		 driver.get("https://www.google.com");
//		 WebElement element = driver.findElement(By.xpath(".//*[@id='lst-ib']"));
//		 driver.getCurrentUrl();
//		 element.click();
//		 element.sendKeys("facebook");
//		 element.sendKeys(Keys.ENTER);
		 
		 String actualPageTitle = driver.getTitle();
		 
		 String expectedPageTitle = "Google";
		 
		 
		 
		 Assert.assertEquals(actualPageTitle, expectedPageTitle);
	}
}
