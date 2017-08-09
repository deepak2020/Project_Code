package Session_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Session_1 {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver(); // opening browser 
		driver.navigate().to("https://www.facebook.com");
		
		driver.get("https://www.gmail.com");
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
//		Practice Exercise – 1
//
//		Launch a new Firefox browser.
//		Open Store.DemoQA.com
//		Get Page Title name and Title length
//		Print Page Title and Title length on the Eclipse Console.
//		Get Page URL and verify if the it is a correct page opened
//		Get Page Source (HTML Source code) and Page Source length
//		Print Page Length on Eclipse Console.
//		Close the Browser.
		
		

	}

}
