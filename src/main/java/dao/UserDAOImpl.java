package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/*
 * user entity class with specifications from dao/userdao/ interface
 */
public class UserDAOImpl implements UserDAO{

	// if user exists in database return user
	@Override
	public User get(int id) throws SQLException {
		Connection connection = DatabaseConnection.getConnection();
		User user = null;
		String sql = "SELECT id, name, password FROM user WHERE id = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1,id);
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()) {
			String username = resultSet.getString("name");
			String password = resultSet.getString("password");
			user = new User(username,password);
		}
		connection.close();
		return user;
	}

	@Override
	public List<User> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	// if successful result = 1
	@Override
	public int insert(User user) throws SQLException {
		Connection connection = DatabaseConnection.getConnection();
		String sql = "INSERT INTO user (name, password) VALUES (?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1,user.getUsername());
		preparedStatement.setString(2,user.getPassword());
		int result = preparedStatement.executeUpdate();
		connection.close();
		return result;
	}

}
