package com.herokuapp.prop3rty.dao;

import com.herokuapp.prop3rty.domain.AssetModel;

public interface BasePriceDAO extends BaseDAO<AssetModel> {

	AssetModel getByAssetAndZone(String query);
}
