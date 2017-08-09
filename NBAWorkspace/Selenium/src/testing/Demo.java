package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.id("gs_htif0")).click();
		driver.findElement(By.id("lst-ib")).sendKeys("test");

	}

}
