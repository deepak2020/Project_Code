package Session_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysAction {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		WebElement next = driver.findElement(By.xpath("//*[@id='Email']"));
		next.sendKeys(Keys.TAB);
		next.sendKeys(Keys.ENTER);
		
		
		

	}

}
