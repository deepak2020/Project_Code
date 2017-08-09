package Session_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Find_Links {
	static WebDriver driver = new FirefoxDriver();
	public static void main(String[] args) {
	
		//System property - define browser driver
	
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath(".//input[@id='email']")).sendKeys("deepak2020rana@gmail.com");
		driver.findElement(By.xpath(".//input[@id='pass']")).sendKeys("test@124");
		click();
		
//		
//		//Find the element
//		
//		WebElement firstName = driver.findElement(By.xpath("//*[@name='firstname']"));
//				//driver.findElement(By.linkText("Selenium Automation Hybrid Framework"));		
//		WebElement partialLink =  driver.findElement(By.partialLinkText("Selenium Automation"));
//				//driver.findElement(By.className("radio"));
//				//driver.findElement(By.name("sex"));
//				//driver.findElement(By.id("sex-0"));
//				//driver.findElement(By.xpath("//*[text()='Partial Link Test']"));
//		
//		//Perform actions
////		? partialLink.click();
//		firstName.click();
//		firstName.sendKeys("TETSTSTSTST");
//		
////		Practice Exercise 1
////
////		Launch new Browser
////		Open URL http://toolsqa.wpengine.com/automation-practice-form/
////		Type Name & Last Name (Use Name locator)
////		Click on Submit button (Use ID locator)
//		
//		
////		Practice Exercise 2
//
////Launch new Browser
////Open URL http://toolsqa.wpengine.com/automation-practice-form/
////Click on the Link “Partial Link Test” (Use ‘patialLinkTest’ locator and search by ‘Partial’ word)
////Identify Submit button with ‘tagName’, convert it in to string and print it on the console
////Click on the Link “Link Test” (Use ‘linkTest’ locator)
//		

	}

	
	public static void click(){
		driver.findElement(By.xpath(".//*[@id='u_0_q']")).click();
	}
}
