package com.herokuapp.prop3rty.domain;

public enum FinishingHouse {
	NONE(0.73), MEDIUM(0.90), HIGH(1.00), LUXURY(1.15);

	double value;

	FinishingHouse(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

}
