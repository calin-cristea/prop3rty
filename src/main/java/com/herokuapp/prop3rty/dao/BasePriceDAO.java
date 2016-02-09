package com.herokuapp.prop3rty.dao;

import com.herokuapp.prop3rty.domain.AssetModel;
import com.herokuapp.prop3rty.domain.BasePrice;

public interface BasePriceDAO extends BaseDAO<AssetModel> {

	BasePrice getByAssetAndZone(AssetModel asset);
	
}
