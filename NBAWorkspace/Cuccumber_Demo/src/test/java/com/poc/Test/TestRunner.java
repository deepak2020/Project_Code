package com.poc.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = { "html:reports/cucumber-html-report",
"json:reports/cucumber.json", "pretty:reports/cucumber-pretty.txt", }, 
dryRun = false,
strict = true,
monochrome = true,
features = "C:\\Users\\deepak.kumar\\NBAWorkspace\\Cuccumber_Demo\\src\\test\\resources\\com\\poc\\HelloWorld\\", 
glue = { "com.poc.HelloWorldTest" },
tags = {"@regression"}
		)

public class TestRunner  extends AbstractTestNGCucumberTests {

}
