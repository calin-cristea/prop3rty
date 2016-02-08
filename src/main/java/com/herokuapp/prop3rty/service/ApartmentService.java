package com.herokuapp.prop3rty.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.herokuapp.prop3rty.dao.BasePriceDAO;
import com.herokuapp.prop3rty.domain.Apartment;

public class ApartmentService {
	
	@Autowired
	private BasePriceDAO dao;
	
	public double evaluate(Apartment apt) {
		double finalPrice = getBasePrice() * apt.getArea() * apt.getThermalInsulation().value * apt.getCentralHeating().value * apt.getFinishing().value;
		return finalPrice;
		
	}
	
	private int getBasePrice() {
		return dao.getByAssetAndZone("ca");
	}
	
}
