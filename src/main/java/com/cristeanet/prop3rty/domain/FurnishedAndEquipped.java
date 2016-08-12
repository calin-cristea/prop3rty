package com.cristeanet.prop3rty.domain;

public enum FurnishedAndEquipped {
	NO_FURNISHED_EQUIPPED(0.80), NOR_FURNISHED_EQUIPPED(0.85), FURNISHED_EQUIPPED(1.00), LUX_FURNISHED_EQUIPPED(1.30);

	double value;

	private FurnishedAndEquipped(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

}
