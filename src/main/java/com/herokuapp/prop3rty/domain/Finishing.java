package com.herokuapp.prop3rty.domain;

public enum Finishing {
	NONE(0.90, "Nefinisat"), MEDIUM(1.00, "Finisat"), HIGH(1.05, "Ultra finisat"), LUXURY(1.15, "Finisaj de lux");

	private double value;
	private String finn;

	Finishing(double value, String finn) {
		this.value = value;
		this.finn = finn;
	}

	public double getValue() {
		return value;
	}

	public String getFinn() {
		return finn;
	}

}
