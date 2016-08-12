package com.cristeanet.prop3rty.domain;

public class Apartment extends Building {

	private Floor floor;
	private boolean oldApt;

	public Apartment() {
		if (oldApt) {
			setAssetType(AssetType.old_apartment);
		}
		setAssetType(AssetType.new_apartment);
	}

	public Floor getFloor() {
		return floor;
	}

	public void setFloor(Floor floor) {
		this.floor = floor;
	}

	public boolean isOldApt() {
		return oldApt;
	}

	public void setOldApt(boolean oldApt) {
		this.oldApt = oldApt;
	}

	@Override
	public String toString() {
		return "Apartment [floor=" + floor + ", oldApt=" + oldApt + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((floor == null) ? 0 : floor.hashCode());
		result = prime * result + (oldApt ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apartment other = (Apartment) obj;
		if (floor != other.floor)
			return false;
		if (oldApt != other.oldApt)
			return false;
		return true;
	}

}
