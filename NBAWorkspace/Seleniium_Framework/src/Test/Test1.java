package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import pageMethod.Page_Methoods;

public class Test1 {

	@Test
	public void testLoginPage() throws IOException {
		Page_Methoods.loginFunctionality();
		
	}

}
