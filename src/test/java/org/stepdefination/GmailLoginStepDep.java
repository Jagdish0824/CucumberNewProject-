package org.stepdefination;

import org.openqa.selenium.WebDriver;
import org.utilities.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GmailLoginStepDep {
	WebDriver driver ;
	private ConfigReader cr = new ConfigReader();
	GmailLoginStepDep Gmp = new GmailLoginStepDep();
	@Given("User Is On Gmail Page")
	public void user_is_on_gmail_page() {
		
	}

	@When("User Enter THe Username")
	public void user_enter_t_he_username() {
	}

	@When("User Enter The PassWord")
	public void user_enter_the_pass_word() {
	}

	@When("user Clicks On Login button")
	public void user_clicks_on_login_button() {
	}

	@Then("Expected Url is {string};")
	public void expected_url_is(String string) {}

}
