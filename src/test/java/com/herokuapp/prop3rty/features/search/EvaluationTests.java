package com.herokuapp.prop3rty.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.herokuapp.prop3rty.steps.serenity.NavigationSteps2;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class EvaluationTests {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	NavigationSteps2 navigationSteps2;



	@Test
	public void add_to_card_using_quick_view_and_product_view() {
		navigationSteps2.open_home_page_and_maximize_window();
		navigationSteps2.click_apartments_button();
		navigationSteps2.click_sell_button();
		navigationSteps2.click_dropdown_for_zone();
		navigationSteps2.select_zona_centru();
		navigationSteps2.type_suprafata();
		navigationSteps2.select_isolation();
		navigationSteps2.click_dropdown_for_finishing();
		navigationSteps2.select_high_finishing();
		navigationSteps2.select_old();
		navigationSteps2.select_old2();
		navigationSteps2.select_heating();
		//navigationSteps2.select_heating2();
		navigationSteps2.click_dropdown_for_floor();
		navigationSteps2.select_second_floor();
		navigationSteps2.click_eval_button();
		navigationSteps2.click_eval_button2();

	}
}