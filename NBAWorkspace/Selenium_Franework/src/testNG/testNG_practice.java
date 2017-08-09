package testNG;

import java.util.logging.Logger;

import org.junit.AfterClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class testNG_practice {
	
//	private static Logger Log = Logger.getLogger(Log.class.getName());
	

	@Test (groups="Bus")
	public void testMethod() {
		System.out.println("I am bus");
		Reporter.log("I am goood");
	}

	@BeforeTest
	public void method1() {
		System.out.println("I am before test");
	}

	@AfterTest
	public void method2() {
		System.out.println("I am after test1");
	}

	@BeforeSuite
	public void method3() {
		System.out.println("I am Before suite");
	}

	@AfterSuite
	public void method4() {
		System.out.println("I am After suite");
	}

	@BeforeMethod
	public void method5() {
		System.out.println("I am Before method");
	}

	@AfterMethod
	public void method6() {
		System.out.println("I am After method");
	}

	@BeforeClass
	public void method7() {
		System.out.println("I am Before class");
	}
	
	@AfterClass
	public void method8() {
		System.out.println("I am After class");
	}
	
	@Test (groups="Car")

	public void method9() {
		System.out.println("I am Car");
	}

}
