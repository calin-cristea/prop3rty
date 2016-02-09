package com.herokuapp.prop3rty.domain;

public enum CentralHeating {
	YES (0.03),
	NO (-0.03);
	
	double value;
	
	CentralHeating(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}
	
}
