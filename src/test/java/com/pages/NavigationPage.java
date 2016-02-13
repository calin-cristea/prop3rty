package com.pages;

import org.junit.Assert;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://prop3rty.herokuapp.com/")
public class NavigationPage extends PageObject {


	@FindBy(css = "li a[href='/apartments']")
	private WebElementFacade apartmentButton;

	public void click_aptButton() {
		apartmentButton.click();
	}

	@FindBy(css = "div a[href='/apartments/apt_sell']")
	private static WebElementFacade validateApt;

	public static void aptPage_validation() {
		System.out.println("Textul este:" + validateApt.getText());
		Assert.assertEquals("VANZARE", validateApt.getText());
	}

	@FindBy(css = "li a[href='/houses']")
	private WebElementFacade housesButton;

	public void click_houseButton() {
		housesButton.click();
	}

	@FindBy(css = "div a[href='houses/house_sell']")
	private static WebElementFacade validateHouses;

	public static void housesPage_validation() {
		System.out.println("Textul este:" + validateHouses.getText());
		Assert.assertEquals("VANZARE", validateHouses.getText());
	}


	@FindBy(css = "li a[href='/comm']")
	private WebElementFacade commpropButton;

	public void click_commpropButton() {
		commpropButton.click();
	}

	@FindBy(css = "div a[href='/comm/comm_sell']")
	private static WebElementFacade validateComm;

	public static void commPage_validation() {
		System.out.println("Textul este:" + validateComm.getText());
		Assert.assertEquals("VANZARE", validateComm.getText());
	}

	@FindBy(css = "li a[href='/lands']")
	private WebElementFacade landsButton;

	public void click_landsButton() {
		landsButton.click();
	}

	@FindBy(css = "div a[href='land_sell.html']")
	private static WebElementFacade validateLands;

	public static void landsPage_validation() {
		System.out.println("Textul este:" + validateLands.getText());
		Assert.assertEquals("VANZARE", validateLands.getText());
	}


	@FindBy(css = "li a[href='/zone']")
	private WebElementFacade zoneButton;

	public void click_zoneButton() {
		zoneButton.click();
	}

	@FindBy(css = "div a[href='/zone']")
	private static WebElementFacade validateZone;

	public static void zonePage_validation() {
		System.out.println("Textul este:" + validateZone.getText());
		Assert.assertEquals("ZONE", validateZone.getText());
	}

	@FindBy(css = "li a[href='/docs']")
	private WebElementFacade docsButton;

	public void click_docsButton() {
		docsButton.click();
	}

	@FindBy(css = "li a[href='/docs']")
	private static WebElementFacade validateDocs;

	public static void docsPage_validation() {
		System.out.println("Textul este:" + validateDocs.getText());
		Assert.assertEquals("DOCUMENTATIE", validateDocs.getText());
	}

	@FindBy(css = "li a[href='/contact']")
	private WebElementFacade contactButton;

	public void click_contactButton() {
		contactButton.click();
	}

	@FindBy(css = "div h1")
	private static WebElementFacade validateContact;

	public static void contactPage_validation() {
		System.out.println("Textul este:" + validateContact.getText());
		Assert.assertEquals("CONTACT", validateContact.getText());
	}

	@FindBy(css = "li a[href='/about']")
	private WebElementFacade aboutButton;

	public void click_aboutButton() {
		aboutButton.click();
	}

	@FindBy(css = "span.bold")
	private static WebElementFacade validateAbout;

	public static void aboutPage_validation() {
		System.out.println("Textul este:" + validateAbout.getText());
		Assert.assertEquals("Prop3rty", validateAbout.getText());
	}                

	@FindBy(css = "li a[href='/legal']")
	private WebElementFacade legalButton;

	public void click_legalButton() {
		legalButton.click();
	}

	@FindBy(css = "div img[src='/images/courthouse.png']")
	private static WebElementFacade validateLegal;

	public static void legalPage_validation() {
		System.out.println("Textul este:" + validateLegal.getText());
		Assert.assertEquals("", validateLegal.getText());
	} 

	@FindBy(css = "p.title")
	private WebElementFacade homeButton;

	public void click_homeButton() {
		homeButton.click();
	}

	@FindBy(css = "div img[src='/images/avram_iancu.jpg']")
	private static WebElementFacade validateHome;

	public static void homePage_validation() {
		System.out.println("Textul este:" + validateHome.getText());
		Assert.assertEquals("", validateHome.getText());
	} 

}