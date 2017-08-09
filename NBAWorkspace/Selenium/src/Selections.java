import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class Selections {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");

		WebElement elelment = driver.findElement(By.name("continents"));
		Select selection = new Select(elelment);
//		List<WebElement> elementCount = selection.getOptions();
//		System.out.println(elementCount.size());
//		selection.selectByValue("Asia");
		selection.selectByVisibleText("Africa");
		System.out.println(selection.getAllSelectedOptions().get(0).getText());

	}

}
