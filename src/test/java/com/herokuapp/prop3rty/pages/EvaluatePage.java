package com.herokuapp.prop3rty.pages;

import org.junit.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("http://prop3rty.herokuapp.com/")
public class EvaluatePage extends PageObject {


	@FindBy(css = "li a[href='/apartments']")
	private WebElementFacade apartmentsButton;

	public void apartments() {
		apartmentsButton.click();
	}	

	@FindBy(css = "div a[href='/apartments/apt_sell']")
	private WebElementFacade sellButton;

	public void sell() {
		sellButton.click();
	}

	@FindBy(css = "select#zone")
	private WebElementFacade zoneButton;

	public void click_dropdown_zone() {
		zoneButton.click();
	}

	@FindBy(css = "[value='centru']")
	private WebElementFacade centruButton;

	public void select_centru() {
		centruButton.click();
	}

	@FindBy(css = "input#area")
	private WebElementFacade inputSuprafata;

	public void enter_mp(){
		int count = 20;
		inputSuprafata.sendKeys(""+count);	
	}

	@FindBy(css = "input#isolation")
	private WebElementFacade checkIsolation;

	public void check_isolation(){
		checkIsolation.click();	
	}

	@FindBy(css = "select#finishing")
	private WebElementFacade finishingButton;

	public void click_dropdown_finishing() {
		finishingButton.click();
	}

	@FindBy(css = "[value='HIGH']")
	private WebElementFacade highButton;

	public void select_high() {
		highButton.click();
	}


	@FindBy(css = "input#old")
	private WebElementFacade checkOld;

	public void check_old(){
		checkOld.click();	
	}

	@FindBy(css = "input#old")
	private WebElementFacade checkOld2;

	public void check_old2(){
		checkOld.click();	
	}

	@FindBy(css = "input#heating")
	private WebElementFacade checkBox;

	public void check_heating(){
		checkBox.click();	
	}


	/*@FindBy(css = "input#heating")
	private WebElementFacade checkBox2;

	public void check_heating2(){
	checkBox.click();	
	}*/


	@FindBy(css = "select#floor")
	private WebElementFacade floorButton;

	public void click_dropdown_floor() {
		floorButton.click();
	}

	@FindBy(css = "[value='II']")
	private WebElementFacade secondfloorButton;

	public void select_floor() {
		secondfloorButton.click();
	}

	@FindBy(css = "div [name='eval']")
	private WebElementFacade evalButton;

	public void click_submit() {
		evalButton.click();

	}

	@FindBy(css = "div [name='eval']")
	private WebElementFacade evalButton2;

	public void click_submit2() {
		evalButton.click();

	}


}

