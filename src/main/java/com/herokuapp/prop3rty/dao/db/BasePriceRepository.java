package com.herokuapp.prop3rty.dao.db;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.herokuapp.prop3rty.dao.BasePriceDAO;
import com.herokuapp.prop3rty.domain.AssetModel;

@Repository
public class BasePriceRepository implements BasePriceDAO {
	
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private JdbcTemplate jdbc;

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

	@Override
	public AssetModel getByAssetAndZone(String query) {
		// TODO Auto-generated method stub
		return null;
	}

}
