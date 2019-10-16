package com.virtusa.bloodbank.services;

import java.util.List;

import com.virtusa.bloodbank.DonorDetailDAO;
import com.virtusa.bloodbank.DonorDetailInterface;
import com.virtusa.bloodbank.UsersListDAO;
import com.virtusa.bloodbank.UsersListDAOImpl;
import com.virtusa.bloodbank.model.DonorDetail;
import com.virtusa.bloodbank.model.UsersList;

public class DonorServices {
	UsersListDAO dao=new UsersListDAOImpl();
	DonorDetailInterface ddao=new DonorDetailDAO();
	public boolean checkLogin(String username,String password)
	{
		UsersList user=dao.findusername(username);
		if(user==null||user.getPassword().equals(password))
			return false;
		else return true;
	}
	
	public List<DonorDetail> findAll()
	{
		return ddao.findAll();
	}
	
	public DonorDetail add(DonorDetail donor) {
		return ddao.add(donor);
	} 
}
