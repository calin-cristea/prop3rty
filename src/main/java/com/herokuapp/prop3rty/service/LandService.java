package com.herokuapp.prop3rty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.herokuapp.prop3rty.dao.AssetModelDao;
import com.herokuapp.prop3rty.domain.Building;
import com.herokuapp.prop3rty.domain.Land;

@Service
public class LandService {
	
	@Autowired
	private AssetModelDao dao;
		
	/*public double evaluate(Land land) {
		double finalPrice = dao.getByAssetAndZone(land).getPrice()
				* land.getArea() 
				* land.getThermalInsulation().getValue() 
				* land.getCentralHeating().getValue()
				* land.getFinishing().getValue();
		return finalPrice;
				
	}*/
	
}
