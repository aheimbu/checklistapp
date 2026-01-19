package dao;

import java.sql.Connection;
/*
 * generic DAO interface providing basic CRUD operations
 */
import java.sql.SQLException;
import java.util.List;

public interface DAO<T> {

	T getUserId(int id) throws SQLException;
	
	List<T> getAllUser() throws SQLException;
	
	int insertUser(T t) throws SQLException;
	
}
