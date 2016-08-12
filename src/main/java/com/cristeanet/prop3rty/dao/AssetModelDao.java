package com.cristeanet.prop3rty.dao;

import com.cristeanet.prop3rty.domain.AssetModel;

public interface AssetModelDao extends BaseDAO<AssetModel> {

	AssetModel getByAssetAndZone(AssetModel asset);
	
}
