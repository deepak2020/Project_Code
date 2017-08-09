package pageMethod;

import java.io.IOException;

import commonMethods.Common_Methods;

public class Page_Methoods {
	
	public static void loginFunctionality() throws IOException{
		Common_Methods obj = new Common_Methods();
		
		obj.intializeBrowser();
		
		System.out.println("This is my URL "+ obj.getProperty("config.properties", "URL"));
		
		obj.openUrl(obj.getProperty("config.properties", "URL"));
		System.out.println("Got xpath "+ obj.getProperty("element.properties", "email_xpath"));
		
		obj.clickonElemennt(obj.getProperty("element.properties", "email_xpath"));
	}

}
