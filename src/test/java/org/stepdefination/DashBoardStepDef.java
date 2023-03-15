package org.stepdefination;

import org.openqa.selenium.WebDriver;
import org.pages.DashBoardPage;
import org.pages.LoginPage;
import org.testng.Assert;
import org.utilities.ConfigReader;

import com.factory.driverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashBoardStepDef {
WebDriver driver ;
private ConfigReader cr = new ConfigReader();
private LoginPage lpobj = new LoginPage(driverFactory.getDriver());
private DashBoardPage dpobj = new DashBoardPage(driverFactory.getDriver());
@Then("Dashboard Page is Displayed")
public void dashboard_page_is_displayed() {
Assert.assertTrue(dpobj.VerifyDashboardLogo());
}

@Then("Dashboard Url is {string}")
public void dashboard_url_is(String expurl) {
Assert.assertEquals(driverFactory.getDriver().getCurrentUrl(), expurl);
}

@Then("Dashboard Title is {string}")
public void dashboard_title_is(String exptitle) {
 Assert.assertEquals(driverFactory.getDriver().getTitle(), exptitle);
}

@Then("Dashboard Displayed {int} tabs")
public void dashboard_displayed_tabs(Integer expTabsCount) {
 //Assert.assertEquals(dpobj.getNumberOfDashBoardTabs(expTabsCount), expTabsCount);
  Assert.assertEquals(dpobj.getNumberOfDashBoardTabs(), expTabsCount);
}

}
