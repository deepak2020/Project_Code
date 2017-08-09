import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid {

	public static void main(String[] args) throws MalformedURLException {

		URL url = new URL(
				"http://pyneema:dd01d1a4-ffc5-4db3-ab46-e591492aedbf@ondemand.saucelabs.com:80/wd/hub");

		// URL url = new URL ("http://192.168.0.109:4444/wd/hub");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		// capabilities.setBrowserName("firefox");
		capabilities.setCapability("name", "test_today");
		capabilities.setVersion("45");
		capabilities.setPlatform(Platform.LINUX);

		WebDriver driver = new RemoteWebDriver(url, capabilities);
		driver.get("https://www.facebook.com");
	}

}
