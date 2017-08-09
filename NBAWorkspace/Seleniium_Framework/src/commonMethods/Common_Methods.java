package commonMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common_Methods {
	WebDriver driver;

	public void intializeBrowser() {
		driver = new FirefoxDriver();
	}

	public void openUrl(String URL) {
		driver.navigate().to(URL);
	}

	public void clickonElemennt(String element) {
		driver.findElement(By.xpath(element)).click();

	}

	public String getProperty(String FileName, String element) throws IOException {

		File file = new File(
				"C:\\Users\\deepak.kumar\\NBAWorkspace\\Seleniium_Framework\\"+FileName+"");
		FileInputStream fileInput = new FileInputStream(file);

		Properties prop = new Properties();
		prop.load(fileInput);
		String URL = (String) prop.get(element);
		return URL;

	}

}
