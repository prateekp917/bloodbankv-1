package com.virtusa.bloodbank.model;

import java.sql.Date;

public class BloodStock {
	
	int stock_id;
	String bloodtype;
	Date expdate;
	double hgb, rbc, wbc, platelets, mcv;
	int donor_id;
	int count;
	String  allergies;
	String bloodbank;
	String baddress;

	public BloodStock(int stock_id, String bloodtype, Date expdate) {
		super();
		this.stock_id = stock_id;
		this.bloodtype = bloodtype;
		this.expdate = expdate;
	}

	public BloodStock(String bloodtype, String bloodbank, String baddress) {
		super();
		//this.count=count;
		this.bloodtype = bloodtype;
		this.bloodbank = bloodbank;
		this.baddress = baddress;
	}
	
	public BloodStock(int sid, String bldtype, Date edate, double hgb2, double rbc2, double wbc2, double plts,
			double mcv2) {
		super();
		this.stock_id = sid;
		this.bloodtype = bldtype;
		this.expdate = edate;
		this.hgb = hgb2;
		this.rbc = rbc2;
		this.wbc = wbc2;
		this.platelets = plts;
		this.mcv = mcv2;
		
	}

	public BloodStock(int sid, String bldtype, Date edate, double hgb2, double rbc2, double wbc2, double plts,
			double mcv2, int did, String allergies2) {
		super();
		this.stock_id = sid;
		this.bloodtype = bldtype;
		this.expdate = edate;
		this.hgb = hgb2;
		this.rbc = rbc2;
		this.wbc = wbc2;
		this.platelets = plts;
		this.mcv = mcv2;
		this.donor_id = did;
		this.allergies = allergies2;
		}
	
	public BloodStock( String bloodtype, Date expdate, double hgb, double rbc, double wbc,
			double platelets, double mcv, int donor_id, String allergies) {
		super();
		//this.stock_id = stock_id;
		this.bloodtype = bloodtype;
		this.expdate = expdate;
		this.hgb = hgb;
		this.rbc = rbc;
		this.wbc = wbc;
		this.platelets = platelets;
		this.mcv = mcv;
		this.donor_id = donor_id;
		this.allergies = allergies;
	}	
	
	public String getBloodbank() {
		return bloodbank;
	}

	public void setBloodbank(String bloodbank) {
		this.bloodbank = bloodbank;
	}

	public String getBaddress() {
		return baddress;
	}

	public void setBaddress(String baddress) {
		this.baddress = baddress;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	public int getStock_id() {
		return stock_id;
	}
	public void setStock_id(int stock_id) {
		this.stock_id = stock_id;
	}
	public String getBloodtype() {
		return bloodtype;
	}
	public void setBloodtype(String bloodtype) {
		this.bloodtype = bloodtype;
	}
	public Date getExpdate() {
		return expdate;
	}
	public void setExpdate(Date expdate) {
		this.expdate = expdate;
	}
	public double getHgb() {
		return hgb;
	}
	public void setHgb(double hgb) {
		this.hgb = hgb;
	}
	public double getRbc() {
		return rbc;
	}
	public void setRbc(double rbc) {
		this.rbc = rbc;
	}
	public double getWbc() {
		return wbc;
	}
	public void setWbc(double wbc) {
		this.wbc = wbc;
	}
	public double getPlatelets() {
		return platelets;
	}
	public void setPlatelets(double platelets) {
		this.platelets = platelets;
	}
	public double getMcv() {
		return mcv;
	}
	public void setMcv(double mcv) {
		this.mcv = mcv;
	}
	public int getDonor_id() {
		return donor_id;
	}
	public void setDonor_id(int donor_id) {
		this.donor_id = donor_id;
	}
	public String getAllergies() {
		return allergies;
	}
	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	@Override
	public String toString() {
		return "BloodStock [stock_id=" + stock_id + ", bloodtype=" + bloodtype + ", expdate=" + expdate + ", hgb=" + hgb
				+ ", rbc=" + rbc + ", wbc=" + wbc + ", platelets=" + platelets + ", mcv=" + mcv + ", donor_id="
				+ donor_id + ", count=" + count + ", allergies=" + allergies + ", bloodbank=" + bloodbank
				+ ", baddress=" + baddress + "]";
	}
	
	
}
