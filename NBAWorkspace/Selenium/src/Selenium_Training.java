import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Selenium_Training {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\vthaduri\\workspace\\LDCSuite\\IEDriverServer.exe"); 
//		WebDriver driver1 = new ChromeDriver();
//		WebDriver driver2= new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jabong.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		WebElement women = driver.findElement(By.className("nav-women"));
//		women.click();
//		WebElement search = driver.findElement(By.tagName("input"));
//		search.sendKeys("shoes");
//		WebElement seearchButton= driver.findElement(By.xpath(".//*[@id='top-search-input']/div[1]"));
//		seearchButton.click();
		
		driver.findElement(By.linkText("Shoes")).click();
		
//		driver.close();
		
	}

}
