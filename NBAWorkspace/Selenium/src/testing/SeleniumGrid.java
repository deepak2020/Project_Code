package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SeleniumGrid {
	
	WebDriver driver;
	String baseURL, nodeURL;
	
  @Test
  public void f() {
	  driver.navigate().to(baseURL);
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  File file = new File ("C:\\Users\\deepak.kumar\\NBAWorkspace\\Selenium\\config.properties");
	  FileInputStream fileInput = new FileInputStream(file);
	  
	  Properties prop = new Properties();
	  prop.load(fileInput);
	  baseURL =  prop.getProperty("baseURL");
	  driver = new FirefoxDriver();
//	  nodeURL= "http://deepak2020rana:adaf9d51-ade1-40cb-8722-cd6b1b578144@ondemand.saucelabs.com:80/wd/hub";
//	  DesiredCapabilities capability = DesiredCapabilities.firefox();
//	  DesiredCapabilities chromeCapability = DesiredCapabilities.edge();
//	  capability.setBrowserName("safari");
//	  capability.setPlatform(Platform.ANY);
//	  chromeCapability.setBrowserName("MicrosoftEdge");
//	  chromeCapability.setPlatform(Platform.WIN10);
//	  
//	  try {
////		driver = new RemoteWebDriver(new URL(nodeURL), chromeCapability);
//	} catch (MalformedURLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
