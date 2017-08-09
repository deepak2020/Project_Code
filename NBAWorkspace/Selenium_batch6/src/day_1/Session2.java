package day_1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Session2 {
	
	@Test
	public void facebook() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println("Test Case One in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());

	}
	@Test
	public void facebook1() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		System.out.println("Test Case two in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
	}

}
