package com.herokuapp.prop3rty.domain;

public enum RunningWater {
	YES (0.00),
	NO (-0.03);
	
	double value;
	
	RunningWater(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}
}