package com.herokuapp.prop3rty.domain;

public class Building extends AssetModel {

	private ThermalInsulation thermalInsulation;
	private Finishing finishing;
	private CentralHeating centralHeating;
	private FurnishedAndEquipped furnishedAndEquipped;
	private int area;

	public ThermalInsulation getThermalInsulation() {
		if (thermalInsulation == null) {
			thermalInsulation = ThermalInsulation.NO;
		}
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
		if (centralHeating == null) {
			centralHeating = CentralHeating.NO;
		}
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

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Building [thermalInsulation=" + thermalInsulation + ", finishing=" + finishing + ", centralHeating="
				+ centralHeating + ", furnishedAndEquipped=" + furnishedAndEquipped + ", area=" + area + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + area;
		result = prime * result + ((centralHeating == null) ? 0 : centralHeating.hashCode());
		result = prime * result + ((finishing == null) ? 0 : finishing.hashCode());
		result = prime * result + ((furnishedAndEquipped == null) ? 0 : furnishedAndEquipped.hashCode());
		result = prime * result + ((thermalInsulation == null) ? 0 : thermalInsulation.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Building other = (Building) obj;
		if (area != other.area)
			return false;
		if (centralHeating != other.centralHeating)
			return false;
		if (finishing != other.finishing)
			return false;
		if (furnishedAndEquipped != other.furnishedAndEquipped)
			return false;
		if (thermalInsulation != other.thermalInsulation)
			return false;
		return true;
	}

}
