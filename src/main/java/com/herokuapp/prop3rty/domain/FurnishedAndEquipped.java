package com.herokuapp.prop3rty.domain;

public enum FurnishedAndEquipped {
	NO_FURNISHED_EQUIPPED(-0.20), NOR_FURNISHED_EQUIPPED(-0.15), FURNISHED_EQUIPPED(0.00), LUX_FURNISHED_EQUIPPED(0.30);

	double value;

	private FurnishedAndEquipped(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

}
