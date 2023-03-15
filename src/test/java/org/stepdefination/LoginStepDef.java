package org.stepdefination;

import org.openqa.selenium.WebDriver;
import org.pages.LoginPage;
import org.testng.Assert;
import org.utilities.ConfigReader;

import com.applicationHooks.AppHooks;
import com.factory.driverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
WebDriver driver ;
private ConfigReader cr = new ConfigReader();
private LoginPage lpobj = new LoginPage(driverFactory.getDriver());
@Given("User is on login page")	
public void User_is_on_login_page() {
	driverFactory df =new driverFactory();
	driverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
}
@Then("Username field is displayed")
  public void username_field_is_displayed() {
  Assert.assertTrue(lpobj.isUserNameFieldDisplayed());
	}
@Then("Password field is displyed")
  public void password_field_is_displyed() {
		Assert.assertTrue(lpobj.isPasswordFieldDisplayed());
}
@Then("Keep me login cheack box is displyed")
    public void keep_me_login_cheack_box_is_displyed() {
	Assert.assertTrue(lpobj.isKeepMeLoginChkBoxDisplayed());
	AppHooks.scn.log("keep Me Login CheckBox Is Displlayed");
}
@Then("Login button is displayed")
    public void login_button_is_displayed() {
		Assert.assertTrue(lpobj.isLoginBtnDisplayed());
		AppHooks.scn.log("Login Button Is Displayed");
}
@Then("Login logos are displayed")
    public void login_logos_are_displayed() {
	Assert.assertTrue(lpobj.isLoginPageLogosDisplayed());
	AppHooks.scn.log("login Logoes Are Displayed ");
}
@When("User enterd the Username")
    public void user_enterd_the_username() {
	lpobj.enterUserName(AppHooks.prop.getProperty("userName"));
}
@When("User Enter Password")
    public void user_enter_password() {
	lpobj.enterPassword(AppHooks.prop.getProperty("password"));
}
@When("User Clicks On Login button")
public void user_clicks_on_login_button() {
	lpobj.clickOnLoginBtn();
	lpobj.WaitForVisibilityElementByLocator(driver, 15, "id", "logoutLink");
	//lpobj.waitForVisibilityOfElement(driver, 10, "logoutLink");
	//lpobj.waitForVisibilityOfElement(driver, 10, "logoutLink");
}
/*
 * @Then("Dashboard Page is Displayed") public void
 * dashboard_page_is_displayed() {
 * Assert.assertTrue(lpobj.VerifyDashboardLogo()); }
 */
}
