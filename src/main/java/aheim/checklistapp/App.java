package aheim.checklistapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.DatabaseConnection;
import dao.User;
import dao.UserDAO;
import dao.UserDAOImpl;

/**
 * examples, initializations, app start
 *
 */
public class App {
	public static void main(String[] args) throws SQLException {
		
		Connection connection = DatabaseConnection.getConnection();
		if (connection != null) {
			System.out.println("Connected!");
		}
		
		User user = new User("alex","password");
		System.out.println(user.toString());
		
		UserDAO userdao = new UserDAOImpl();
		
		User testuser = userdao.get(1);
		System.out.println("User with id=1 from database: "+testuser.toString());
		
		System.out.println(userdao.insert(user));
		
//		// testing database using jdbc connector
//		Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/checklistapp_schema", "root",
//				"admin");
//		
//		
//		Statement statement = connection.createStatement();
//		ResultSet resultSet = statement.executeQuery("SELECT * FROM USER");
//		while(resultSet.next()) {
//			System.out.println(resultSet.getString("name")+" \n"+resultSet.getString("id"));
//		}
	}
}
