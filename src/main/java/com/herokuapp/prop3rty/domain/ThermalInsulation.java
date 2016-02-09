package com.herokuapp.prop3rty.domain;

public enum ThermalInsulation {
	YES (0.03),
	NO (-0.03);
	
	double value;
	
	ThermalInsulation(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}
}
