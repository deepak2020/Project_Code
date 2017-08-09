package testing;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Switch {

	@Test
	public static void main() {
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		String windows = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id='button1']")).click();
		Set <String> WindowsHandles = driver.getWindowHandles();
		
		for (String handles :WindowsHandles ){
		driver.switchTo().window(handles);
		System.out.println(driver.getCurrentUrl());
		
		}
		 driver.close();
		 
		 driver.switchTo().window(windows);
		 System.out.println(driver.getCurrentUrl());
		

	}

}
