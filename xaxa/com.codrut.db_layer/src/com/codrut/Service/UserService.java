package com.codrut.Service;

import com.codrut.model.User;

public interface UserService {
	public boolean saveUser(User user);
	public boolean loginUser(String user,String password);
	public boolean addBalance(int value);
}
