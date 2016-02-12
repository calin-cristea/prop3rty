package com.herokuapp.prop3rty.dao.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.herokuapp.prop3rty.dao.UserDAO;
import com.herokuapp.prop3rty.domain.AssetModel;
import com.herokuapp.prop3rty.domain.AssetType;
import com.herokuapp.prop3rty.domain.User;
import com.herokuapp.prop3rty.domain.Zone;

@Repository
public class UserRepository implements UserDAO {

	private final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private JdbcTemplate jdbc;

	/*private RowMapper<AssetModel> assetMapper = new RowMapper<AssetModel>() {
		public AssetModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			AssetModel asset = new AssetModel();
			asset.setId(rs.getLong("id"));
			asset.setAssetType(AssetType.valueOf(rs.getString("asset").trim()));
			asset.setZone(Zone.valueOf(rs.getString("zone").trim()));
			asset.setPrice(rs.getInt("price"));
			return asset;
		}
	};*/

	@Override
	public Collection<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(User model) {
		String sql;
		//PreparedStatement ps;
		Object[] args = new Object[] { model.getEmail(), model.getPass(), model.getFirstName(), model.getLastName(),
				model.getPhone(), model.getRole().name() };
		if (model.getId() > 0) {
			sql = "update \"user\" set email=?, pass=?, firstname=?, lastname=?, phone=?, role = ? where id = ?";
			jdbc.update(sql, args, model.getId());
		} else {
			sql = "insert into \"user\" (email, pass, firstname, lastname, phone, role) values (?, ?, ?, ?, ?, ?)";
			jdbc.update(sql, args);
		}

		return model;
	}

	@Override
	public boolean delete(User model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<User> searchByName(String query) {
		// TODO Auto-generated method stub
		return null;
	}

}
