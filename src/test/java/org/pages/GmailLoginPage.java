package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaceUtility;

public class GmailLoginPage extends BaceUtility {
private WebDriver driver;
//Webelement 
@FindBy(id="email")
private WebElement UserNameFiled;

@FindBy(xpath="//input[@type=\"password\"]")
private WebElement passwordField;

@FindBy(xpath="//button[@value=\"1\"]")
private WebElement LoginBtn;

//Constructor 
public GmailLoginPage(WebDriver driver) {
	PageFactory.initElements(driver , this);
	this.driver=driver;;
}

//Intialization 
public boolean VerifyUserNameFieldIsDisplyed (){
return UserNameFiled.isDisplayed();
}
public boolean VerifyPasswordFldISDisplyed() {
	return passwordField.isDisplayed();
}
public boolean VerifyLoginBtnIsDisplyed() {
	return LoginBtn.isDisplayed();
}
}
