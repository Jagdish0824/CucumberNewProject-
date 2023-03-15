package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimePage {
 WebDriver driver;
// Webelemnt 
 @FindBy(id ="username")
 private WebElement UserNameField;
 
 @FindBy(xpath="//input[@type='password']")
 private WebElement PwdField;
 
 @FindBy(id="loginButton")
 private WebElement LgnBtn;
 

 public ActitimePage(WebDriver driver) {
	 PageFactory.initElements(driver,this);
	 this.driver= driver;
	 }
 
// Page Action Method 
  public void EnterUserName (String uname) {
	  UserNameField.sendKeys(uname);
  }
  public void EnterPassWord(String password) {
	  PwdField.sendKeys(password);
	  
  }
  public void ClickOnLoginButton () {
	  LgnBtn.click();
  }
}
