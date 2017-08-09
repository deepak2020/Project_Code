import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.steadystate.css.util.Output;


public class Wrindows {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows");
		
//		String parentWindow = driver.getWindowHandle();
		System.out.println("I am parent"+driver.getCurrentUrl());
		driver.findElement(By.xpath("//*[@id='button1']")).click();

//		Set <String> handle = driver.getWindowHandles();
//		
//		String Window1 = (String) handle.toArray()[0];
//		String Window2 = (String) handle.toArray()[1];
//		
//		for(String childWindow : handle){
//			driver.switchTo().window(childWindow);
//			System.out.println("I am child"+ driver.getCurrentUrl());
//			
////		}
////		
//		
//		driver.switchTo().window(Window2);
//		driver.switchTo().window(Window1);
		driver.switchTo().alert().accept();;
		driver.findElement(By.id("Ok"));
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("D:\\screenshot.jpg"));
		
		
	}

}
