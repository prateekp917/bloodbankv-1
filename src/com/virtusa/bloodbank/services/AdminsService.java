package com.virtusa.bloodbank.services;

import java.util.List;

import com.virtusa.bloodbank.UsersListDAO;
import com.virtusa.bloodbank.UsersListDAOImpl;
import com.virtusa.bloodbank.model.UsersList;

public class AdminsService {
	UsersListDAO dao=new UsersListDAOImpl();
	public boolean checkLogin(String username,String password)
	{
		UsersList user=dao.findusername(username);
		if(user==null||user.getPassword().equals(password))
			return false;
		else return true;
	}
	
	public List<UsersList> findAll()
	{
		return dao.findAll();
	}
	
	public UsersList add(UsersList user) {
		return dao.add(user);
	}
}
