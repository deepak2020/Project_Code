import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Selenium_Demo_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//Find email textbox location
		
		WebElement emailTextbox=  driver.findElement(By.id("email"));
		emailTextbox.click();
		emailTextbox.sendKeys("deepak2020rana@gmail.com");
		
		WebElement passwordTextbox=  driver.findElement(By.id("pass"));
		passwordTextbox.click();
		passwordTextbox.sendKeys("test@124");
		
		WebElement loginButton=  driver.findElement(By.id("loginbutton"));
		loginButton.click();
				
//		driver.close();

	}

}
