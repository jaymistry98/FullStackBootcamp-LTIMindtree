package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionInit {

	private static Connection conn;

	public static Connection loadConnection() {

		try {
			// Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			// Establish the connection
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ltidb?serverTimezone=UTC", "root",
					"root123");

		} catch (Exception e) {

		}
		return conn;

	}

}
