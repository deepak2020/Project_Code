import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckAndRadio_button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		driver.findElement(By.xpath(".//*[@id='sex-0']")).click();
		WebElement radioOption = driver.findElement(By
				.xpath(".//*[@id='sex-0']"));
		System.out.println(radioOption.getAttribute("value"));

		List<WebElement> radioButton = driver.findElements(By
				.xpath(".//*[@name='sex']"));

		boolean radioSelected = false;

		radioSelected = radioButton.get(0).isSelected();

		if (radioSelected = true) {
			radioButton.get(1).click();
		} else
			radioButton.get(0).click();
		
		for (int i =0; i<radioButton.size(); i++){
			System.out.println(radioButton.get(i).getAttribute("value"));
		}
	}
	
	

}
