import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		List <WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		for (int i =0; i<allLinks.size(); i++){
			System.out.println(allLinks.get(i).getAttribute("href"));
		}
		
		ArrayList add = (ArrayList) driver.findElement(By.tagName("a"));
		System.out.println(add.size());
		
		Iterator<WebElement> itr = add.iterator();
		 while(itr.hasNext()){
			 System.out.println(itr.next().getAttribute("href"));
		 }
	}
}
