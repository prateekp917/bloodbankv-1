package com.virtusa.bloodbank;

import java.util.List;

import com.virtusa.bloodbank.model.DonorDetail;

public interface DonorDetailInterface {
	public List<DonorDetail> findAll();
	//public DonorDetail findById(long donor_id);
	public DonorDetail add(DonorDetail dd);
	//public void update(DonorDetail dd);
	//public boolean delete(long donor_id);
	//public void update(String blood_group, long donor_id);
}
