package com.herokuapp.prop3rty.dao.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class RepoConnection {
	
	private String host;
	private String port;
	private String dbName;
	private String dbUser;
	private String dbPass;

	public RepoConnection(String host, String port, String dbName, String dbUser, String dbPass) {
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
}
