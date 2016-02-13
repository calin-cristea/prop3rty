package com.herokuapp.prop3rty.steps.serenity;

import org.junit.Assert;

import com.herokuapp.prop3rty.pages.RegisterPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class RegisterSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	
	RegisterPage registerPage;
	
	
	@Step
	public void open_propertyPage_and_maximize_window() {
	registerPage.open();
	getDriver().manage().window().maximize();
	}

	
	
	@Step
	public void click_myaccount_button() {
	registerPage.myaccount();
	waitABit(1000);
	}
	
	@Step
	public void click_register_button() {
	registerPage.register();
	waitABit(1000);
	}
	
	@Step
	public void fill_register_form (String email, String password, String passwordconfirm, String firstname, String lastname, String phone){
		registerPage.enter_email(email);
		registerPage.enter_password(passwordconfirm);
		registerPage.enter_password_confirm(passwordconfirm);
		registerPage.enter_first_name(firstname);
		registerPage.enter_last_name(lastname);
		registerPage.enter_phone(phone);
		waitABit(1000);
	}
	
	@Step
	public void click_submit(){
		registerPage.submit();
		waitABit(1000);
	}
	
	@Step
	 public void validate_test(){
	   RegisterPage.check_validation();
	 }
		
}
	