package com.cristeanet.prop3rty.domain;

public enum Gas {
	YES (0.00),
	NO (-0.05);
	
	double value;
	
	Gas(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}
}
