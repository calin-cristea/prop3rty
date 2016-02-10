package com.herokuapp.prop3rty.dao.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.herokuapp.prop3rty.dao.AssetModelDao;
import com.herokuapp.prop3rty.domain.AssetModel;
import com.herokuapp.prop3rty.domain.AssetType;
import com.herokuapp.prop3rty.domain.Zone;

@Repository
public class AssetModelRepository implements AssetModelDao {

	private final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private JdbcTemplate jdbc;

	/*
	 * private AssetModel extractAssetModel(ResultSet rs) throws SQLException {
	 * AssetModel asset = new AssetModel(); asset.setId(rs.getLong("id"));
	 * asset.setAssetType(AssetType.valueOf(rs.getString("asset")));
	 * asset.setZone(Zone.valueOf(rs.getString("zone")));
	 * asset.setPrice(rs.getInt("price")); return asset;
	 * 
	 * }
	 */

	private RowMapper<AssetModel> assetMapper = new RowMapper<AssetModel>() {
		public AssetModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			AssetModel asset = new AssetModel();
			asset.setId(rs.getLong("id"));
			asset.setAssetType(AssetType.valueOf(rs.getString("asset").trim()));
			asset.setZone(Zone.valueOf(rs.getString("zone").trim()));
			asset.setPrice(rs.getInt("price"));
			return asset;
		}
	};

	public AssetModel getByAssetAndZone(AssetModel asset) {
		String sql = "SELECT * FROM baseprice WHERE asset = ? AND zone = ?";
		try {
			return jdbc.queryForObject(sql, assetMapper, asset.getAssetType().name(), asset.getZone().name());
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
		// jdbc.query
		// return jdbc.queryForObject(sql, AssetModel.class,
		// asset.getAssetType().name(), asset.getZone().name());
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
