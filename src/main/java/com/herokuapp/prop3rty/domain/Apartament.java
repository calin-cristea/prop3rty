package com.herokuapp.prop3rty.domain;

public class Apartament extends AbstractModel {
	private int surface;
	private boolean thermalInsulation;
	private double thermalInsulationValue;
	private boolean centralHeating;
	private double centralHeatingValue;
	private double basePrice;
	private double finalPrice;
	private Finishings finish;
	
	public double evaluate() {
		this.finalPrice = getBasePrice() * getSurface() * thermalInsulationValue(getThermalInsulation()) * centralHeatingValue(getCentralHeating()) * getFinish().value;
		return finalPrice;
		
	}
	
	public double thermalInsulationValue(boolean thermalInsulation) {
		if (thermalInsulation) {
			this.thermalInsulationValue = 0.03;
		}
		else {
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

	public void setThermalInsulation(boolean thermalInsulation) {
		this.thermalInsulation = thermalInsulation;
	}

	public boolean getThermalInsulation() {
		return thermalInsulation;
	}
	public double centralHeatingValue(boolean centralHeating) {
		if (centralHeating) {
			this.centralHeatingValue = 0.03;
		}
		else {
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
	//primit de la user
	public double getBasePrice() {
		return basePrice;
	}
	
	// primit de la user
	public int getSurface() {
		return surface;
	}

	public void setSurface(int surface) {
		this.surface = surface;
	}
}
