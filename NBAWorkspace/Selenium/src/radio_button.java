import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class radio_button {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		List <WebElement> oRadioButton = driver.findElements(By.name("sex"));
		
//		for(int i =0; i<oRadioButton.size(); i++){
//		WebElement elem = (WebElement) oRadioButton.get(i);
//		System.out.println(elem.getTagName());
//		
//		}
		
		boolean radioSelected;
		radioSelected = oRadioButton.get(0).isSelected();
		
		if (radioSelected = true){
			
			System.out.println(oRadioButton.get(1).getAttribute("value"));
			
			oRadioButton.get(1).click();
		} else 
			System.out.println(oRadioButton.get(1).getAttribute("value"));
			oRadioButton.get(0).click();
	}

}
