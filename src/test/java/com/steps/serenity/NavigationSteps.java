package com.steps.serenity;

import com.pages.NavigationPage;
import com.pages.RegisterPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NavigationSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;

	NavigationPage navigationPage;


	@Step
	public void open_page_and_maximize_window(){
		navigationPage.open();
		getDriver().manage().window().maximize();
	}

	@Step
	public void click_apt_button(){
		navigationPage.click_aptButton();
	}

	@Step
	public void validate_apt_page(){
		NavigationPage.aptPage_validation();
	}


	@Step
	public void click_houses_button(){
		navigationPage.click_houseButton();
	}

	@Step
	public void validate_houses_page(){
		NavigationPage.housesPage_validation();
	}

	@Step
	public void click_commprop_button(){
		navigationPage.click_commpropButton();
	}

	@Step
	public void validate_comm_page(){
		NavigationPage.commPage_validation();
	}

	@Step
	public void click_lands_button(){
		navigationPage.click_landsButton();
	}

	@Step
	public void validate_lands_page(){
		NavigationPage.landsPage_validation();
	}

	@Step
	public void click_zone_button(){
		navigationPage.click_zoneButton();
	}

	@Step
	public void validate_zone_page(){
		NavigationPage.zonePage_validation();
	}

	@Step
	public void click_docs_button(){
		navigationPage.click_docsButton();
	}

	@Step
	public void validate_docs_page(){
		NavigationPage.docsPage_validation();
	}

	@Step
	public void click_contact_button(){
		navigationPage.click_contactButton();
	}

	@Step
	public void validate_contact_page(){
		NavigationPage.contactPage_validation();
	}

	@Step
	public void click_about_button(){
		navigationPage.click_aboutButton();
	}

	@Step
	public void validate_about_page(){
		NavigationPage.aboutPage_validation();
	}

	@Step
	public void click_legal_button(){
		navigationPage.click_legalButton();
	}

	@Step
	public void validate_legal_page(){
		NavigationPage.legalPage_validation();
	}

	@Step
	public void click_home_button(){
		navigationPage.click_homeButton();
	}

	@Step
	public void validate_home_page(){
		NavigationPage.homePage_validation();
	}
}


