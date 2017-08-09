package testing;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {

	WebDriver driver;

	@Test
	public void goToWebsite() {
		driver.get("https://www.google.com");

	}
	
	@Test
	public void goToWebsite1() {
		driver.get("https://www.facebook.com");

	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
