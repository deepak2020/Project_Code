package Session_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_Selection {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
//		driver.findElement(By.cssSelector("input[id='tool-1']")).click();;
		
		driver.findElement(By.xpath("//input[type='radio']/[3]"));
		
		
		
		
		
		
			
		

//		List<WebElement> profession = driver
//				.findElements(By.name("profession")); // Creating list of
//														// profession
//
//		for (int i = 0; i < profession.size(); i++) { // /For loop to iterate
//														// through list
//
//			if ((profession.get(i).getAttribute("value"))
//					.equalsIgnoreCase("Automation Tester")) { // If conditon to
//																// check if the
//																// attribute
//																// value matches
//																// the required
//																// condition.
//				System.out.println(profession.get(i));
//				profession.get(i).click(); // / If matched click on the
//											// particular web element.
//			}
//		}

	}

}

// Practice Exercise

// Launch new Browser
// Open “http://toolsqa.wpengine.com/automation-practice-form/“
// Challenge One – Select the deselected Radio button (female) for category Sex
// (Use IsSelected method)
// Challenge Two – Select the Third radio button for category ‘Years of Exp’
// (Use Id attribute to select Radio button)
// Challenge Three – Check the Check Box ‘Automation Tester’ for category
// ‘Profession'( Use Value attribute to match the selection)
// Challenge Four – Check the Check Box ‘Selenium IDE’ for category ‘Automation
// Tool’ (Use cssSelector)
//
