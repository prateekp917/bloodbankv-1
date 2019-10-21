package com.virtusa.bloodbank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.virtusa.bloodbank.model.UsersList;

public class UsersListDAOImpl implements UsersListDAO {

	private static final Logger log=Logger.getRootLogger();
	private static final Connection connection=DBConnection.getConnection();
	//private final String findallusers2="select u.user_id,u.username,u.usertype,d.donor_name from UsersList u left join donordetails d on u.user_id=d.donor_id";
	//private final String findallusers="select user_id, username, usertype, donor_name from UsersList inner join donordetails where UsersList.user_id=donordetails.donor_id";
	private final String findid="select user_id from UsersList where username=?";
	private final String findall="select user_id,username,usertype from UsersList";
	private final String updateuser="update UsersList set username=?,password=?";
	private final String adduser="insert into UsersList(username,password,usertype) values(?,?,?)";
	private final String deleteuser="delete from UsersList where userid='?'";
	private final String findbyusername="select * from UsersList where username=?";


	/*@Override
	public List<UsersList> findAllUsers() {
		PreparedStatement pst=null;
		List<UsersList> users=new ArrayList<>();
		try
		{
			pst=connection.prepareStatement(findallusers);
			ResultSet resultset=pst.executeQuery();
			while(resultset.next())
			{
				long uid=resultset.getLong("user_id");
				String username=resultset.getString("username");
				String usertype=resultset.getString("usertype");
				String donor_name=resultset.getString("donor_name");
				UsersList u=new UsersList(uid,donor_name,username,usertype);
				users.add(u);
			}
		}
		catch(SQLException e)
		{
			log.error(e);
			return null;
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
		return users;
	}*/
	
	@Override
	public long findID(String username) {
		PreparedStatement pst=null;
		UsersList u=null;
		try {
			pst=connection.prepareStatement(findid);
			pst.setString(1,username);
			ResultSet resultset=pst.executeQuery();
			if(resultset.next())
			{
				long uid1=resultset.getLong("user_id");
				//String uname=resultset.getString("username");
				//String utype=resultset.getString("usertype");
				u=new UsersList(uid1);
				log.trace(u);
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
		return u.getUser_id();
	}

	@Override
	public List<UsersList> findAll() {
		PreparedStatement pst=null;
		List<UsersList> users=new ArrayList<>();
		try
		{
			pst=connection.prepareStatement(findall);
			ResultSet resultset=pst.executeQuery();
			while(resultset.next())
			{
				long uid=resultset.getLong("user_id");
				String username=resultset.getString("username");
				String usertype=resultset.getString("usertype");
				UsersList u=new UsersList(uid,username,usertype);
				System.out.println(u);
				users.add(u);
			}
			//return users;
		}
		catch(SQLException e)
		{
			log.error(e);
			//return null;
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
		return users;
	}

	/*@Override
	public UsersList update(UsersList user) {
		PreparedStatement pst=null;
		try {
			pst=connection.prepareStatement(updateuser);
			pst.setString(1,user.getUsername());
			pst.setString(2, user.getPassword());
			pst.executeUpdate();
			connection.commit();
			return user;
		}
		catch(Exception e)
		{
			log.error(e);
			return null;
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
	}*/

	@Override
	public UsersList add(UsersList user) {
		PreparedStatement pst=null;
		try {
			pst=connection.prepareStatement(adduser);
			//pst.setLong(1, user.getUser_id());
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			pst.setString(3, user.getUsertype());
			pst.executeUpdate();
			connection.commit();
			return user;
		}
		catch(Exception e)
		{
			log.error(e);
			return null;
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
	}

	/*@Override
	public boolean delete(UsersList user) {
		PreparedStatement pst=null;
		try 
		{
			pst=connection.prepareStatement(deleteuser);
			pst.setLong(1, user.getUser_id());
			int rows=pst.executeUpdate();
			connection.commit();
			if(rows!=1)return false;
			else return true;
		}
		catch(SQLException e)
		{
			log.error(e);
			return false;
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
	}*/
	@Override
	public UsersList findusername(String username) {
		PreparedStatement pst=null;
		UsersList u=null;
		try {
			pst=connection.prepareStatement(findbyusername);
			pst.setString(1,username);
			ResultSet resultset=pst.executeQuery();
			if(resultset.next())
			{
				String uname=resultset.getString("username");
				String upassword=resultset.getString("password");
				String utype=resultset.getString("usertype");
				u=new UsersList(uname,upassword,utype);
				log.trace(u);
			}
		}catch(SQLException e)
		{
			log.error(e);
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
		return u;
	}
	
	public static void main(String[] args) {
		UsersListDAO dao=new UsersListDAOImpl();
		/*List<UsersList> users=dao.findAll();
		//System.out.println("size = " + users.size());
		for(UsersList u:users)
		{
		System.out.println("id: "+u.getUser_id()+"username: "+u.getUsername()+"usertype:"+u.getUsertype());
		}*/
		//UsersList u=dao.findByID("SandhyaS");
		//System.out.println(u.getUser_id());
		//UsersList user=new UsersList("HEllo","HELLo","Donor");
		//dao.add(user);
	}

}
