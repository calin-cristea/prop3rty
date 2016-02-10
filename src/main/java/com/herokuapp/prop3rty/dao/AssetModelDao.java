package com.herokuapp.prop3rty.dao;

import com.herokuapp.prop3rty.domain.AssetModel;

public interface AssetModelDao extends BaseDAO<AssetModel> {

	AssetModel getByAssetAndZone(AssetModel asset);
	
}
