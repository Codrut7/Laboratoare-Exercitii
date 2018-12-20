package com.codrut.model;

import java.sql.SQLException;

public interface UserDAO {
	public User getUser(int id) throws ClassNotFoundException, SQLException;
	public boolean saveUser(User user);
	public boolean loginUser(String user,String password);
	public boolean addBalance(int value);
}
