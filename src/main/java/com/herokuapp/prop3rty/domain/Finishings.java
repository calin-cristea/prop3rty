package com.herokuapp.prop3rty.domain;

public enum Finishings {
	NON (-0.10),
	MEDIUM (0.00),
	HIGH (0.05),
	LUXURY (0.15);
	
	double value;
	
	Finishings(double value) {
		this.value = value;
	}
	
}
