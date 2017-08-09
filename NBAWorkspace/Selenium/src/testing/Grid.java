package testing;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grid {
	WebDriver driver;
	String baseURl, nodeURL, SauceLabURL;
	
	//adaf9d51-ade1-40cb-8722-cd6b1b578144
	
	
  @Test
  public void f() {
	  driver.get(baseURl);
  }
  @BeforeTest
  public void beforeMethod() throws MalformedURLException {
	  baseURl = "http://www.google.com";
	  nodeURL = "http://localhost:4444/wd/hub";
	  SauceLabURL ="http://deepak2020rana:adaf9d51-ade1-40cb-8722-cd6b1b578144@ondemand.saucelabs.com:80/wd/hub/";
	  DesiredCapabilities capability = DesiredCapabilities.firefox();
	  capability.setBrowserName("MicrosoftEdge");
	  capability.setPlatform(Platform.WIN10);
	  driver = new RemoteWebDriver( new URL(SauceLabURL), capability);
	  
  }

  @AfterTest
  public void afterMethod() {
	  driver.close();
  }

}
