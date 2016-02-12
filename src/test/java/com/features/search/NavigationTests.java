package com.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.NavigationSteps;

@RunWith(SerenityRunner.class)
public class NavigationTests {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public NavigationSteps navigate;


	@Test
	public void navigate_between_tabs_in_left_menu(){
		navigate.open_page_and_maximize_window();
		navigate.click_apt_button();
		navigate.validate_apt_page();
		navigate.click_houses_button();
		navigate.validate_houses_page();
		navigate.click_commprop_button();
		navigate.validate_comm_page();
		navigate.click_lands_button();
		navigate.validate_lands_page();
		navigate.click_zone_button();
		navigate.validate_zone_page();
		navigate.click_docs_button();
		navigate.validate_docs_page();
		navigate.click_contact_button();
		navigate.validate_contact_page();
		navigate.click_about_button();
		navigate.validate_about_page();
		navigate.click_legal_button();
		navigate.validate_legal_page();
		navigate.click_home_button();
		navigate.validate_home_page();

	}

}



