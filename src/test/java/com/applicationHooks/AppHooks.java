package com.applicationHooks;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.utilities.ConfigReader;

import com.factory.driverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks {
 public static  Properties prop;
 public static Scenario scn;
 private WebDriver driver;

 @Before(order=0)
 public void getproperty() {
	ConfigReader cr = new ConfigReader();
    prop = cr.getProp();
 }
 @Before(order=1)
 public void initBrowser() {
	AppHooks.scn=scn;
	String bName = prop.getProperty("browserName");
	driverFactory df = new driverFactory();
    driver = df.init_driver(bName);
}
@After(order = 1)
public void TakeScreenShot(Scenario scn) {
  if (scn.isFailed()) {
	  String scnName = scn.getName().replaceAll(" ", "_");
 //  File f =	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   byte [] path = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
 // String str = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
  
   scn.attach(path, "image/png", scnName);
   scn.log("Failed");
  }
}
@After(order = 0)
public void TearDown() {

}
//@BeforeStep // @After Test


}
