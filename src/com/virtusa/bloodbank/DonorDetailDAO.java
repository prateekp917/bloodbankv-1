package com.virtusa.bloodbank;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.virtusa.bloodbank.model.DonorDetail;
import com.virtusa.bloodbank.model.UsersList;

public class DonorDetailDAO implements DonorDetailInterface{
	private static final Logger log = Logger.getRootLogger();
	private Connection connection=DBConnection.getConnection();
	private final String FindByid="select * from DonorDetails where donor_id=?";
	private final String FindAll="select * from Donordetails";
	//private final
	private final String Add="insert into Donordetails (donor_name,date_of_birth,email,phone_number,address,gender,blood_group,aadhar_card_number, prev_donate_date) values(?,?,?,?,?,?,?,?,?)";
	private final String Update="update donordetails set email=?,phone_number=?,address=?,prev_donate_date=? where donor_id=?";
	private final String Delete="delete from Donordetails where donor_id=?";

	
	@Override
	public DonorDetail findById(long did) {
		// TODO Auto-generated method stub
		PreparedStatement pst=null;
		DonorDetail dd=null;
		try
		{
			pst=connection.prepareStatement(FindByid);
			pst.setLong(1,did);
			ResultSet rs=pst.executeQuery();

			if(rs.next())
			{
				long donor_id=rs.getLong("donor_id");
				String donor_name=rs.getString("donor_name");
				String email=rs.getString("email");
				Date dob=rs.getDate("date_of_birth");
				String phone_number=rs.getString("phone_number");
				String address=rs.getString("address");
				String gender=rs.getString("gender");
				String blood_group=rs.getString("blood_group");
				String aadhar_card_number=rs.getString("aadhar_card_number");
				Date prev_donate_date=rs.getDate("prev_donate_date");
				dd = new DonorDetail(donor_id,donor_name,dob,email,phone_number,address,gender,blood_group,aadhar_card_number,prev_donate_date);
				log.trace(dd);
			}
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());

			log.error(e);
		}
		finally {
			if(pst!=null)
				try {
					pst.close();
				}
			catch(SQLException e)
			{
				System.out.println(e.getMessage());
				log.error(e);
			}

		}

		return dd;
		}

	@Override
	public List<DonorDetail> findAll() {
		// TODO Auto-generated method stub
		PreparedStatement pst=null;
		List<DonorDetail> donordetail=new ArrayList<>();
		try
		{
		 	pst=connection.prepareStatement(FindAll);
		 	ResultSet rs=pst.executeQuery();
		 	while(rs.next())
		 	{
		 		long donor_id=rs.getLong("donor_id");
		 		String donor_name=rs.getString("donor_name");
		 		Date date_of_birth=rs.getDate("date_of_birth");
		 		String email=rs.getString("email");
		 		String phone_number=rs.getString("phone_number");
		 		String address=rs.getString("address");
		 		String gender=rs.getString("gender");
		 		String blood_group =rs.getString("blood_group");
		 		String aadhar_card_number=rs.getString("aadhar_card_number");
		 		Date prev_donate_date =rs.getDate("prev_donate_date");
		 		DonorDetail de=new DonorDetail(donor_id,donor_name,date_of_birth,email,phone_number,address,gender,blood_group,aadhar_card_number,prev_donate_date);
		 		donordetail.add(de);
		 	}
		 	return donordetail;
		 	
		}
		catch(SQLException e)
		{
			log.error(e);
			
			
		}
		finally {
			if(pst!=null)
				try {
					pst.close();
					
				}
			catch(SQLException e)
			{
				log.error(e);
			}
			

		}
		return null;
		
		}
		
	

	
	@Override
	public DonorDetail add(DonorDetail donor) {

		PreparedStatement pst = null;
		try
		{
			pst = connection.prepareStatement(Add);
			//System.out.println(dd.getAddress());
		    //pst.setLong(1, dd.getDonor_id());
		//System.out.println(dd.getDonor_name());
		    pst.setString(1, donor.getDonor_name());
			pst.setDate(2, donor.getDate_of_birth());
		    pst.setString(3, donor.getEmail());
			pst.setString(4, donor.getPhone_number());
		    pst.setString(5, donor.getAddress());
			pst.setString(6, donor.getGender());
		    pst.setString(7,donor.getBlood_group());
			pst.setString(8, donor.getAadhar_card_number());
			pst.setDate(9, donor.getPrev_donate_date());
			pst.executeUpdate();
			connection.commit();
			
			
		}
		catch(SQLException e)
		{
			log.error(e);
		}
		finally {
			if(pst!=null)
				try {
					pst.close();
				}
			catch(SQLException e)
			{
				log.error(e);
					//System.out.println(e.getMessage());

			}

			}
		return donor;
	}
			
	
		
	

	@Override
	public int update(String email,String phone_number,String address,Date prev_donate_date,long donor_id) {
		PreparedStatement pst=null;
		int rows=0;
        try
        {
        	pst=connection.prepareStatement(Update);
        	pst.setString(1,email);
        	pst.setString(2,phone_number);
        	pst.setString(3,address);
        	pst.setDate(4,prev_donate_date);
        	pst.setLong(5,donor_id);
		    rows=pst.executeUpdate();
		    System.out.println(rows);
		    //connection.commit();
		   
        }
        
        catch(SQLException e)
		{
			log.error(e);
			//System.out.println(e.getMessage());
		}
        
		finally {
			if(pst!=null)
				try {
					pst.close();
				}
			catch(SQLException e)
			{
					log.error(e);
					//System.out.println(e.getMessage());
				}
			

		}
		return rows;
		}
		// TODO Auto-generated method stub
		
	

	/*@Override
	public boolean delete(long donor_id) {
		PreparedStatement pst=null;
		
		try
		{
			pst=connection.prepareStatement(Delete);
			pst.setLong(1, donor_id);
			int rows=pst.executeUpdate();
			//connection.commit();
			if(rows!=1)
			{
				return false;
			}
			return true;
			}
		catch(SQLException e)
		{
			log.error(e);
			return false;
		}
		finally {
			if(pst!=null)
				try {
					pst.close();
				}
			catch(SQLException e)
			{
				log.error(e);
			}

		}
}*/
		
	
	public static void main(String[] args) {
		DonorDetailInterface ddao=new DonorDetailDAO();
		//int u=ddao.update("hellor@gmail.com","9807906970","canada",Date.valueOf("2013-08-03"),1001);`
		/*List<DonorDetail> uu=ddao.findAll();
		//System.out.println("size = " + users.size());
		for(DonorDetail u:uu)
		{
		System.out.println("aadhar: "+u.getAadhar_card_number()+"dob: "+u.getDate_of_birth()+"gender:"+u.getGender());
		}*/
		//DonorDetail d = dao.findById(1001);
		//List<DonorDetail> list=dao.findAll();
		//DonorDetail d=new DonorDetail("Raghu",Date.valueOf("1995-08-31"),"ragh75@gmail.com","7896756743","udipi","male","A+","738483987987",Date.valueOf("2013-10-04"));
	    //boolean b1 = ddao.add(d);
	   
		
		//dao.update("A+",1021);//to update
		//boolean bs=ddao.delete(1019);
		//if(bs==true)
		//	System.out.println("row deletion successful!!!");
		//log.debug(dao.findAll());
		
}
}
