package com.herokuapp.prop3rty.domain;

public enum Finishing {
	NONE(0.90), MEDIUM(1.00), HIGH(1.05), LUXURY(1.15);

	double value;

	Finishing(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

}
