package com.herokuapp.prop3rty.domain;

public enum ThermalInsulation {
	YES (1.03),
	NO (0.97);
	
	double value;
	
	ThermalInsulation(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}
}
