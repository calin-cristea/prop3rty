package com.herokuapp.prop3rty.service;

import java.text.DecimalFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.herokuapp.prop3rty.dao.AssetModelDao;
import com.herokuapp.prop3rty.domain.Apartment;
import com.herokuapp.prop3rty.domain.CentralHeating;
import com.herokuapp.prop3rty.domain.ThermalInsulation;

@Service
public class ApartmentService {

	@Autowired
	private AssetModelDao dao;

	public double evaluate(Apartment apt) {
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		double finalPrice = dao.getByAssetAndZone(apt).getPrice() * apt.getArea()
				* apt.getThermalInsulation().getValue() * apt.getCentralHeating().getValue()
				* apt.getFinishing().getValue();
		return Double.parseDouble(numberFormat.format(finalPrice));

	}

}
