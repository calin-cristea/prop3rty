package com.pages;

import org.junit.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://prop3rty.herokuapp.com/")
public class RegisterPage extends PageObject {

	
	@FindBy(css = "div img[src='/images/user_icon.png']")
	private WebElementFacade myaccountButton;

	
	public void myaccount() {
		myaccountButton.click();
	}
	
	@FindBy(css = "div a[href='/register']")
	private WebElementFacade registerButton;

	public void register() {
		registerButton.click();
	}

	
	@FindBy(css = "input#email")
	private WebElementFacade inputEmail;

	public void enter_email(String email) {
		inputEmail.type(email);
	}

	
	@FindBy(css = "input#password")
	private WebElementFacade inputPassword;

	public void enter_password(String password) {
		inputPassword.type(password);
	}

	
	@FindBy(css = "input#password-confirm")
	private WebElementFacade inputPasswordConfirm;

	public void enter_password_confirm(String passwordconfirm) {
		inputPasswordConfirm.type(passwordconfirm);
	}

	
	@FindBy(css = "input#firstname")
	private WebElementFacade inputFirstname;

	public void enter_first_name(String firstname) {
		inputFirstname.type(firstname);
	}

	
	@FindBy(css = "input#lastname")
	private WebElementFacade inputLastname;

	public void enter_last_name(String lastname) {
		inputLastname.type(lastname);
	}

	
	@FindBy(css = "input#phone")
	private WebElementFacade inputPhone;

	public void enter_phone(String phone) {
		inputPhone.type(phone);
	}

	
	@FindBy(name = "submit")
	private WebElementFacade submitButton;

	public void submit() {
		submitButton.click();
	}
	
	
	@FindBy(xpath = "html/body/h1")
	private static WebElementFacade validateTest;
	 
	public static void check_validation() {
	System.out.println("Textul este:" + validateTest.getText());
	Assert.assertEquals("Whitelabel Error Page", validateTest.getText());
    }

}
	

