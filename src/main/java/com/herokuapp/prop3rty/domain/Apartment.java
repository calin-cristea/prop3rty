package com.herokuapp.prop3rty.domain;

public class Apartment extends Building {

	private Floor floor;
	private boolean oldApt;

	public Apartment() {
		if (oldApt) {
			setAssetType(AssetType.OLD_APARTMENT);
		}
		setAssetType(AssetType.NEW_APARTMENT);
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

}
