package com.codrut.Service;

import com.codrut.model.User;

public interface AdminService {
	
	public boolean deleteUser(User user);
	public boolean changeBalance(int value);
	
}
