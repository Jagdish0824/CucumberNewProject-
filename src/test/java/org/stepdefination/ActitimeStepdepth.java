package org.stepdefination;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.WebDriver;
import org.pages.ActitimePage;
import org.testng.Assert;
import org.utilities.ConfigReader;

import com.applicationHooks.AppHooks;
import com.factory.driverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActitimeStepdepth {
WebDriver driver ;
private ConfigReader cr = new ConfigReader();
 ActitimePage obj = new ActitimePage (driverFactory.getDriver());
@Given("User Is On Login Page") 
public void user_is_on_login_page() {
	driverFactory df = new driverFactory();
	driverFactory.getDriver().get(AppHooks.prop.getProperty("acturl"));
}

@When("User Enters UserName")
public void user_enters_user_name() {
 obj.EnterPassWord(AppHooks.prop.getProperty("userName"));
// AppHooks.scn.log("User Enterd Usernem ");
}

@When("User Enters PassWord")
public void user_enters_pass_word() {
 obj.EnterPassWord(AppHooks.prop.getProperty("password"));
// AppHooks.scn.log("User Enterred PassWord");
}

@When("user Click on Login Button")
public void user_click_on_login_button() {
   obj.ClickOnLoginButton();
  // AppHooks.scn.log("User Click On Cliks Button");
}

@Then("Expected URL Should be {string};")
public void expected_url_should_be(String expurl) {
 Assert.assertEquals(driverFactory.getDriver().getCurrentUrl(), expurl);
}
}
