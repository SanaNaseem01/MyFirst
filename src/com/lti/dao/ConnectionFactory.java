package com.lti.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";// driver 4; xe is the sid of the oracle sql
																			// developer
	private static final String USER = "hr";
	private static final String PASS = "hr";
	private static Connection connection = null;

	public static Connection getConnection() {// Connection is an interface
		try {
			connection = DriverManager.getConnection(URL, USER, PASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // sql exception is checked exception
		return connection;
	}

	/*
	 * public static void main(String[] args) { if (getConnection() != null) {
	 * System.out.println("Connected"); } else {
	 * System.out.println("Not Connected"); } }
	 */

}
