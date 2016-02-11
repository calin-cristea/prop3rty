package com.herokuapp.prop3rty.domain;

public class AssetModel extends AbstractModel {
	private Zone zone;
	private AssetType assetType;
	private int price;
	private double finalPrice;

	public AssetModel() {
	}

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	public AssetType getAssetType() {
		return assetType;
	}

	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	@Override
	public String toString() {
		return "AssetModel [zone=" + zone + ", assetType=" + assetType + ", price=" + price + ", finalPrice="
				+ finalPrice + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assetType == null) ? 0 : assetType.hashCode());
		long temp;
		temp = Double.doubleToLongBits(finalPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + price;
		result = prime * result + ((zone == null) ? 0 : zone.hashCode());
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
		AssetModel other = (AssetModel) obj;
		if (assetType != other.assetType)
			return false;
		if (Double.doubleToLongBits(finalPrice) != Double.doubleToLongBits(other.finalPrice))
			return false;
		if (price != other.price)
			return false;
		if (zone != other.zone)
			return false;
		return true;
	}

}
