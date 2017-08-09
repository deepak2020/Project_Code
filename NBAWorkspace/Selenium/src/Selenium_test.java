import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Selenium_test {

	@Test
	public static void main(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com/");
		WebElement textbox = driver.findElement(By.xpath(".//*[@id='email']"));
		textbox.sendKeys("9028226275");
		WebElement password = driver.findElement(By.xpath(".//*[@id='pass']"));
		password.sendKeys("");
		WebElement Login = driver.findElement(By.xpath(".//*[@id='u_0_m']"));
		Login.click();	
	}
}
