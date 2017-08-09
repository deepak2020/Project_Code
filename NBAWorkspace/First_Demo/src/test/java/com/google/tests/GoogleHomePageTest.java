package com.google.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleHomePageTest {
	WebDriver driver;
	
	@BeforeTest
	public void setup(){
		driver = new FirefoxDriver();
	}
	
	@Test
	public void verifyGooglePageTitle(){
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void closeBrowser(){
		driver.close();
	}

}
