package com.herokuapp.prop3rty.domain;

public abstract class AssetModel extends AbstractModel {
	private Zone zone;
	private int area;

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
}
