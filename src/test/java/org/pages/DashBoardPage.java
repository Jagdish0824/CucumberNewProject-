package org.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaceUtility;

public class DashBoardPage extends BaceUtility {
	private WebDriver driver;
	//1. WebElements
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	@FindBy(css=".logoCell.navCell>div>div:last-child>img")
	private WebElement dashboardlogoes;
	
	@FindBy(css="td[class^='navItem navCell relative']>a>div:first-child")
	private List<WebElement> DashBoardTabs;
	
	//2. Constructor
	public DashBoardPage(WebDriver driver) {
		//PageFactory.initElements(driver, LoginPage.class);
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	//3. Page Action methods  
	
	public boolean VerifyDashboardLogo() {
		waitForVisibilityOfElement(driver, 15, dashboardlogoes);	
		return dashboardlogoes.isDisplayed();
	}
	/*public boolean VerifynoOfDashBoardTabs(int expTabsCount) {
		for(int i=0; i<DashBoardTabs.size(); i++) {
			if(!DashBoardTabs.get(i).isDisplayed()) {
				return false;

			}
		}
		return true;*/
		public int getNumberOfDashBoardTabs() {
			return DashBoardTabs.size();
		}
		}

