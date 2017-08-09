package testing;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();

		String URL = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";

		driver.get(URL);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		WebElement from = driver
				.findElement(By
						.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td[2]/table/tbody/tr/td[4]/span"));
		WebElement t0 = driver
				.findElement(By
						.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.clickAndHold(from).moveToElement(t0)
				.release().build();
		dragAndDrop.perform();

		File screenshot = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		FileUtils
				.copyFile(
						screenshot,
						new File(
								"C:\\Users\\deepak.kumar\\Desktop\\SCreenshots\\screenshot.jpg"));
		System.out.print("Screenshot is captured and stored in your D: Drive");

	}

}
