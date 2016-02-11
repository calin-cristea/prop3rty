package com.herokuapp.prop3rty.domain;

public enum Floor {
	P (0.85),
	I (0.95),
	II (1.00),
	III (0.95),
	IV (0.85);
	
	double value;
	
	Floor(double value) {
		this.value = value;
	}
}
