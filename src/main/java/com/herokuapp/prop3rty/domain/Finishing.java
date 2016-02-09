package com.herokuapp.prop3rty.domain;

public enum Finishing {
	NONE(-0.10), MEDIUM(0.00), HIGH(0.05), LUXURY(0.15);

	double value;

	Finishing(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

}
