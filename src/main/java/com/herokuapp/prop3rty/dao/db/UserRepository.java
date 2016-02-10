package com.herokuapp.prop3rty.dao.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import com.herokuapp.prop3rty.dao.UserDAO;
import com.herokuapp.prop3rty.domain.Role;
import com.herokuapp.prop3rty.domain.User;

public abstract class UserRepository implements UserDAO {

	private String host;
	private String port;
	private String dbName;
	private String dbUser;
	private String dbPass;

	public UserRepository(String host, String port, String dbName, String dbUser, String dbPass) {
		this.host = host;
		this.port = port;
		this.dbName = dbName;
		this.dbUser = dbUser;
		this.dbPass = dbPass;
	}

	protected Connection newConnection() {
		try {
			Class.forName("org.postgresql.Driver").newInstance();

			String url = new StringBuilder().append("jdbc:").append("postgresql").append("://").append(host).append(":")
					.append(port).append("/").append(dbName).append("?user=").append(dbUser).append("&password=")
					.append(dbPass).toString();
			Connection result = DriverManager.getConnection(url);
			result.setAutoCommit(false);

			return result;
		} catch (Exception ex) {
			throw new RuntimeException("Error getting DB connection", ex);
		}

	}

	private User extractUser(ResultSet rs) throws SQLException {
		User user = new User();
		user.setId(rs.getLong("id"));
		user.setEmail(rs.getString("email"));
		user.setPass(rs.getString("pass"));
		user.setFirstName(rs.getString("firstname"));
		user.setLastName(rs.getString("lastname"));
		user.setPhone(rs.getString("phone"));
		user.setRole(Role.valueOf(rs.getString("role")));
		return user;

	}

	@Override
	public Collection<User> getAll() {
		Connection connection = newConnection();

		Collection<User> result = new LinkedList<>();

		try (ResultSet rs = connection.createStatement().executeQuery("select * from 'user'")) {

			while (rs.next()) {
				result.add(extractUser(rs));
			}
			connection.commit();
		} catch (SQLException ex) {

			throw new RuntimeException("Error getting users.", ex);
		} finally {
			try {
				connection.close();
			} catch (Exception ex) {

			}
		}

		return result;
	}

	@Override
	public User getById(Long id) {
		Connection connection = newConnection();

		List<User> result = new LinkedList<>();

		try (ResultSet rs = connection.createStatement().executeQuery("select * from 'user' where id = " + id)) {

			while (rs.next()) {
				result.add(extractUser(rs));
			}
			connection.commit();
		} catch (SQLException ex) {

			throw new RuntimeException("Error getting users.", ex);
		} finally {
			try {
				connection.close();
			} catch (Exception ex) {

			}
		}

		if (result.size() > 1) {
			throw new IllegalStateException("Multiple Users for id: " + id);
		}
		return result.isEmpty() ? null : result.get(0);
	}

	@Override
	public User update(User model) {
		Connection connection = newConnection();
		try {
			PreparedStatement ps = null;
			if (model.getId() > 0) {
				ps = connection.prepareStatement(
						"update \"user\" set email=?, pass=?, firstname=?, lastname=?, phone=?, role = ? "
								+ "where id = ? returning id");

			} else {

				ps = connection.prepareStatement("insert into \"user\" (email, pass, firstname, lastname, phone, role) "
						+ "values (?, ?, ?, ?, ?, ?) returning id");

			}
			ps.setString(1, model.getEmail());
			ps.setString(2, model.getPass());
			ps.setString(3, model.getFirstName());
			ps.setString(4, model.getLastName());
			ps.setString(5, model.getPhone());
			ps.setString(6, model.getRole().name());

			if (model.getId() > 0) {
				ps.setLong(7, model.getId());
			}

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				model.setId(rs.getLong(1));
			}
			rs.close();

			connection.commit();

		} catch (SQLException ex) {

			throw new RuntimeException("Error getting users.", ex);
		} finally {
			try {
				connection.close();
			} catch (Exception ex) {

			}
		}

		return model;

	}

	@Override
	public boolean delete(User model) {
		boolean result = false;
		Connection connection = newConnection();
		try {
			Statement statement = connection.createStatement();
			result = statement.execute("delete from \"user\" where id = " + model.getId());
			connection.commit();
		} catch (SQLException ex) {

			throw new RuntimeException("Error updating users.", ex);
		} finally {
			try {
				connection.close();
			} catch (Exception ex) {

			}
		}
		return result;
	}

	@Override
	public Collection<User> searchByName(String query) {
		if (query == null) {
			query = "";
		} else {
			query = query.trim();
		}

		Connection connection = newConnection();

		Collection<User> result = new LinkedList<>();

		try (ResultSet rs = connection.createStatement()
				.executeQuery("select * from \"user\" where lower(firstname || ' ' || lastname) like '%"
						+ query.toLowerCase() + "%'")) {

			while (rs.next()) {
				result.add(extractUser(rs));
			}
			connection.commit();
		} catch (SQLException ex) {

			throw new RuntimeException("Error getting users.", ex);
		}

		return result;
	}

}
