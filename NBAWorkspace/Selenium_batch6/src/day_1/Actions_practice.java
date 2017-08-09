package day_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actions_practice {

	public static void main(String[] args) {
		
		String element = "{\"application_detail\":{\"application_name\":\"aptitudelabs\",\"application_description\":\"Description of Application if there\"}";
		System.out.println(element);
				
//		WebDriver driver = new FirefoxDriver();
//		
//		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
//		driver.findElement(By.xpath("search")).sendKeys("Deepak");
//		driver.findElement(By.xpath("search")).sendKeys(Keys.INSERT);
//		
//		
//		
//		driver.manage().window().maximize();
//		 
//		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//		 
//		
//		WebElement From = driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
//		WebElement To = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
//			
//		Actions builder = new Actions(driver);
//		
//		Action dragAndDrop = (Action) builder.clickAndHold(From).moveToElement(To).release().build();
//		dragAndDrop.perform();

	}

}
