package com.herokuapp.prop3rty.steps.serenity;

import com.herokuapp.prop3rty.pages.EvaluatePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NavigationSteps2 extends ScenarioSteps {

	private static final long serialVersionUID = 1L;


	EvaluatePage evaluatePage;

	@Step
	public void open_home_page_and_maximize_window() {
		evaluatePage.open();
		getDriver().manage().window().maximize();
	}

	@Step
	public void click_apartments_button(){
		evaluatePage.apartments();
	}

	@Step
	public void click_sell_button(){
		evaluatePage.sell();
	}

	@Step
	public void click_dropdown_for_zone(){
		evaluatePage.click_dropdown_zone();
	}

	@Step
	public void select_zona_centru(){
		evaluatePage.select_centru();
	}

	@Step
	public void type_suprafata(){
		evaluatePage.enter_mp();
	}

	@Step
	public void select_isolation(){
		evaluatePage.check_isolation();
	}

	@Step
	public void click_dropdown_for_finishing(){
		evaluatePage.click_dropdown_finishing();
	}

	@Step
	public void select_high_finishing(){
		evaluatePage.select_high();
	}

	@Step
	public void select_old(){
		evaluatePage.check_old();
	}

	@Step
	public void select_old2(){
		evaluatePage.check_old2();
	}

	@Step
	public void select_heating(){
		evaluatePage.check_heating();
	}

	/*@Step
	public void select_heating2(){
		evaluatePage.check_heating2();
	}*/



	@Step
	public void click_dropdown_for_floor(){
		evaluatePage.click_dropdown_floor();
	}

	@Step
	public void select_second_floor(){
		evaluatePage.select_floor();
	}

	@Step
	public void click_eval_button(){
		evaluatePage.click_submit();
		waitABit(2000);
	}

	@Step
	public void click_eval_button2(){
		evaluatePage.click_submit2();
		waitABit(2000);
	}

}

