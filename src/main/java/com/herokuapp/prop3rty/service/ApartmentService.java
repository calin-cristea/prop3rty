package com.herokuapp.prop3rty.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.herokuapp.prop3rty.dao.BasePriceDAO;
import com.herokuapp.prop3rty.domain.Apartment;

public class ApartmentService {
	
	@Autowired
	private BasePriceDAO dao;
	
	public double evaluate(Apartment apt) {
		return dao.getByAssetAndZone(apt).getPrice() * apt.getArea() * apt.getThermalInsulation().getValue() * apt.getCentralHeating().getValue() * apt.getFinishing().getValue();
				
	}
	
}
