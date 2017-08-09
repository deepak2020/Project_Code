import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Find_Element {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("http://store.demoqa.com/");
		
		//Find Element by Name
//		driver.findElement(By.name("s")).sendKeys("I am hereo");
//		
//		//Find Element by ID
//		driver.findElement(By.id("menu-item-72")).click();
//		
//		//Find Element by class
//		driver.findElement(By.className("item")).click();
		
	
//		
		//Find Element by Tag Name
		driver.findElement(By.linkText("Product Category")).click();
		driver.findElement(By.tagName("button")).click();

//		driver.close();

	}

}
