package selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_one {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://store.demoqa.com/");
		
		driver.manage().window().maximize();
		
		WebElement product= driver.findElement(By.xpath(".//*[text()='Product Category']"));
		product.click();
		
//		
//		driver.findElement(By.className("gsfi")).click();
//		
//		driver.findElement(By.id("lst-ib")).sendKeys("Deepak");
//		
//		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
////		driver.close();
//		driver.quit();

	}

}
