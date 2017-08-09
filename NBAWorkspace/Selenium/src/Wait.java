import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		// driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(
				"deepak2017rana@gmail.com");
		driver.findElement(By.xpath(".//*[@id='next']")).click();
	
		
		WebElement element;
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Passwd1']")));
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("test@124");

	}

}
