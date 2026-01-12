package dao;

import java.sql.Connection;
/*
 * generic DAO interface providing basic CRUD operations
 */
import java.sql.SQLException;
import java.util.List;

public interface DAO<T> {

	T get(int id) throws SQLException;
	
	List<T> getAll() throws SQLException;
	
	int insert(T t) throws SQLException;
	
}
