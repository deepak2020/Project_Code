import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.jabong.com");
		
		WebElement hoverElement = driver.findElement(By.xpath("//*[@class='women-icon']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(hoverElement).build().perform();

	}

}
