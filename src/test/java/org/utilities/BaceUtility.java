package org.utilities;

import java.time.Duration;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaceUtility {
	public boolean IsAlertPresent (WebDriver driver, int time ) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
			wait.until(ExpectedConditions.alertIsPresent());
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	
	public void ClickByJS(WebDriver driver, WebElement ele ) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
	}
	public void ScrollByJS(WebDriver driver, WebElement ele) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
	}
	
	public void ScrollByPageDown(WebDriver driver, int numofscrolls) {
		WebElement ele = driver.findElement(By.tagName("body"));
		for (int i=1;i<numofscrolls;i++ ) {
			ele.sendKeys(Keys.PAGE_DOWN);
		}
		
	}
	public void WaitForVisibilityElementByLocator(WebDriver driver, int time,String type, String expression) {
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		switch(type) {
		case"id": wt.until(ExpectedConditions.visibilityOfElementLocated(By.id(expression)));
		break;
		case"xpath":wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(expression)));
		break;
		case"css":wt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(expression)));
		break;
		case"tagName":wt.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(expression)));
		break;
		case"Linkedtext":wt.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(expression)));
		break;
		}
		}

		/*
		 * public void WaitForAtributeContains(WebDriver driver, int time, String type,
		 * String expression ,String attName, String attValue ) { WebDriverWait wt = new
		 * WebDriverWait(driver, Duration.ofSeconds(time));
		 * wt.until(ExpectedConditions.attributeContains(By.xpath(expression), attName,
		 * attValue)); switch(type) { case"xpath":
		 * wt.until(ExpectedConditions.attributeContains(By.xpath(expression), attName,
		 * attValue)); break;
		 * case"id":wt.until(ExpectedConditions.attributeContains(By.id(expression),
		 * attName, attValue)); break;
		 * case"css":wt.until(ExpectedConditions.attributeContains(By.cssSelector(
		 * expression), attName, attValue)); } }
		 */
			public void WaitForAtributeContains(WebDriver driver, int time, WebElement ele, String attributeName, String attvalue) {
				WebDriverWait wt = new WebDriverWait(driver , Duration.ofSeconds(time));
				wt.until(ExpectedConditions.attributeContains(ele, attributeName, attvalue));
			
			}
			public void waitForVisibilityOfElement(WebDriver driver, int time, WebElement ele) {
				WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
				wt.until(ExpectedConditions.visibilityOf(ele));
		
			}
	 WebDriver driver= null;
	// ChromeDriver driverCh= null;
      public WebDriver Startup(String browsername, String url) {
	   if (browsername.equalsIgnoreCase("ch") || browsername.equalsIgnoreCase("Chrome")) {
           System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");	
           ChromeOptions options = new ChromeOptions();
          // driver.manage().window().maximize(); 
		   options.addArguments("start-maximized");
		   driver = new ChromeDriver(options);     // open browser
		   
	   }else if (browsername.equalsIgnoreCase("Edge")|| browsername.equalsIgnoreCase(browsername)) {
           System.setProperty("webdriver.gecko.driver","");	
				ChromeOptions options  = new ChromeOptions();
				options.addArguments("start-maximized");
				driver = new EdgeDriver();
				
			}else if (browsername.equalsIgnoreCase("ff")|| browsername.equalsIgnoreCase("FireFox")) {
		        System.setProperty("webdriver.Firefox.driver","");	
				ChromeOptions options = new ChromeOptions();
				options.addArguments("start-maximized");
				driver = new FirefoxDriver();
			
			}else {
				System.out.println("invalid browser");
			}
	    //upto selenium 3 Strictly
	    //  WebDriverWait wt = new WebDriverWait(driver, 30);
	    // selenium 4 onwords
	   // WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(15));
	   // wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']"))));
	    // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	      driver.get(url);   // to get url
	  // driver.manage().window().maximize();   // to maximied Window
	  // driver.manage().window().setSize(new Dimension(200,250));  // to set dimention 
	  //	 driver.manage().window().minimize();
	     
		 return driver;
	}
      public WebDriver StartupWm(String browsername, String url) {
   	   if (browsername.equalsIgnoreCase("ch") || browsername.equalsIgnoreCase("Chrome")) {
   	//	WebDriverManager.chromedriver().setup();
   		   ChromeOptions options = new ChromeOptions();
   		  // options.addArguments("start-maximized");
   		   driver = new ChromeDriver(options);     // open browser
   		   
   	   }else if (browsername.equalsIgnoreCase("Edge")|| browsername.equalsIgnoreCase(browsername)) {
             // System.setProperty("webdriver.gecko.driver","");
        //      WebDriverManager.edgedriver().setup();

   				ChromeOptions options  = new ChromeOptions();
   				options.addArguments("start-maximized");
   				driver = new EdgeDriver();
   				
   			}else if (browsername.equalsIgnoreCase("ff")|| browsername.equalsIgnoreCase("FireFox")) {
   		        System.setProperty("webdriver.Firefox.driver","");	
   				ChromeOptions options = new ChromeOptions();
   				options.addArguments("start-maximized");
   				driver = new FirefoxDriver();
   			
   			}else {
   				System.out.println("invalid browser");
   			}    
   	   return driver;
} 
}