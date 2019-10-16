package com.virtusa.bloodbank.services;

import java.util.List;

import com.virtusa.bloodbank.model.BloodStock;
import com.virtusa.bloodbank.BloodStockInterface;
import com.virtusa.bloodbank.BloodStockDao;
import com.virtusa.bloodbank.UsersListDAO;
import com.virtusa.bloodbank.UsersListDAOImpl;
import com.virtusa.bloodbank.model.UsersList;

public class HospitalBloodbankService {
	BloodStockInterface bdao=new BloodStockDao();
	UsersListDAO dao=new UsersListDAOImpl();
	
	public boolean checkLogin(String username,String password)
	{
		UsersList user=dao.findusername(username);
		if(user==null||user.getPassword().equals(password))
			return false;
		else return true;
	}
	
	public List<BloodStock> findAll()
	{
		return bdao.findAll();
	}
	
	public List<BloodStock> findBldtype(String bloodtype)
	{
		return bdao.findBldtype(bloodtype);
	}
	
	public List<BloodStock> findstockbbank(String bbankname)
	{
		return bdao.findstockbbank(bbankname);
	}
	
}
