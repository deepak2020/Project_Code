package day_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Session1 {

	@Test
	public void AasserionsTest() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		//Firefox browser open
		
		String parentBrowser = driver.getWindowHandle(); // Get Unique ID of the browser
		
		//Open URl
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
//		driver.findElement(By.xpath(".//*[@id='button1']")).click();
//
//		//Use of collections to store multiple windows
//		Set<String> handles = driver.getWindowHandles();
//
//		Iterator itr = handles.iterator();
//		String childwindow = null;
//		while (itr.hasNext()) {
//			childwindow = (String) itr.next();
//		}
//
//		driver.switchTo().window(childwindow);
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath(".//*[text()='BLOGS']")).click();
//		
//		driver.switchTo().window(parentBrowser);
//		driver.findElement(By.xpath("//*[text()='Alert Box']")).click();
//		driver.switchTo().alert().accept();
		System.out.println("Test Case One in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "Demo Windows for practicing Selenium Automation1";
		Assert.assertEquals(actualPageTitle, expectedPageTitle, "Iam done with Assertions");
		
		
		
//		if (actualPageTitle.equalsIgnoreCase(expectedPageTitle)){
//			System.out.println("Your test case passed");
//		} else System.out.println("Your test case failed");

	}
	
	@Test (invocationCount=100)
	public void registration(){
		
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println("Test Case two in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		
	}

}
