package com.cristeanet.prop3rty.domain;

public enum CentralHeating {
	YES (1.03),
	NO (0.97);
	
	double value;
	
	CentralHeating(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}
	
}
