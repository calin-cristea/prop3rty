package com.herokuapp.prop3rty.domain;

public enum Floor {
	P (0.90),
	I (0.95),
	II (1.00),
	III (0.95),
	IV (0.85),
	V (0.92),
	VI (0.95),
	VII (0.92),
	VIII (0.89),
	IX (0.89),
	X (0.86),
	XI (0.83),
	XII (0.87);
	
	double value;
	
	Floor(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}
}
