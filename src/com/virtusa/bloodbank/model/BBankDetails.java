package com.virtusa.bloodbank.model;

public class BBankDetails {
	long bankid;
	String bankname;
	String blocation;
	public BBankDetails(long bankid, String bankname, String blocation) {
		super();
		this.bankid = bankid;
		this.bankname = bankname;
		this.blocation = blocation;
	}
	public long getBankid() {
		return bankid;
	}
	public void setBankid(long bankid) {
		this.bankid = bankid;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getBlocation() {
		return blocation;
	}
	public void setBlocation(String blocation) {
		this.blocation = blocation;
	}
	
}
