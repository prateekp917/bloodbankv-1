package com.virtusa.bloodbank;

import java.sql.Date;
import java.util.List;

import com.virtusa.bloodbank.model.DonorDetail;

public interface DonorDetailInterface {
	public List<DonorDetail> findAll();
	public DonorDetail findById(long donor_id);
	public DonorDetail add(DonorDetail donor);
	//public DonorDetail add(DonorDetail dd);
	public int update(String email,String phone_number,String address,Date prev_donate_date,long donor_id);
	//public boolean delete(long donor_id);
	//public void update(String blood_group, long donor_id);
}
