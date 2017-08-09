package testing;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class Alert {
  @Test
  public void testDriver() throws IOException {
	  ProfilesIni myprofile = new ProfilesIni();
	  
	  FirefoxProfile profile = myprofile.getProfile("Selenium_Profile");
//	  FirefoxProfile profile = new FirefoxProfile(Selenium_Profile);
	  File addonPath = new File("C:\\Users\\deepak.kumar\\Desktop\\AddOn\\firebug-3.0.0-alpha.14.xpi");
	  profile.addExtension(addonPath);
	  WebDriver driver = new FirefoxDriver(profile);
	  driver.navigate().to("http://toolsqa.com/automation-practice-switch-windows/");
	  driver.findElement(By.xpath("//*[@id='button1']")).click();
	  Set <String> windows = driver.getWindowHandles();
	  String parentBrowser = (String) windows.toArray()[0];
	  String childBrowser = (String) windows.toArray()[1];
	  driver.switchTo().window(childBrowser);
	  driver.switchTo().window(parentBrowser);	  
	
	  driver.navigate().refresh();
	  System.out.println(driver.getTitle());
	  driver.findElement(By.xpath("//*[text()='Alert Box']")).click();
	  System.out.println(driver.switchTo().alert().getText());
	  driver.switchTo().alert().accept();
	  
  }
}
