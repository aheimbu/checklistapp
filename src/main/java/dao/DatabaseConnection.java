package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * provides getConnection function for DB connection
 */
public class DatabaseConnection {

	private static Connection connection;
	private static String url = "jdbc:mysql://127.0.0.1:3306/checklistapp_schema";
	private static String username = "root";
	private static String password = "admin";

	// if no connection exists, get connection from mysql db
	public static Connection getConnection() throws SQLException {
		if (connection == null || connection.isClosed()) {
			connection = DriverManager.getConnection(url, username, password);
		}
		return connection;
	}
}