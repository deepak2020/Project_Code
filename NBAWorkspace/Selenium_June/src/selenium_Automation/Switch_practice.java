package selenium_Automation;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switch_practice {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.gmail.com");
		
		
		 driver.findElement(By.xpath(".//*[text()='Privacy']")).click();
		
		 ArrayList<String> windows = new ArrayList<String>();
		 windows.addAll(driver.getWindowHandles());
		
		 String parentWindow = windows.get(0);
		 String childWindow = windows.get(1);
		
		 driver.switchTo().window(childWindow);
		
		 driver.switchTo().alert().dismiss();
		
		 System.out.println(driver.getTitle());

		Random random = new Random();
		int number = random.nextInt(1000);
		String randoms = String.format("%03d", number);
		String emailAddress = randoms+"@gmail.com";
				
			System.out.println(emailAddress);
		}
	}


