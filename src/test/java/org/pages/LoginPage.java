package org.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaceUtility;

public class LoginPage extends BaceUtility {
	private WebDriver driver;
	//1. WebElements
	@FindBy(id="username")
	private WebElement userNameTxtField;
	
	@FindBy(css=".textField.pwdfield")
	private WebElement pwdTxtField;
	
	@FindBy(xpath="//a[@id='loginButton']/div")
	private WebElement loginBtn;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepMeLoginChkBox;
	
	@FindBy(css="#logoContainer img")
	private List<WebElement>loginPageLogos;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	@FindBy(css=".logoCell.navCell>div>div:last-child>img")
	private WebElement dashboardlogoes;
	
	//2. Constructor
	public LoginPage(WebDriver driver) {
		//PageFactory.initElements(driver, LoginPage.class);
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	//3. Page Action methods
	public void enterUserName(String uName) {
		userNameTxtField.sendKeys(uName);
	}
	public void enterPassword(String uName) {
		pwdTxtField.sendKeys(uName);
	}
	public void clickOnLoginBtn() {
		loginBtn.click();
		BaceUtility bu= new BaceUtility();
         bu.WaitForVisibilityElementByLocator(driver, 15, "id", "logoutLink");
	}

	
	 public void waitForLogoutLink() { 
		 //BaceUtility bu = BaceUtility();
	WaitForVisibilityElementByLocator(driver, 15, "id","logoutLink"); }
	 
	public boolean isUserNameFieldDisplayed() {
		
		return userNameTxtField.isDisplayed();
	}
	public boolean isPasswordFieldDisplayed() {
		return pwdTxtField.isDisplayed();
	}
	public boolean isKeepMeLoginChkBoxDisplayed() {
		return keepMeLoginChkBox.isDisplayed();
	}
	public boolean isLoginBtnDisplayed() {
		return  loginBtn.isDisplayed();
		 
	}
	public boolean isLoginPageLogosDisplayed() {
		boolean flag = true;
		for(int i=0; i<loginPageLogos.size(); i++) {
			if(!loginPageLogos.get(i).isDisplayed()) {
				return false;

			}
		}
		return true;
	}
	public boolean VerifyDashboardLogo() {
		waitForVisibilityOfElement(driver, 15, dashboardlogoes);	
		return dashboardlogoes.isDisplayed();
	}
	
}

