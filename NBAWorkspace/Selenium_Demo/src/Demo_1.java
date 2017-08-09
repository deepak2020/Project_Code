import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class Demo_1 {
	
	public static void main (String args []) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.jabong.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[text()='Sign In']")).click();
		
		driver.findElement(By.xpath(".//*[@id='login-email']")).sendKeys("deepak2020rana@gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='login-pwd']")).sendKeys("test@124");
		
		driver.findElement(By.xpath(".//*[@id='btn-login']")).click();
		
		driver.wait(10);
		
		String actual = driver.findElement(By.xpath(".//*[@id='top-error']//*[@class='error-message']")).getText();
		String expected = "Incorrect username or password.";
		Assert.assertEquals(actual, expected);
	
		
	}

}
