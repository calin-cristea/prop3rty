package com.herokuapp.prop3rty.domain;

public class Apartaments extends BasePrices {
	private int area;
	private boolean thermalInsulation;
	private double thermalInsulationValue;
	private boolean centralHeating;
	private double centralHeatingValue;
	private double basePrice;
	private double finalPrice;
	private Finishings finish;

	public double evaluate() {
		this.finalPrice = getBasePrice() * getArea() * thermalInsulationValue(getThermalInsulation())
				* centralHeatingValue(getCentralHeating()) * getFinish().value;
		return finalPrice;

	}

	public double thermalInsulationValue(boolean thermalInsulation) {
		if (thermalInsulation) {
			this.thermalInsulationValue = 0.03;
		} else {
			this.thermalInsulationValue = -0.03;
		}
		return thermalInsulationValue;
	}

	public void setFinish(Finishings finish) {
		this.finish = finish;
	}

	public Finishings getFinish() {
		return finish;
	}

	public double centralHeatingValue(boolean centralHeating) {
		if (centralHeating) {
			this.centralHeatingValue = 0.03;
		} else {
			this.centralHeatingValue = -0.03;
		}
		return centralHeatingValue;
	}

	public boolean getCentralHeating() {
		return centralHeating;
	}

	public void setCentralHeating(boolean centralHeating) {
		this.centralHeating = centralHeating;
	}

	// primit de la user
	public double getBasePrice() {
		return basePrice;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getArea() {
		return area;
	}
}
