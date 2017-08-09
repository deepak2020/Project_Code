import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day_one {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 60);

		driver.get("https://www.google.com");

		WebElement element = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath(".//*[text()='Deepak']")));
		;
		element.click();
		element.sendKeys("Deepak");

	}

}
