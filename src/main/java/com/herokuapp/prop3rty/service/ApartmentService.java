package com.herokuapp.prop3rty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.herokuapp.prop3rty.dao.AssetModelDao;
import com.herokuapp.prop3rty.domain.Apartment;

@Service
public class ApartmentService {
	
	@Autowired
	private AssetModelDao dao;
	
	public double evaluate(Apartment apt) {
		double finalPrice = dao.getByAssetAndZone(apt).getPrice()
				* apt.getArea() 
				* apt.getThermalInsulation().getValue() 
				* apt.getCentralHeating().getValue()
				* apt.getFinishing().getValue();
		return finalPrice;
				
	}
	
}
