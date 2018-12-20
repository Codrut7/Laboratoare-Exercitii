package com.codrut.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.codrut.db_layer.connection.DatabaseConnection;
import com.codrut.model.User;
import com.codrut.model.UserDAO;

public class UserDAOImpl implements UserDAO {

	@Override
	public boolean saveUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean loginUser(String user, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addBalance(int value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUser(int id) throws ClassNotFoundException, SQLException {
		Connection connection = DatabaseConnection.getInstance().getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		String query = "SELECT * FROM User WHERE id = ?";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, id);
		resultSet = preparedStatement.executeQuery();
		resultSet.next();
		return new User(resultSet.getLong("id"),resultSet.getString("userName"),resultSet.getString("password"),resultSet.getString("email"),resultSet.getInt("balance"));
		
	}

}
