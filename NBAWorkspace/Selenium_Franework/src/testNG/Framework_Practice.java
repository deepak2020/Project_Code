package testNG;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framework_Practice extends Common_Method {


	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		Framework_Practice obj = new Framework_Practice();
		driver.get(obj.getValue("websites.properties","URL"));
		driver.get(obj.getValue("element.properties","URL"));

	}

}
