package com.virtusa.bloodbank;

import java.util.List;

import com.virtusa.bloodbank.model.UsersList;

public interface UsersListDAO {
	public long findID(String username);
	UsersList findusername(String username);
	List<UsersList> findAll();
	//List<UsersList> findAllUsers();
	//UsersList update(UsersList user);
	UsersList add(UsersList user);
	//boolean delete(UsersList user);
}
