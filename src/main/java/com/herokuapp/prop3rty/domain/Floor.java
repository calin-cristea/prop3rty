package com.herokuapp.prop3rty.domain;

public enum Floor {
	P (-0.15),
	I (-0.05),
	II (0.00),
	III (-0.05),
	IV (-0.15);
	
	double value;
	
	Floor(double value) {
		this.value = value;
	}
}
