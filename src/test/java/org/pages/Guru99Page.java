package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99Page {
	WebDriver driver;
@FindBy(xpath="//a[@class='level0 ']")
private WebElement MblBtn;

@FindBy(xpath="//select[@title='Sort By']")
private WebElement ClkOnDropDownMenu;

// Constructor 
public Guru99Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver= driver;
}
//Initialization 
public String GetTitle() {
	return driver.getTitle();
}
public String TitleAfterClickOnMobileBtn() {
	return driver.getTitle();
}
public void ClickOnMobBtn () {
	MblBtn.click();
}
public void ClickOnDropDownButton() {
	ClkOnDropDownMenu.click();
}
public WebElement DrpDwnEle() {
	ClkOnDropDownMenu.click();
	return ClkOnDropDownMenu;
}

}
