package com.virtusa.bloodbank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.virtusa.bloodbank.model.BBankDetails;
import com.virtusa.bloodbank.model.UsersList;

public class BBankDetailsDAO implements BBankDetailsInterface{
	private final String FindBname="select bank_name from bbankdetails where bankid=?";
	private final String FindAll="select * from bbankdetails";
	private static final Logger log=Logger.getRootLogger();
	private static final Connection connection=DBConnection.getConnection();
	@Override
	public List<BBankDetails> findAllDetails() {
		PreparedStatement pst=null;
		List<BBankDetails> list=new ArrayList<>();
		try
		{
			pst=connection.prepareStatement(FindAll);
			ResultSet resultset=pst.executeQuery();
			while(resultset.next())
			{
				long uid=resultset.getLong("bankid");
				String bname=resultset.getString("bank_name");
				String baddress=resultset.getString("bankaddress");
				BBankDetails b=new BBankDetails(uid,bname,baddress);
				System.out.println(b);
				list.add(b);
			}
		}
		catch(SQLException e)
		{
			log.error(e);
		}
		finally 
		{
			if(pst!=null)
				try {
					pst.close();
				}catch(SQLException e)
			{
					log.error(e);
			}
		}
		return list;
	}
	@Override
	public String findBankname(long bank_id) 
	{
		PreparedStatement pst=null;
		String bname=null;
		BBankDetails b=null;
		try {
			pst=connection.prepareStatement(FindBname);
			pst.setLong(1,bank_id);
			ResultSet resultset=pst.executeQuery();
			if(resultset.next())
			{
				//long bid=resultset.getLong("bankid");
				bname=resultset.getString("bank_name");
				//String baddress=resultset.getString("bankaddress");
				//b=new BBankDetails(bid,bname,baddress);
				log.trace(b);
			}
		}catch(SQLException e)
		{
			log.error(e);
			System.out.println(e.getMessage());
		}
		finally {
			if(pst!=null)
				try {
					pst.close();
				}catch(SQLException e)
			{
					log.error(e);
			}
		}
		return bname;
	}
}
