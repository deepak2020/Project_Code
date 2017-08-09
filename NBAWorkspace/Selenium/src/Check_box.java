import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Check_box {

	public static void main(String arg[]) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		WebElement element = driver.findElement(By.name("selenium_commands"));
		Select oSelect = new Select(element);
		oSelect.selectByVisibleText("Navigation Commands");
		oSelect.selectByIndex(1);

		ArrayList <WebElement>elementCount = (ArrayList<WebElement>) oSelect.getOptions();
		for (int i = 0; i < elementCount.size(); i++) {
			System.out.println(elementCount.get(i).getText().toString()
					);
		}

	}

}
