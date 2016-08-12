package com.cristeanet.prop3rty.domain;

public class Land extends AssetModel {
	
	private Gas gas;
	private RunningWater runningWater;
	private Electricity electricity;
	private int front;
	private Building landBuilding = new Building();

	public Land() {
		setAssetType(AssetType.land);
	}

	public Gas getGas() {
		return gas;
	}

	public void setGas(Gas gas) {
		this.gas = gas;
	}

	public RunningWater getRunningWater() {
		return runningWater;
	}

	public void setRunningWater(RunningWater runningWater) {
		this.runningWater = runningWater;
	}

	public Electricity getElectricity() {
		return electricity;
	}

	public void setElectricity(Electricity electricity) {
		this.electricity = electricity;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((electricity == null) ? 0 : electricity.hashCode());
		result = prime * result + front;
		result = prime * result + ((gas == null) ? 0 : gas.hashCode());
		result = prime * result + ((runningWater == null) ? 0 : runningWater.hashCode());
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
		Land other = (Land) obj;
		if (electricity != other.electricity)
			return false;
		if (front != other.front)
			return false;
		if (gas != other.gas)
			return false;
		if (runningWater != other.runningWater)
			return false;
		return true;
	}

	public Building getLandBuilding() {
		return landBuilding;
	}

	public void setLandBuilding(Building landBuilding) {
		this.landBuilding = landBuilding;
	}

}
