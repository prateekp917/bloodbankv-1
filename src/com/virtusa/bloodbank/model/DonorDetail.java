package com.virtusa.bloodbank.model;

import java.sql.Date;

public class DonorDetail {
		long donor_id ;
		String donor_name;
		Date date_of_birth;
		String email; 
		String phone_number;
		String address;
		String gender;
		String blood_group;
		String aadhar_card_number;
		Date prev_donate_date;
		public DonorDetail() {
			super();
		}
		public DonorDetail(long donor_id, String donor_name, Date date_of_birth, String email, String phone_number,
				String address, String gender, String blood_group, String aadhar_card_number, Date prev_donate_date) {
			super();
			this.donor_id = donor_id;
			this.donor_name = donor_name;
			this.date_of_birth = date_of_birth;
			this.email = email;
			this.phone_number = phone_number;
			this.address = address;
			this.gender = gender;
			this.blood_group = blood_group;
			this.aadhar_card_number = aadhar_card_number;
			this.prev_donate_date = prev_donate_date;
		}
		
		public DonorDetail(String donor_name, Date date_of_birth, String email, String phone_number, String address,
				String gender, String blood_group, String aadhar_card_number, Date prev_donate_date) {
			super();
			this.donor_name = donor_name;
			this.date_of_birth = date_of_birth;
			this.email = email;
			this.phone_number = phone_number;
			this.address = address;
			this.gender = gender;
			this.blood_group = blood_group;
			this.aadhar_card_number = aadhar_card_number;
			this.prev_donate_date = prev_donate_date;
		}
		public long getDonor_id() {
			return donor_id;
		}
		public void setDonor_id(long donor_id) {
			this.donor_id = donor_id;
		}
		public String getDonor_name() {
			return donor_name;
		}
		public void setDonor_name(String donor_name) {
			this.donor_name = donor_name;
		}
		public Date getDate_of_birth() {
			return date_of_birth;
		}
		public void setDate_of_birth(Date date_of_birth) {
			this.date_of_birth = date_of_birth;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone_number() {
			return phone_number;
		}
		public void setPhone_number(String phone_number) {
			this.phone_number = phone_number;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getBlood_group() {
			return blood_group;
		}
		public void setBlood_group(String blood_group) {
			this.blood_group = blood_group;
		}
		public String getAadhar_card_number() {
			return aadhar_card_number;
		}
		public void setAadhar_card_number(String aadhar_card_number) {
			this.aadhar_card_number = aadhar_card_number;
		}
		public Date getPrev_donate_date() {
			return prev_donate_date;
		}
		public void setPrev_donate_date(Date prev_donate_date) {
			this.prev_donate_date = prev_donate_date;
		}
		
}
