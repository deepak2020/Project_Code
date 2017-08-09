package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Common_Method {

	public String getValue(String FileName, String element) throws IOException {

		File file = new File(
				"C:\\Users\\deepak.kumar\\NBAWorkspace\\Selenium_Franework\\"+FileName);
		FileInputStream fileInput = new FileInputStream(file);

		Properties prop = new Properties();
		prop.load(fileInput);

		return (String) prop.get(element);

	}

}
