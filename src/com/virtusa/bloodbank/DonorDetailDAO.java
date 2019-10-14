package com.virtusa.bloodbank;

import java.sql.Connection;
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
	//private final String FindByid="select donor_id, donor_name,email,phone_number,address,gender,blood_group,aadhar_card_number, prev_donate_date from DonorDetails where donor_id=?";
	private final String FindAll="select * from Donordetails";
	private final String Add="insert into Donordetails (donor_name,date_of_birth,email,phone_number,address,gender,blood_group,aadhar_card_number, prev_donate_date) values(?,?,?,?,?,?,?,?,?)";
	private final String Update="update Donordetails set blood_group=? where donor_id=?";
	private final String Delete="delete from Donordetails where donor_id=?";

	
	/*@Override
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
				long phone_number=rs.getLong("phone_number");
				String address=rs.getString("address");
				String gender=rs.getString("gender");
				String blood_group=rs.getString("blood_group");
				long aadhar_card_number=rs.getLong("aadhar_card_number");
				String prev_donate_date=rs.getString("prev_donate_date");
				dd = new DonorDetail(donor_id,donor_name,email,phone_number,address,gender,blood_group,aadhar_card_number,prev_donate_date);
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


		
	*/


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
		 		String date_of_birth=rs.getString("date_of_birth");
		 		String email=rs.getString("email");
		 		long phone_number=rs.getLong("phone_number");
		 		String address=rs.getString("address");
		 		String gender=rs.getString("gender");
		 		String blood_group =rs.getString("blood_group");
		 		long aadhar_card_number=rs.getLong("aadhar_card_number");
		 		String prev_donate_date =rs.getString("prev_donate_date");
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
		
	

	
	/*@Override
	public boolean add(DonorDetail dd) {

		PreparedStatement pst = null;
		int b=0;
		try
		{
			pst = connection.prepareStatement(Add);
			//System.out.println(dd.getAddress());
		    //pst.setLong(1, dd.getDonor_id());
		//System.out.println(dd.getDonor_name());
		    pst.setString(1, dd.getDonor_name());
			pst.setString(2, dd.get_date_of_birth());
		    pst.setString(3, dd.getEmail());
			pst.setLong(4, dd.getPhone_number());
		    pst.setString(5, dd.getAddress());
			pst.setString(6, dd.getGender());
		    pst.setString(7,dd.getBlood_group());
			pst.setLong(8, dd.getAadhar_card_number());
			pst.setString(9, dd.getPrev_donate_date());
			b = pst.executeUpdate();
			System.out.println(b);
			//connection.commit();
		    
		
			/*String keysql="select donor_id.currval from dual";
			Statement stmt=connection.createStatement();
			boolean rsAvailable=stmt.execute(keysql);
			long idGenerated=0;
			if(rsAvailable)
			{
				ResultSet generatedKeyRs=stmt.getResultSet();
				generatedKeyRs.next();
				idGenerated=generatedKeyRs.getLong(1);
				//dd.setDonor_id(idGenerated);
			}
			
		}
		catch(SQLException e)
		{
			log.error(e);
			//return null;
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
		if(b!=0) {
	    	return true;
	    }
	    else {
	    	return false;}

	}

		
		
	

	@Override
	public void update(String blood_group, long donor_id) {
		PreparedStatement pst=null;
        try
        {
        	pst=connection.prepareStatement(Update);
        	pst.setString(1, blood_group);
        	pst.setLong(2, donor_id);
			
		    pst.executeUpdate();
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

		
		}
		// TODO Auto-generated method stub
		
	

	@Override
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
		List<DonorDetail> uu=ddao.findAll();
		//System.out.println("size = " + users.size());
		for(DonorDetail u:uu)
		{
		System.out.println("aadhar: "+u.getAadhar_card_number()+"email: "+u.getEmail()+"gender:"+u.getGender());
		}
		//DonorDetail d = dao.findById(1001);
		//List<DonorDetail> list=dao.findAll();
		/*DonorDetail d=new DonorDetail("Raghu","1995-08-31","ragh75@gmail.com",7896,"udipi","male","A+",738483987,"2013-10-04");
	    boolean b1 = dao.add(d);
	    if(b1==true)
		System.out.println("added");
	    else
	    	System.out.println("not added");
		
		//dao.update("A+",1021);//to update
		boolean bs=dao.delete(1019);
		if(bs==true)
			System.out.println("row deletion successful!!!");*/
		//log.debug(dao.findAll());
		
}
}
