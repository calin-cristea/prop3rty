package com.herokuapp.prop3rty.dao.db;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.herokuapp.prop3rty.dao.BasePriceDAO;
import com.herokuapp.prop3rty.domain.AssetModel;
import com.herokuapp.prop3rty.domain.BasePrice;

@Repository
public class BasePriceRepository implements BasePriceDAO {

	private final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private JdbcTemplate jdbc;

	public BasePrice getByAssetAndZone(AssetModel asset) {
		String sql = "SELECT * FROM baseprice WHERE asset = ? AND zone = ?";
		return jdbc.queryForObject(sql, BasePrice.class, asset.getAssetType().name(), asset.getZone());
	}

	@Override
	public Collection<AssetModel> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AssetModel getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AssetModel update(AssetModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(AssetModel model) {
		// TODO Auto-generated method stub
		return false;
	}

}
