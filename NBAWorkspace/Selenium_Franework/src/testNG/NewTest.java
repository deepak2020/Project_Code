package testNG;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	
	@Test (dataProvider= "getURL")
	
	public void openBrowser(String URL) throws MalformedURLException{
	URL url = new URL("http://pyneema:dd01d1a4-ffc5-4db3-ab46-e591492aedbf@ondemand.saucelabs.com:80/wd/hub");
		DesiredCapabilities capabilities = DesiredCapabilities.edge();
//		capabilities.setBrowserName("Edge");
		capabilities.setCapability("name", "Test1");
		capabilities.setVersion("13");
		capabilities.setPlatform(Platform.WIN10);
		WebDriver driver = new RemoteWebDriver(url, capabilities);
		driver.get(URL);
	}
	
//	@Test 
//	@Parameters({"URL"})
//	public void openBrowser1(String URL){
//		WebDriver driver = new FirefoxDriver();
//		driver.get(URL);
//	}
//	
//	@Test 
//	@Parameters({"URL"})
//	public void openBrowser2(String URL){
//		WebDriver driver = new FirefoxDriver();
//		driver.get(URL);
//		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//
//	}
  
@DataProvider(name="getURL")
public static Object[][] getURL() {
		
return new Object [][] {{"https://www.google.com"},{"https://www.facebook.com"}};
		 
        
  }
 
	 
}
