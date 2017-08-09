package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.asserts.Assertion;

public class NewTest {
	
	WebDriver driver;
	
  @Test(dataProvider="getURL")
  
  public void goToWebsite(String url) {
	  driver.get(url);
//	  String actualTitle = driver.getTitle();
//	  String expetedTitle = "facebook";
//	  
//	  Assert.assertEquals(actualTitle, expetedTitle);
  }
  
  @DataProvider(name="getURL")
  public static String[][] getURL() {
  		
  return new String [][] {{"https://www.google.com"},{"https://www.facebook.com"}};
  		 
          
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
