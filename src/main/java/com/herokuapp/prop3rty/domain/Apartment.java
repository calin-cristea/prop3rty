package com.herokuapp.prop3rty.domain;

public class Apartment extends Building {
	private Floor floor;
	private double finalPrice;
		
	public double evaluate() {
		this.finalPrice = getBasePrice() * getArea() * getThermalInsulation().value * getCentralHeating().value * getFinishing().value;
		return finalPrice;
		
	}
}
