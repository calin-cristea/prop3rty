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

import com.herokuapp.prop3rty.dao.UserDAO;
import com.herokuapp.prop3rty.domain.Role;
import com.herokuapp.prop3rty.domain.User;

@Repository
public class UserRepository implements UserDAO {

	private final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private JdbcTemplate jdbc;

	private RowMapper<User> userMapper = new RowMapper<User>() {
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setId(rs.getLong("id"));
			user.setEmail(rs.getString("email").trim());
			user.setFirstName(rs.getString("firstname"));
			user.setLastName(rs.getString("lastname"));
			user.setPhone(rs.getString("phone"));
			user.setRole(Role.valueOf(rs.getString("role").trim()));
			return user;
		}
	};

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
		boolean result = false;
		if (model.getId() > 0) {
			Object[] args = new Object[] { model.getId()};
			jdbc.update("DELETE FROM \"user\" WHERE id = ?", args);
			result = true;
		}
		return result;
	}

	@Override
	public User searchByEmail(String email) {
		String sql = "SELECT * FROM \"user\" WHERE email = ?";
		try {
			return jdbc.queryForObject(sql, userMapper, email);
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

}
