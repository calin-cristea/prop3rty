package com.herokuapp.prop3rty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.herokuapp.prop3rty.dao.AssetModelDao;
import com.herokuapp.prop3rty.domain.House;

@Service
public class HouseService {
	
	@Autowired
	private AssetModelDao dao;
	
	public double evaluate(House house) {
		double finalPrice = dao.getByAssetAndZone(house).getPrice()
				* house.getArea() 
				* house.getCentralHeating().getValue()
				* house.getGas().getValue()
				* house.getRunningWater().getValue()
				* house.getRunningWater().getValue()
				* house.getFinishing().getValue();
		return finalPrice;
				
	}
	
}
