package com.herokuapp.prop3rty.domain;

public class Building extends AssetModel {
	private ThermalInsulation thermalInsulation;
	private Finishing finishing;
	private CentralHeating centralHeating;
	private FurnishedAndEquipped furnishedAndEquipped;

	public ThermalInsulation getThermalInsulation() {
		return thermalInsulation;
	}

	public void setThermalInsulation(ThermalInsulation thermalInsulation) {
		this.thermalInsulation = thermalInsulation;
	}

	public Finishing getFinishing() {
		return finishing;
	}

	public void setFinishing(Finishing finishing) {
		this.finishing = finishing;
	}

	public CentralHeating getCentralHeating() {
		return centralHeating;
	}

	public void setCentralHeating(CentralHeating centralHeating) {
		this.centralHeating = centralHeating;
	}

	public FurnishedAndEquipped getFurnishedAndEquipped() {
		return furnishedAndEquipped;
	}

	public void setFurnishedAndEquipped(FurnishedAndEquipped furnishedAndEquipped) {
		this.furnishedAndEquipped = furnishedAndEquipped;
	}

}
