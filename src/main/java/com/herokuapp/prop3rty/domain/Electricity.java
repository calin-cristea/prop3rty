package com.herokuapp.prop3rty.domain;

public enum Electricity {
	YES (0.00),
	NO (-0.03);
	
	double value;
	
	Electricity(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}
}