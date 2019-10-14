package com.virtusa.bloodbank.model;

public class DonorDetail {
		long donor_id ;
		String donor_name;
		String email; 
		String date_of_birth;
		long phone_number;
		String address;
		String gender;
		String blood_group;
		long aadhar_card_number;
		String  prev_donate_date;
		public DonorDetail(long donor_id,String donor_name, String date_of_birth,String email,long phone_number, String address, String gender,
				String blood_group, long aadhar_card_number,String prev_donate_date) {
			super();
			this.donor_id = donor_id;
			this.donor_name = donor_name;
			this.email = email;
			this.date_of_birth=date_of_birth;
			this.phone_number = phone_number;
			this.address = address;
			this.gender = gender;
			this.blood_group = blood_group;
			this.aadhar_card_number = aadhar_card_number;
			this.prev_donate_date=prev_donate_date;
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
		public String getEmail() {
			return email;
		}
		public void setdate_of_birth(String date_of_birth) {
			this.date_of_birth = date_of_birth;
		}
		public String get_date_of_birth() {
			return date_of_birth;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getPhone_number() {
			return phone_number;
		}
		public void setPhone_number(long phone_number) {
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
		public long getAadhar_card_number() {
			return aadhar_card_number;
		}
		public void setAadhar_card_number(long aadhar_card_number) {
			this.aadhar_card_number = aadhar_card_number;
		}
		public String getPrev_donate_date() {
			return prev_donate_date;
		}
		public void setPrev_donate_date(String prev_donate_date) {
			this.prev_donate_date = prev_donate_date;
		}
}
