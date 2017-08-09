import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium_Demo {
	String username = "Admin";
	String password = "admin";

	@Test
	public void main() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com/");

		// // Finding element by ID
		WebElement namebox = driver.findElement(By.id("txtUsername"));
		namebox.sendKeys(username);

		// Finding element by name
		WebElement passwordbox = driver.findElement(By.name("txtPassword"));
		passwordbox.sendKeys(password);
		//
		// //Finding element by classname
		// driver.findElement(By.className("ui-widget-content")).sendKeys("DeepakTest");
		//
		// //Finding element by tagname
		// driver.findElement(By.tagName("input"));

		// Finding element by link text
		// driver.findElement(By.linkText("OrangeHRM, Inc")).click();

		// Clicking button
		WebElement LoginButton = driver.findElement(By.name("Submit"));
		LoginButton.click();
		// driver.findElement(By.id("spanMessage"));

		// Verify element
		WebElement Dashboard =driver.findElement(By.id("menu_dashboard_index"));
		
		String URL = driver.getCurrentUrl();
		
		//Get Page title
		
		String pagetitle = driver.getTitle();
		System.out.println("Page title is   " +pagetitle);

		System.out.println("Your current URL is  " + URL );
		// close browser
		driver.close();

	}

}
