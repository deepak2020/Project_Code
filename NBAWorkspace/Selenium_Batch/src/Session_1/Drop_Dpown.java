package Session_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Dpown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		//Find the drowdonw arrow element
		WebElement dropdownElement = driver.findElement(By.xpath(".//*[@id='selenium_commands']"));
		
		Select selection = new Select(dropdownElement);

		for (int i=0; i<=4; i++){
		System.out.println(selection.getOptions().get(i).getText());
		}

	}

}
