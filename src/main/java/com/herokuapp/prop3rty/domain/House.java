package com.herokuapp.prop3rty.domain;

public class House extends Building {

	private Gas gas;
	private RunningWater runningWater;
	private Electricity electricity;
	private FinishingHouse finishingHouse;
	private int front;
	
	public House() {
		setAssetType(AssetType.house);
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

	public FinishingHouse getFinishingHouse() {
		return finishingHouse;
	}

	public void setFinishingHouse(FinishingHouse finishingHouse) {
		this.finishingHouse = finishingHouse;
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
		result = prime * result + ((finishingHouse == null) ? 0 : finishingHouse.hashCode());
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
		House other = (House) obj;
		if (electricity != other.electricity)
			return false;
		if (finishingHouse != other.finishingHouse)
			return false;
		if (front != other.front)
			return false;
		if (gas != other.gas)
			return false;
		if (runningWater != other.runningWater)
			return false;
		return true;
	}

}
