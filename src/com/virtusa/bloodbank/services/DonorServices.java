package com.virtusa.bloodbank.services;

import java.sql.Date;
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
	
	public DonorDetail add(DonorDetail donor)
	{
		return ddao.add(donor);
	}
	
	public List<DonorDetail> findAll()
	{
		return ddao.findAll();
	}
	
	public DonorDetail findById(long donor_id) {
		return ddao.findById(donor_id);
	} 
	
	public long findID(String username)
	{
		return dao.findID(username);
	}
	
	public int update(String email,String phone_number,String address,Date prev_donate_date,long donor_id)
	{
		return ddao.update(email, phone_number, address, prev_donate_date, donor_id);
	}
}
