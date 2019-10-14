package com.virtusa.bloodbank.model;

public class UsersList {
	long user_id;
	String donor_name;
	String username;
	String password;
	String usertype;
	
	
	public UsersList(long user_id, String donor_name, String username, String usertype) {
		super();
		this.user_id = user_id;
		this.donor_name = donor_name;
		this.username = username;
		this.usertype = usertype;
	}
	public UsersList(long user_id,String username, String usertype) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.usertype = usertype;
	}
	/*public UsersList(long user_id, String username, String password, String usertype) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.usertype = usertype;
	}*/

	public UsersList(long user_id, String username) {
		super();
		this.user_id = user_id;
		this.username = username;
	}
	
	public UsersList(String username,String password, String usertype) {
		super();
		this.username = username;
		this.password=password;
		this.usertype = usertype;
	}

	public String getDonor_name() {
		return donor_name;
	}
	public void setDonor_name(String donor_name) {
		this.donor_name = donor_name;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	@Override
	public String toString() {
		return "UsersList [user_id=" + user_id + ", donor_name=" + donor_name + ", username=" + username + ", password="
				+ password + ", usertype=" + usertype + "]";
	}
	
}
