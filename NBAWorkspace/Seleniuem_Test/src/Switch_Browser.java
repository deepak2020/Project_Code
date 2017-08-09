import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Switch_Browser {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.gmail.com");
		System.out.println(driver.getTitle());

		driver.findElement(By.linkText("Privacy")).click();

		ArrayList<String> al = new ArrayList<String>();
		al.addAll(driver.getWindowHandles());
		String parentWindow = al.get(0);
		String childWindow = al.get(1);

		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle="Gmail";
		Assert.assertEquals(ActualTitle.toUpperCase(), ExpectedTitle.toUpperCase());
		driver.switchTo().window(childWindow);
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());

	}

}
