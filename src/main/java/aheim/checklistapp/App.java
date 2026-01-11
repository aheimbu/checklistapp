package aheim.checklistapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws SQLException {
		
		// testing database using jdbc connector
		Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/checklistapp_schema", "root",
				"admin");
		
		
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM USER");
		while(resultSet.next()) {
			System.out.println(resultSet.getString("name")+" \n"+resultSet.getString("id"));
		}
	}
}
