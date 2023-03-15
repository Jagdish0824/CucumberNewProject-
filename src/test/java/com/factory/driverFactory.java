 
package com.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverFactory {
	public static ThreadLocal<WebDriver> tldriver = 
			           new ThreadLocal<WebDriver>();
  public WebDriver init_driver(String bName) {
	  if (bName.equalsIgnoreCase("ch") || bName.equalsIgnoreCase("Chrome")) {
          System.setProperty("webdriver.chrome.driver","E:\\accelaration9march\\April_18_Selenium\\Cucumber_practice\\Drivers\\chromedriver.exe");	
           ChromeOptions options = new ChromeOptions();//Drivers/chromedriver.exe
         // driver.manage().window().maximize(); 
		 // options.addArguments("start-maximized");
		//  driver = new ChromeDriver(options);     // open browser
		   tldriver.set(new ChromeDriver(options));
	   }else if (bName.equalsIgnoreCase("Edge")|| bName.equalsIgnoreCase(bName)) {
          System.setProperty("webdriver.gecko.driver","");	
				//ChromeOptions options  = new ChromeOptions();
				//options.addArguments("start-maximized");
		       //driver = new EdgeDriver();
               tldriver.set(new FirefoxDriver());
               getDriver().manage().window().maximize();
				
			}else if (bName.equalsIgnoreCase("ff")|| bName.equalsIgnoreCase("FireFox")) {
		        System.setProperty("webdriver.Firefox.driver","");	
			//	ChromeOptions options = new ChromeOptions();
			//	options.addArguments("start-maximized");
			//	driver = new FirefoxDriver();
		        tldriver.set(new EdgeDriver());
		        getDriver().manage().window().maximize();
			
			}else {
				System.out.println("invalid browser");
			}
	  getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   
	
	
	return getDriver();
}
  public static synchronized  WebDriver getDriver() {
	  return tldriver.get();
  }
}
