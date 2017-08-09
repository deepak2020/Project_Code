import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.jabong.com");

		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By
				.xpath(".//*[@class='nav-women']"));

		action.moveToElement(element).build().perform();

	}
}
