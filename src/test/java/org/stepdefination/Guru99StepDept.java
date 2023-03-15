package org.stepdefination;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pages.Guru99Page;
import org.testng.AssertJUnit;

import com.applicationHooks.AppHooks;
import com.factory.driverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Guru99StepDept {
	Guru99Page pg = new Guru99Page(driverFactory.getDriver());
	@Given("User Is On Home Page")
	public void user_is_on_home_page() {
	 driverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
	}

	@Then("Verify The Title OF Page As {string}")
	public void verify_the_title_of_page_as(String expTitle) {
    AssertJUnit.assertEquals(pg.GetTitle(), expTitle);
	}

	@When("User Click On Mobile Field")
	public void user_click_on_mobile_field() {
	pg.ClickOnMobBtn();
	}

	@Then("Title Should Be Displyed As {string}")
	public void title_should_be_displyed_as(String expTitle) {
	AssertJUnit.assertEquals(pg.TitleAfterClickOnMobileBtn(), expTitle);
	}

	@When("User Click On DropDown")
	public void user_click_on_drop_down() {
    pg.ClickOnDropDownButton();
	}

	@Then("Verify The Sorting Oder")
	public void verify_the_sorting_oder() {
    Select sel = new Select(pg.DrpDwnEle());
    List<WebElement> alloptions =sel.getOptions();
    for (int i=0;i<alloptions.size();i++) {
    	System.out.println(alloptions.get(i).getText());
    }
    
	}

}
