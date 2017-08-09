$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HelloWorld.feature");
formatter.feature({
  "id": "check-addition-in-google-calculatorcontent",
  "tags": [
    {
      "name": "@regression",
      "line": 1
    }
  ],
  "description": " In order to verify that Google calculator work correctly\r\n As a user of Google\r\n I should be able to get correct addition result",
  "name": "Check addition in Google calculatorcontent",
  "keyword": "Feature",
  "line": 2
});
formatter.scenario({
  "id": "check-addition-in-google-calculatorcontent;addition",
  "description": "",
  "name": "Addition",
  "keyword": "Scenario",
  "line": 7,
  "type": "scenario"
});
formatter.step({
  "name": "I open Google",
  "keyword": "Given ",
  "line": 8
});
formatter.step({
  "name": "I enter \"2+2\" in search textbox",
  "keyword": "When ",
  "line": 9
});
formatter.step({
  "name": "I should get result as \"4\"",
  "keyword": "Then ",
  "line": 10
});
formatter.match({
  "location": "HelloWorldStepDefinition.I_open_google()"
});
formatter.result({
  "duration": 7118777018,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2+2",
      "offset": 9
    }
  ],
  "location": "HelloWorldStepDefinition.I_enter_in_search_textbox(String)"
});
formatter.result({
  "duration": 443771265,
  "status": "failed",
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"id\",\"selector\":\"gbqfq\"}\nCommand duration or timeout: 185 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b\u0027, time: \u00272016-03-15 16:57:40\u0027\nSystem info: host: \u0027MVTL1076LT\u0027, ip: \u0027192.168.15.1\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_67\u0027\n*** Element info: {Using\u003did, value\u003dgbqfq}\nSession ID: ac9eca22-2c68-4f46-b235-f1b92f401567\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{platform\u003dWINDOWS, acceptSslCerts\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, databaseEnabled\u003dtrue, browserName\u003dfirefox, handlesAlerts\u003dtrue, nativeEvents\u003dfalse, webStorageEnabled\u003dtrue, rotatable\u003dfalse, locationContextEnabled\u003dtrue, applicationCacheEnabled\u003dtrue, takesScreenshot\u003dtrue, version\u003d45.0}]\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:413)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat com.poc.HelloWorldTest.HelloWorldStepDefinition.I_enter_in_search_textbox(HelloWorldStepDefinition.java:37)\r\n\tat ✽.When I enter \"2+2\" in search textbox(HelloWorld.feature:9)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"id\",\"selector\":\"gbqfq\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b\u0027, time: \u00272016-03-15 16:57:40\u0027\nSystem info: host: \u0027MVTL1076LT\u0027, ip: \u0027192.168.15.1\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_67\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/Users/DEEPAK~1.KUM/AppData/Local/Temp/anonymous686614033852087386webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10770)\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElement(file:///C:/Users/DEEPAK~1.KUM/AppData/Local/Temp/anonymous686614033852087386webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10779)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///C:/Users/DEEPAK~1.KUM/AppData/Local/Temp/anonymous686614033852087386webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12661)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_(file:///C:/Users/DEEPAK~1.KUM/AppData/Local/Temp/anonymous686614033852087386webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12666)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.execute/\u003c(file:///C:/Users/DEEPAK~1.KUM/AppData/Local/Temp/anonymous686614033852087386webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12608)\r\n"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 24
    }
  ],
  "location": "HelloWorldStepDefinition.I_should_get_correct_result(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 3662594429,
  "status": "passed"
});
});